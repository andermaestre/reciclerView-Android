package com.example.recilerview;

import android.graphics.drawable.Drawable;

public class AndroidVersion {
    String name;
    String version;
    int api;
    int year;
    public int drawableId;

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }

    public AndroidVersion(String name, String version, int api, int year, int dwbl) {
        this.name = name;
        this.version = version;
        this.api = api;
        this.year = year;
        this.drawableId=dwbl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getApi() {
        return api;
    }

    public void setApi(int api) {
        this.api = api;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

