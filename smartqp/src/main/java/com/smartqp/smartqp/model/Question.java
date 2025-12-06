package com.smartqp.smartqp.model;

public class Question {
    private int questionId;
    private int subjectId;
    private int chapterId;
    private String questionText;
    private String difficulty;
    private int marks;
    private String questionType;
    private String subjectCode;      // NEW
    private int moduleNo;            // NEW
    private String part;             // NEW
    private int setNo;               // NEW

    // Getters and Setters
    public int getQuestionId() { return questionId; }
    public void setQuestionId(int questionId) { this.questionId = questionId; }

    public int getSubjectId() { return subjectId; }
    public void setSubjectId(int subjectId) { this.subjectId = subjectId; }

    public int getChapterId() { return chapterId; }
    public void setChapterId(int chapterId) { this.chapterId = chapterId; }

    public String getQuestionText() { return questionText; }
    public void setQuestionText(String questionText) { this.questionText = questionText; }

    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    public String getQuestionType() { return questionType; }
    public void setQuestionType(String questionType) { this.questionType = questionType; }

    public String getSubjectCode() { return subjectCode; }
    public void setSubjectCode(String subjectCode) { this.subjectCode = subjectCode; }

    public int getModuleNo() { return moduleNo; }
    public void setModuleNo(int moduleNo) { this.moduleNo = moduleNo; }

    public String getPart() { return part; }
    public void setPart(String part) { this.part = part; }

    public int getSetNo() { return setNo; }
    public void setSetNo(int setNo) { this.setNo = setNo; }
}
