package com.booleanuk.core;

public class Controller {

    private String type;

    public Controller (String type) {
        this.setType(type);
    }

    public void setType (String newType) {
        this.type = newType;
    }

    public String getType () {
        return this.type;
    }
/*
The controller would be responsible for generating signals to make the car move etc
But as it stands there would need to be some reference to the car to make it so that these methods
could call corresponding methods in that class.
When dealing with hardware we often have some sort of signal/listener pattern or a call back system
that would let us trigger the resulting movements when these get called.
 */
    public boolean moveForward() {
        return false;
    }

    public boolean moveBackward() {
        return false;
    }

    public boolean turnLeft() {
        return false;
    }

    public boolean turnRight()
    {
      return false;
    }

    public boolean stop()
    {
      return false;
    }

}
