package com.minibootcamp.pasti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {
    private static final double DELTA_OFFSET = 0.001;

    @Test
    public void calculateDistance_ReturnZero_WhenLineDoesntHaveLength() {
        Line line = new Line(0, 0, 0, 0);

        double lineLength = line.calculateLength();
        final double expectedResult = 0;

        assertEquals(expectedResult, lineLength, DELTA_OFFSET);
    }

    @Test
    public void calculateDistance_ReturnLength_WhenLineIsHorizontal() {
        Line line = new Line(0, 0, 5, 0);

        double lineLength = line.calculateLength();
        final double expectedResult = 5;

        assertEquals(expectedResult, lineLength, DELTA_OFFSET);
    }
}
