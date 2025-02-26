import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainSceneController {

    @FXML
    private AnchorPane BackgroundPane;

    @FXML
    private AnchorPane Left_Frame;

    @FXML
    private Button Login_Btn;

    @FXML
    private Label Login_Text;

    @FXML
    private ImageView Logo_Text;

    @FXML
    private TextField PH_Password;

    @FXML
    private TextField PH_User;

    @FXML
    private AnchorPane Right_Frame;

    @FXML
    void Login_Click(ActionEvent event) {
        System.out.println("Hello World!");
    }

    @FXML
    void Pass_Field(ActionEvent event) {

    }

    @FXML
    void User_FIeld(ActionEvent event) {

    }

}
