package com.minibootcamp.pasti;

public class Line {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;

    Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateLength() {
        final double x = x1 - x2;
        final double y = y1 - y2;

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public boolean compareLine(Line line) {
        return true;
    }
}
