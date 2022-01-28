package com.example.readers.taolun.tlt.gd;

import org.litepal.crud.DataSupport;

public class GdData extends DataSupport {
    private int idgd;
    private String commentgd;

    public GdData(String commentgd) {
        this.commentgd = commentgd;
    }

    public GdData() {

    }


    public int getIdgd(){
        return idgd;
    }

    public void setIdgd(int id){
        this.idgd = idgd;
    }

    public String getCommentgd(){
        return commentgd;
    }

    public void setCommentgd(String commentgd){
        this.commentgd = commentgd;
    }


}