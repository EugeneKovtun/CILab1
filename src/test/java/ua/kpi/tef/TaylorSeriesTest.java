package ua.kpi.tef;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


class TaylorSeriesTest {

    @Test
    void sinTaylorShouldCountSinus() {
        double epsilon = 0.00001;
        assertTrue(Math.abs(
                Math.sin(1) - TaylorSeries.sinTaylorA(1, 10)
        ) < epsilon);
    }

    @Test
    void sinTaylorShouldThrowExceptionOnNegativeIterationCount() {
        assertThrows(IllegalArgumentException.class, ()-> TaylorSeries.sinTaylorA(1, -1));
    }

}