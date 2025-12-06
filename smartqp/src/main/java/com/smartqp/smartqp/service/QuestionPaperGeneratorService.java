package com.smartqp.smartqp.service;

import com.smartqp.smartqp.dao.QuestionDAO;
import com.smartqp.smartqp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;



    @Service
public class QuestionPaperGeneratorService {

    @Autowired
    private QuestionDAO questionDAO;

    public List<Question> generateExamStylePaper(String subjectCode, String examType) throws Exception {
        List<Question> paper = new ArrayList<>();
        Random random = new Random();

        int endModule = examType.equalsIgnoreCase("internal") ? 3 : 5;

        for (int module = 1; module <= endModule; module++) {

            int chosenSet = random.nextBoolean() ? 1 : 2;   // either set 1 or set 2
            List<Question> moduleQuestions =
                    questionDAO.getQuestionsForModule(subjectCode, module, chosenSet);

            // internal: module 3 only A and B (5+5)
            if (examType.equalsIgnoreCase("internal") && module == 3) {
                moduleQuestions.removeIf(q -> q.getPart().equalsIgnoreCase("c"));
            }

            for (Question q : moduleQuestions) {
                q.setModuleNo(module);
                q.setSetNo(chosenSet);
            }
            paper.addAll(moduleQuestions);
        }

        return paper;
    }
}

