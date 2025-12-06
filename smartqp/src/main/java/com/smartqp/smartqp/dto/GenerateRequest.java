package com.smartqp.smartqp.dto;

public class GenerateRequest {
    private int subjectId;
    private int easyMarks;
    private int mediumMarks;

    public int getSubjectId() { return subjectId; }
    public void setSubjectId(int subjectId) { this.subjectId = subjectId; }

    public int getEasyMarks() { return easyMarks; }
    public void setEasyMarks(int easyMarks) { this.easyMarks = easyMarks; }

    public int getMediumMarks() { return mediumMarks; }
    public void setMediumMarks(int mediumMarks) { this.mediumMarks = mediumMarks; }

    private int hardMarks;

public int getHardMarks() { return hardMarks; }
public void setHardMarks(int hardMarks) { this.hardMarks = hardMarks; }

}
