package com.booleanuk.core;

public class RemoteControlCar {
    private String colour;
    private Battery battery;
    private Controller controller;

    public RemoteControlCar (String colour, Battery battery, Controller controller) {
      this.colour = colour;
      this.setBattery(battery);
      this.setController(controller);
    }

    public String getColour () {
        return this.colour;
    }

    public void setBattery (Battery newBattery) {
        this.battery = newBattery;
    }

    public Battery getBattery () {
        return this.battery;
    }

    public void setController (Controller newController) {
        this.controller = newController;
    }

    public Controller getController () {
        return this.controller;
    }

    public boolean changeControllerType() {
        if (this.controller.getType().equals("Simple")) {
            this.setController(new Controller("Advanced"));
        } else {
            this.setController(new Controller("Simple"));
        }
        return true;
    }

    public boolean changeBatteryType() {
        if (this.battery.getType().equals("Rechargeable")) {
            this.setBattery(new Battery("Disposable"));
        } else {
            this.setBattery(new Battery("Rechargeable"));
        }
        return true;
    }

    public int checkBatteryLevel() {
        return this.battery.getCharge();
    }


    public boolean replaceBattery(Battery newBattery) {
      this.setBattery(newBattery);
      return true;
    }

    public boolean moveForward(int distance) {
      return false;
    }

    public boolean moveBackward(int distance) {
      return false;
    }

    public boolean turnLeft(int amountToTurn) {
      return false;
    }

    public boolean turnRight(int amountToTurn) {
      return false;
    }

    public boolean stop() {
      return false;
    }
}
