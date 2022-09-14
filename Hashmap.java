package com.company;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords() {
        logininfo.put("Filip","Filip12");
        logininfo.put("Taca","Taca12");
        logininfo.put("Maca","Maca12");

    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}


