package com.pantouveris.panagiotis.timokatalogosdikastikwnepimelhtwn;

import java.util.ArrayList;

/**
 * Created by Panagiotis on 18-Nov-15.
 */
public class AreaCategory
{
    private String name;
    private ArrayList <Area> areaList = new ArrayList<Area>();


    public AreaCategory(String name, ArrayList<Area> areaList)
    {
        this.name = name;
        this.areaList = areaList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(ArrayList<Area> areaList) {
        this.areaList = areaList;
    }
}
