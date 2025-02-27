import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class App extends Application {
    @Override
    public void start(Stage primarystage) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
            Scene scene = new Scene(root, 1000, 635); // The MainScene of the GU

            primarystage.setTitle("ALTURA BATA INVENTORY SYSTEM");
            Image icon = new Image("Images/Logo.png");
            primarystage.getIcons().add(icon);
            primarystage.setResizable(false);

            String css = this.getClass().getResource("application.css").toExternalForm();
            scene.getStylesheets().add(css);

            primarystage.setScene(scene); // Calling the scene method
            primarystage.show(); // Outputing the overall GUI

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
