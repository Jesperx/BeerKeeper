package com.jesper.beerkeeper;
import java.util.List;
import java.util.ArrayList;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Mods");
        }
        else{
            brands.add("Stout");
            brands.add("Kate");
        }
        return brands;
    }
}