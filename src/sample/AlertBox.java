package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class AlertBox {

    private Stage stage;
    private Scene scene;
    private VBox layout;
    private Label label;
    private Button button;

    public void display() {
        // Components & Layout
        label = new Label("Alert: This is an alert");
        button = new Button("Close window");
        button.setOnAction(e -> stage.close());

        layout = new VBox(15);
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);

        // Scene & Stage
        scene = new Scene(layout, 280, 80);
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.setTitle("Alert");
        stage.show();
    }

}
