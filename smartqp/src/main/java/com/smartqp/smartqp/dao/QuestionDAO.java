package com.smartqp.smartqp.dao;

import com.smartqp.smartqp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionDAO {

    @Autowired
    private DataSource dataSource;

    public List<Question> getQuestionsForModule(String subjectCode, int moduleNo, int setNo)
            throws Exception {
        List<Question> list = new ArrayList<>();
        String sql = "SELECT * FROM questions " +
                     "WHERE subject_code=? AND module_no=? AND set_no=? " +
                     "ORDER BY part";

        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, subjectCode);
            ps.setInt(2, moduleNo);
            ps.setInt(3, setNo);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Question q = mapRowToQuestion(rs);
                list.add(q);
            }
        }
        return list;
    }

    private Question mapRowToQuestion(ResultSet rs) throws SQLException {
        Question q = new Question();
        q.setQuestionId(rs.getInt("question_id"));
        q.setSubjectId(rs.getInt("subject_id"));
        q.setChapterId(rs.getInt("chapter_id"));
        q.setQuestionText(rs.getString("question_text"));
        q.setDifficulty(rs.getString("difficulty"));
        q.setMarks(rs.getInt("marks"));
        q.setQuestionType(rs.getString("question_type"));
        q.setSubjectCode(rs.getString("subject_code"));
        q.setModuleNo(rs.getInt("module_no"));
        q.setPart(rs.getString("part"));
        q.setSetNo(rs.getInt("set_no"));
        return q;
    }
}
