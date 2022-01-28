package com.example.readers.comment.szj;

import org.litepal.crud.DataSupport;

public class SzjData extends DataSupport {
    private int ids;
    private String comments;

    public SzjData(String comments) {
        this.comments = comments;
    }

    public SzjData() {

    }


    public int getIds(){
        return ids;
    }

    public void setIds(int id){
        this.ids = ids;
    }

    public String getComments(){
        return comments;
    }

    public void setComments(String comments){
        this.comments = comments;
    }
}
