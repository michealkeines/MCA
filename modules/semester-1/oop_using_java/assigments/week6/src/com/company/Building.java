package com.company;

// A Building class with –
//    Attributes – name, building code, location, number of floors and total area.
//    Methods - This class must implement a method that prints all building details. (How will you achieve this?).

public class Building {
    private String name;
    private String buildingCode;
    private String location;
    private int numberOfFloors;
    private double totalArea;

    public Building(String name, String buildingCode, String location, int numberOfFloors, double totalArea) {
        this.name = name;
        this.buildingCode = buildingCode;
        this.location = location;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public void printValues() {
        System.out.println("Building:");
        System.out.println("Name: "+ this.name);
        System.out.println("Building Code: "+ this.buildingCode);
        System.out.println("Location: "+ this.location);
        System.out.println("Number of Floors: "+ this.numberOfFloors);
        System.out.println("Total Area: "+this.totalArea);
    }
}
