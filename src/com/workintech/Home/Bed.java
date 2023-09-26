package com.workintech.Home;

public class Bed {
    private String pillows;
    private String height;
    private String sheets;
    private String quilt;

    public Bed(String pillows, String height, String sheets, String quilt) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make(){
        System.out.println("The bed is being made");
    }

    public String getPillows() {
        return pillows;
    }

    public String getHeight() {
        return height;
    }

    public String getSheets() {
        return sheets;
    }

    public String getQuilt() {
        return quilt;
    }
}
