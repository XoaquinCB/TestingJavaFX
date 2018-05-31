package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Main extends Application {

    private Stage stage;
    private Scene scene;
    private VBox layout;
    private Label label;
    private Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Store stage in private variable
        stage = primaryStage;

        // Components
        button = new Button("Click me!");
        button.setOnAction(e -> new AlertBox().display());
        label = new Label("This is a label...");

        // Layout
        layout = new VBox(15);
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);

        // Scene & Stage
        scene = new Scene(layout, 350, 200);
        stage.setTitle("My App");
        stage.setScene(scene);
        stage.show();
    }

}
