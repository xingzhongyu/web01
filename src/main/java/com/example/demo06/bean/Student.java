package com.example.demo06.bean;

import java.util.List;

public class Student {

    Integer idstudents;
    String studentname;
    String studentpassword;
    String xuehao;
    List<Achieve> achieves;
    List<Subject> subjects;
    Integer choosen;

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public Integer getChoosen() {
        return choosen;
    }

    public void setChoosen(Integer choosen) {
        this.choosen = choosen;
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
