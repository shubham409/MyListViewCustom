package com.example.listviewcustom;

public class MyData {
    String str;
    int resource;
    MyData(String str,int resource)
    {
        this.str=str;
        this.resource=resource;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
}
