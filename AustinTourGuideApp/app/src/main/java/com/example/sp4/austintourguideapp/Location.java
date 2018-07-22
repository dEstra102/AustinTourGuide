package com.example.sp4.austintourguideapp;

public class Location {
    private String name;
    private String description;
    private String address;

    public Location(String name, String description, String address){
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
//        String output = getName() + "\n";
//        output+= getDescription() +"\n";
//        output+= getAddress() +"\n";

        String output = getName() + "\n"+
                getDescription() +"\n" +
                getAddress() +"\n";
        return output;
    }
}
