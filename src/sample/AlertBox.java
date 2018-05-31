package sample;

import javafx.geometry.Pos;
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

    public void display() {
        // Label & Layout
        label = new Label("This is a new window!");
        layout = new VBox(15);
        layout.getChildren().add(label);
        layout.setAlignment(Pos.CENTER);

        // Scene & Stage
        scene = new Scene(layout, 280, 80);
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.setTitle("Pop-up");
        stage.show();
    }

}
