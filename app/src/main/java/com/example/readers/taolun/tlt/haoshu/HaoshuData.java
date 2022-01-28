package com.example.readers.taolun.tlt.haoshu;

import org.litepal.crud.DataSupport;

public class HaoshuData extends DataSupport {
    private int idhs;
    private String commenths;

    public HaoshuData(String commenths) {
        this.commenths = commenths;
    }

    public HaoshuData() {

    }


    public int getIdhs(){
        return idhs;
    }

    public void setIdhs(int id){
        this.idhs = idhs;
    }

    public String getCommenths(){
        return commenths;
    }

    public void setCommenths(String commenths){
        this.commenths = commenths;
    }


}
