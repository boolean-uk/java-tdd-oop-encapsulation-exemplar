package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ControllerTest {

    @Test
    void testSetType() {
        Controller controller = new Controller("Advanced");
        controller.setType("Simple");
        Assertions.assertEquals("Simple", controller.getType());
    }

    @Test
    void testGetType() {
        Controller controller = new Controller("Advanced");
        Assertions.assertEquals("Advanced", controller.getType());
    }

    // Skipping testing the other methods as they are just there for completeness
}