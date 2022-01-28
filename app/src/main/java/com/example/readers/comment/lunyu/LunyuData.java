package com.example.readers.comment.lunyu;

import org.litepal.crud.DataSupport;

public class LunyuData extends DataSupport {
    private int idly;
    private String commently;

    public LunyuData(String commently) {
        this.commently = commently;
    }

    public LunyuData() {

    }

    public int getIdly(){
        return idly;
    }

    public void setIdly(int id){
        this.idly = idly;
    }

    public String getCommently(){
        return commently;
    }

    public void setCommently(String commently){
        this.commently = commently;
    }
}
