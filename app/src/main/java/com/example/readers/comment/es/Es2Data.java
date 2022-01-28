package com.example.readers.comment.es;

import org.litepal.crud.DataSupport;

public class Es2Data extends DataSupport {
    private int ide;
    private String commentes;

    public Es2Data(String commentes) {
        this.commentes = commentes;
    }

    public Es2Data() {

    }


    public int getIde(){
        return ide;
    }

    public void setIde(int id){
        this.ide = ide;
    }

    public String getCommentes(){
        return commentes;
    }

    public void setCommentes(String commentes){
        this.commentes = commentes;
    }
}
