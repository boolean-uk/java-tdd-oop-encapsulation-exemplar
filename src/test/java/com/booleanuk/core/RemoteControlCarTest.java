package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoteControlCarTest {

    @Test
    void testGetColour() {
        RemoteControlCar car = new RemoteControlCar("Red", new Battery("Rechargeable"), new Controller("Simple"));
        Assertions.assertEquals("Red", car.getColour());
    }

    @Test
    void testSetBattery() {
        RemoteControlCar car = new RemoteControlCar("Red", new Battery("Rechargeable"), new Controller("Simple"));
        Battery battery = new Battery("Rechargeable");
        car.setBattery(battery);
        Assertions.assertEquals(battery, car.getBattery());
    }

    @Test
    void testGetBattery() {
        Battery battery = new Battery("Disposable");
        RemoteControlCar car = new RemoteControlCar("Red", battery, new Controller("Simple"));
        Assertions.assertEquals(battery, car.getBattery());
    }

    @Test
    void testSetController() {
        RemoteControlCar car = new RemoteControlCar("Red", new Battery("Rechargeable"), new Controller("Simple"));
        Controller controller = new Controller("Advanced");
        car.setController(controller);
        Assertions.assertEquals(controller, car.getController());
    }

    @Test
    void testGetController() {
        Controller controller = new Controller("Advanced");
        RemoteControlCar car = new RemoteControlCar("Red", new Battery("Rechargeable"), controller);
        Assertions.assertEquals(controller, car.getController());
    }

    @Test
    void testChangeControllerType() {
        RemoteControlCar car = new RemoteControlCar("Red", new Battery("Rechargeable"), new Controller("Simple"));
        car.changeControllerType();
        Assertions.assertEquals("Advanced", car.getController().getType());
    }

    @Test
    void testChangeBatteryType() {
        RemoteControlCar car = new RemoteControlCar("Red", new Battery("Rechargeable"), new Controller("Simple"));
        car.changeBatteryType();
        Assertions.assertEquals("Disposable", car.getBattery().getType());
    }

    @Test
    void testCheckBatteryLevel() {
        RemoteControlCar car = new RemoteControlCar("Red", new Battery("Rechargeable"), new Controller("Simple"));
        Assertions.assertEquals(100, car.checkBatteryLevel());
    }

    @Test
    void testReplaceBattery() {
        RemoteControlCar car = new RemoteControlCar("Red", new Battery("Rechargeable"), new Controller("Simple"));
        Battery battery = new Battery("Simple");
        car.replaceBattery(battery);
        Assertions.assertEquals(battery, car.getBattery());
    }
}