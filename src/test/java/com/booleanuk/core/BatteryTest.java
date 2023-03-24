package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BatteryTest {
    @Test
    void testSetType() {
        Battery battery = new Battery("Rechargeable");
        battery.setType("Disposable");
        Assertions.assertEquals("Disposable", battery.getType());
    }

    @Test
    void testGetType() {
        Battery battery = new Battery("Rechargeable");
        Assertions.assertEquals("Rechargeable", battery.getType());
    }

    @Test
    void testGetCharge() {
        Battery battery = new Battery("Rechargeable");
        Assertions.assertEquals(100, battery.getCharge());
    }
}