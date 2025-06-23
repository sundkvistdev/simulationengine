package engine.rendering;

import common.Point;
import common.Size;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class RenderingContext {
    private final GraphicsContext context;

    public RenderingContext(GraphicsContext context) {
        this.context = context;
    }

    public RenderingContext outlinedRect(Point point, Size size, Paint paint) {
        this.context.setStroke(paint);
        this.context.strokeRect(point.getX(), point.getY(), size.getWidth(), size.getHeight());
        return this;
    }

    public RenderingContext filledRect(Point point, Size size, Paint paint) {
        this.context.setFill(paint);
        this.context.fillRect(point.getX(), point.getY(), size.getWidth(), size.getHeight());
        return this;
    }

    public RenderingContext line(Point point, Point point2, int lineWidth, Paint paint) {
        this.context.setLineWidth(lineWidth);
        this.context.setStroke(paint);
        this.context.strokeLine(point.getX(), point.getY(), point2.getX(), point2.getY());
        return this;
    }
}
