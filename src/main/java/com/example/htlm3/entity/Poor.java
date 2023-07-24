package main.java.com.example.htlm3.entity;

import java.util.Date;

public class Poor {
    public int id;
    public  String name;
    public String PoorLevel;
    public Date FilingTime;
    public String FamilySituation;

    public Poor(int id, String name, String poorLevel, Date filingTime, String familySituation) {
        this.id = id;
        this.name = name;
        PoorLevel = poorLevel;
        FilingTime = filingTime;
        FamilySituation = familySituation;
    }
    public Poor(){

    }
    public Poor(String name, String poorLevel, String familySituation) {
        this.name = name;
        PoorLevel = poorLevel;
        FamilySituation = familySituation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoorLevel() {
        return PoorLevel;
    }

    public void setPoorLevel(String poorLevel) {
        PoorLevel = poorLevel;
    }

    public Date getFilingTime() {
        return FilingTime;
    }

    public void setFilingTime(Date filingTime) {
        FilingTime = filingTime;
    }

    public String getFamilySituation() {
        return FamilySituation;
    }

    public void setFamilySituation(String familySituation) {
        FamilySituation = familySituation;
    }
}
