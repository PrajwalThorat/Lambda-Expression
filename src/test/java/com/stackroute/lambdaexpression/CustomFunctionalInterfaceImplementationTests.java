package com.stackroute.lambdaexpression;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/* Write test cases for positive and negative scenarios*/
public class CustomFunctionalInterfaceImplementationTests {
    CustomFunctionalInterfaceImplementation custom;
    @BeforeEach
    public void setup(){
        custom=new CustomFunctionalInterfaceImplementation();
    }

    @Test
    void caseSensitiveTest(){
        custom.caseSensitive("SiRiShA");
        assertEquals("sIrIsHa",custom.getWord());
    }
    @Test
    void caseSensitiveTestAllCapital(){
        custom.caseSensitive("SIRISHA");
        assertEquals("sirisha",custom.getWord());
    }

    @Test
    void caseSensitiveTestAllSmall(){
        custom.caseSensitive("sirisha");
        assertEquals("SIRISHA",custom.getWord());
    }

    @Test
    void caseSensitiveTestEmptyString(){
        custom.caseSensitive("");
        assertEquals("",custom.getWord());
    }

    @Test
    void caseSensitiveTestNotNull(){
        custom.caseSensitive("Sirisha");
        assertNotNull(custom.getWord());
    }

    @Test
    void cubeOfNumberTest(){
        custom.cubeOfNumber(4);
        assertEquals(64,custom.getCube());
    }
    @Test
    void NumberTestIfZero(){
        custom.cubeOfNumber(0);
        assertEquals(0,custom.getCube());
    }

    @Test
    void cubeOfNumberTestNotNull() {
        custom.cubeOfNumber(7);
        assertNotNull(custom.getCube());
    }
}
