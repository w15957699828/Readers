package com.example.readers.taolun.tlt.xd;

import org.litepal.crud.DataSupport;

public class XdData extends DataSupport {
    private int idxd;
    private String commentxd;

    public XdData(String commentxd) {
        this.commentxd = commentxd;
    }

    public XdData() {

    }


    public int getIdxd(){
        return idxd;
    }

    public void setIdxd(int id){
        this.idxd = idxd;
    }

    public String getCommentxd(){
        return commentxd;
    }

    public void setCommentxd(String commentxd){
        this.commentxd = commentxd;
    }


}
