package com.example.readers.comment.szbf;

import org.litepal.crud.DataSupport;

public class SzbfData extends DataSupport {
    private int idsz;
    private String commentsz;

    public SzbfData(String commentsz) {
        this.commentsz = commentsz;
    }

    public SzbfData() {

    }


    public int getIdsz(){
        return idsz;
    }

    public void setIdsz(int id){
        this.idsz = idsz;
    }

    public String getCommentsz(){
        return commentsz;
    }

    public void setCommentsz(String commentsz){
        this.commentsz = commentsz;
    }
}
