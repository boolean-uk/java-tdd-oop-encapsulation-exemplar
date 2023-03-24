package com.booleanuk.core;

public class Battery {

    private String type;
    private int charge;
  
    public Battery (String type) {
        this.charge = 100;
        this.setType(type);
    }

    public void setType (String newType) {
        this.type = newType;
    }

    public String getType () {
        return this.type;
    }

     public int getCharge () {
        return this.charge;
    }


}
