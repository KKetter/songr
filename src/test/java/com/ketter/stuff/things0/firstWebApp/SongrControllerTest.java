package com.ketter.stuff.things0.firstWebApp;

import org.junit.Test;

import static org.junit.Assert.*;

public class SongrControllerTest {

    @Test
    public void songrCapitalize() {
        String inputToCapitalize = "wow";
        String capitalize = inputToCapitalize.toUpperCase();
        assertEquals("WOW", capitalize);
    }
}