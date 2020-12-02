package com.example.demo06.bean;

public class Subject {
    String subject;
    Integer grades;
    Integer idSubjects;
    Integer idsubstu;
    public String getSubject() {
        return subject;
    }

    public Integer getIdSubjects() {
        return idSubjects;
    }

    public Integer getGrades() {
        return grades;
    }

    public void setGrades(Integer grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject='" + subject + '\'' +
                ", idSubjects=" + idSubjects +
                '}';
    }

    public void setIdSubjects(Integer idSubjects) {
        this.idSubjects = idSubjects;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getIdsubstu() {
        return idsubstu;
    }

    public void setIdsubstu(Integer idsubstu) {
        this.idsubstu = idsubstu;
    }
}
