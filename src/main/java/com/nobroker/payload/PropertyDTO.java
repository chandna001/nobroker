package com.nobroker.payload;

public class PropertyDTO {
    private Long id;
    private String apartmentType;
    private String bhkType;
    private int floor;
    private int totalFloor;
    private int propertyAge;
    private String facing;
    private double builtUpArea;
    private String status;

    public PropertyDTO() {
        // Default constructor
    }

    public PropertyDTO(Long id, String apartmentType, String bhkType, int floor, int totalFloor, int propertyAge, String facing, double builtUpArea, String status) {
        this.id = id;
        this.apartmentType = apartmentType;
        this.bhkType = bhkType;
        this.floor = floor;
        this.totalFloor = totalFloor;
        this.propertyAge = propertyAge;
        this.facing = facing;
        this.builtUpArea = builtUpArea;
        this.status = status;
    }

    // Getters and setters for each field

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    public String getBhkType() {
        return bhkType;
    }

    public void setBhkType(String bhkType) {
        this.bhkType = bhkType;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(int totalFloor) {
        this.totalFloor = totalFloor;
    }

    public int getPropertyAge() {
        return propertyAge;
    }

    public void setPropertyAge(int propertyAge) {
        this.propertyAge = propertyAge;
    }

    public String getFacing() {
        return facing;
    }

    public void setFacing(String facing) {
        this.facing = facing;
    }

    public double getBuiltUpArea() {
        return builtUpArea;
    }

    public void setBuiltUpArea(double builtUpArea) {
        this.builtUpArea = builtUpArea;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}