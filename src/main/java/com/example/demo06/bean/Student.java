package com.example.demo06.bean;

import java.util.List;

public class Student {

    Integer idstudents;
    String studentname;
    String studentpassword;
    String xueHao;
    List<Achieve> achieves;
    List<Subject> subjects;
    Integer choosen;

    @Override
    public String toString() {
        return "Student{" +
                "idstudents=" + idstudents +
                ", studentname='" + studentname + '\'' +
                ", studentpassword='" + studentpassword + '\'' +
                ", xueHao='" + xueHao + '\'' +
                ", achieves=" + achieves +
                ", subjects=" + subjects +
                ", choosen=" + choosen +
                '}';
    }

    public Integer getChoosen() {
        return choosen;
    }

    public void setChoosen(Integer choosen) {
        this.choosen = choosen;
    }

    public String getXueHao() {
        return xueHao;
    }

    public void setXueHao(String xueHao) {
        this.xueHao = xueHao;
    }

    public List<Achieve> getAchieves() {
        return achieves;
    }

    public void setAchieves(List<Achieve> achieves) {
        this.achieves = achieves;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getStudentname() {
        return studentname;
    }




    public Integer getIdstudents() {
        return idstudents;
    }

    public void setIdstudents(Integer idstudents) {
        this.idstudents = idstudents;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }


}
