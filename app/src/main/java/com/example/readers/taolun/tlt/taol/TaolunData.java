package com.example.readers.taolun.tlt.taol;

import org.litepal.crud.DataSupport;

public class TaolunData extends DataSupport {
    private int idtl;
    private String commenttl;

    public TaolunData(String commenttl) {
        this.commenttl = commenttl;
    }

    public TaolunData() {

    }


    public int getIdtl(){
        return idtl;
    }

    public void setIdtl(int id){
        this.idtl = idtl;
    }

    public String getCommenttl(){
        return commenttl;
    }

    public void setCommenttl(String commenttl){
        this.commenttl = commenttl;
    }
}
