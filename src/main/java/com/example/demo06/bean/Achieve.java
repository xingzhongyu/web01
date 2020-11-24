package com.example.demo06.bean;

public class Achieve {
    String achieve;
    Integer idAchieves;

    public String getAchieve() {
        return achieve;
    }

    public Integer getIdAchieves() {
        return idAchieves;
    }

    @Override
    public String toString() {
        return "Achieve{" +
                "achieve='" + achieve + '\'' +
                ", idAchieves=" + idAchieves +
                '}';
    }

    public void setIdAchieves(Integer idAchieves) {
        this.idAchieves = idAchieves;
    }

    public void setAchieve(String achieve) {
        this.achieve = achieve;
    }


}
