package com.example.readers.comment.ddj;

import org.litepal.crud.DataSupport;

public class DdjData extends DataSupport {
    private int idd;
    private String commentd;

    public DdjData(String commentd) {
        this.commentd = commentd;
    }

    public DdjData() {

    }


    public int getIdd(){
        return idd;
    }

    public void setIdd(int id){
        this.idd = idd;
    }

    public String getCommentd(){
        return commentd;
    }

    public void setCommentd(String commentd){
        this.commentd = commentd;
    }
}
