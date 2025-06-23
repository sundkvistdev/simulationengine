package core;

import engine.rendering.RenderingContext;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Window extends Application {

    private Canvas canvas;
    private GraphicsContext gc;

    private StackPane root;
    private Scene scene;

    private RenderingContext context;

    @Override
    public void start(Stage window) {
        this.canvas = new Canvas(800, 600);
        this.gc = this.canvas.getGraphicsContext2D();

        // RenderingContext initialization
        this.context = new RenderingContext(this.gc);

        // Random stuff I don't really understand
        this.root = new StackPane(this.canvas);
        this.scene = new Scene(this.root, 800, 600);

        window.setTitle("Samsoft SimulationEngine v0.0.0");
        window.setScene(this.scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
