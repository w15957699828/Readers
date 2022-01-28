package com.example.readers.gl;

import org.litepal.crud.DataSupport;

public class gl_Data extends DataSupport {
    private String GLname;
    private String GLpassword;

    public String getGLname() {
        return GLname;
    }

    public void setGLname(String username) {
        this.GLname = username;
    }

    public String getGLPassword() {
        return GLpassword;
    }

    public void setGLPassword(String password) {
        this.GLpassword = password;
    }
}
