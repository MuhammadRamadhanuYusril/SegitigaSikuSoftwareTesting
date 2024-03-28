package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testIsValidTriangle_True() {
        assertTrue(Main.isValidTriangle(3, 4, 5)); // Segitiga siku-siku
        assertTrue(Main.isValidTriangle(5, 12, 13)); // Segitiga siku-siku
        assertTrue(Main.isValidTriangle(7, 24, 25)); // Segitiga siku-siku
    }

    @Test
    public void testIsValidTriangle_False() {
        assertFalse(Main.isValidTriangle(1, 2, 6)); // Tidak memenuhi syarat segitiga
        assertFalse(Main.isValidTriangle(3, 3, 7)); // Tidak memenuhi syarat segitiga
        assertFalse(Main.isValidTriangle(4, 4, 9)); // Tidak memenuhi syarat segitiga
    }

    @Test
    public void testIsRightTriangle_True() {
        assertTrue(Main.isRightTriangle(3, 4, 5)); // Segitiga siku-siku
        assertTrue(Main.isRightTriangle(5, 12, 13)); // Segitiga siku-siku
        assertTrue(Main.isRightTriangle(7, 24, 25)); // Segitiga siku-siku
    }

    @Test
    public void testIsRightTriangle_False() {
        assertFalse(Main.isRightTriangle(3, 3, 3)); // Segitiga tidak siku-siku
        assertFalse(Main.isRightTriangle(5, 7, 10)); // Segitiga tidak siku-siku
        assertFalse(Main.isRightTriangle(8, 15, 17)); // Segitiga tidak siku-siku
    }

}