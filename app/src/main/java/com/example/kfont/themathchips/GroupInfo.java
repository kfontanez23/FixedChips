package com.example.kfont.themathchips;

/**
 * Created by Yeury on 11/30/2016.
 */

import java.util.ArrayList;

public class GroupInfo {

    private String name;
    private ArrayList<com.example.kfont.themathchips.ChildInfo> list = new ArrayList<com.example.kfont.themathchips.ChildInfo>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<com.example.kfont.themathchips.ChildInfo> getProductList() {
        return list;
    }

    public void setProductList(ArrayList<com.example.kfont.themathchips.ChildInfo> productList) {
        this.list = productList;
    }

}