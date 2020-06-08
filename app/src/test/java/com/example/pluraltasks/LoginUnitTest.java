package com.example.pluraltasks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class LoginUnitTest {
    @Test
    public void emailValidation_isCorrect() {
        assertEquals(false, Utilities.isValidEmail("example"));
        assertEquals(false, Utilities.isValidEmail("example@gmail"));
        Assert.assertEquals(true, Utilities.isValidEmail("example@gmail.com"));
        assertEquals(false, Utilities.isValidEmail("example@gmail@.com"));
        assertEquals(true, Utilities.isValidEmail("example.next@gmail.com"));
        assertEquals(false, Utilities.isValidEmail(""));


        assertTrue(Utilities.isValidEmail("example@gmail.com"));
    }
}