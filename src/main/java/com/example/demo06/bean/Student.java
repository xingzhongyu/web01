package com.example.demo06.bean;

import java.util.List;

public class Student {
    String math;
    String english;
    Integer idstudents;
    String studentname;
    String studentpassword;
    String chinese;
    String xueHao;
    List<Achieve> achieves;
    List<Subject> subjects;

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
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


    @Override
    public String toString() {
        return "Student{" +
                "idstudents=" + idstudents +
                ", studentname='" + studentname + '\'' +
                ", studentpassword='" + studentpassword + '\'' +
                ", chinese='" + chinese + '\'' +
                ", math='" + math + '\'' +
                ", english='" + english + '\'' +
                ", xueHao='" + xueHao + '\'' +
                ", achieves=" + achieves +
                ", subjects=" + subjects +
                '}';
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
