package com.minibootcamp.pasti;

public class Line {
    private final double x1;
    private final double x2;

    Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double calculateLength() {
        return x1 + x2;
    }
}
