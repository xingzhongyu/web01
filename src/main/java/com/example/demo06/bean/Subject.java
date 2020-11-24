package com.example.demo06.bean;

public class Subject {
    String subject;
    Integer idSubjects;

    public String getSubject() {
        return subject;
    }

    public Integer getIdSubjects() {
        return idSubjects;
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


}
