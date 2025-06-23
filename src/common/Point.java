package common;

public class Point {
    private int x;
    private int y;
    private int layer;

    public Point(int x, int y, int layer) {
        this.x = x;
        this.y = y;
        this.layer = layer;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.layer = 0;
    }

    public double distanceTo(Point other) {
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return y;
    }

    public int getLayer() {
        return layer;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
