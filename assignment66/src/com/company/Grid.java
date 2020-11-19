package com.company;

public class Grid extends Accessories {
    private int gridLength;
 private String name;
    public Grid( int price, int gridLength) {
        super( price);
        this.gridLength = gridLength;
    }

    public int getGridLength() {
        return gridLength;
    }

    public void setGridLength(int gridLength) {
        this.gridLength = gridLength;
    }

    @Override
    public String toString() {
        return super.toString()+ "Grid{" +
                "gridLength=" + gridLength +
                '}';
    }

    @Override
    public String use() {
        return "Grid is used to hang on the Animals on aquarium";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
}
