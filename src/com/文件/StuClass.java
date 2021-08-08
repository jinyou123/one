package com.文件;


import java.io.Serializable;

public class StuClass implements Serializable {
    private  int cid;
    private  String cname;

    public  StuClass (){

    }

    public StuClass(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "StuClass{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
