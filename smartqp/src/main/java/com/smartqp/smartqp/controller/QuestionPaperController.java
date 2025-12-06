package com.smartqp.smartqp.controller;

import com.smartqp.smartqp.model.Question;
import com.smartqp.smartqp.service.QuestionPaperGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/papers")
public class QuestionPaperController {

    @Autowired
    private QuestionPaperGeneratorService generatorService;
@PostMapping("/generate-exam-style")
public List<Question> generateExamStyle(@RequestBody Map<String, String> request) throws Exception {
    String subjectCode = request.get("subjectCode");
    String examType = request.get("examType");
    return generatorService.generateExamStylePaper(subjectCode, examType);
}



    }

