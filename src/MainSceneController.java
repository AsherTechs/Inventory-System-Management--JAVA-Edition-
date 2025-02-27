import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class MainSceneController implements Initializable {
    @FXML
    private ComboBox<String> Security_Box;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[] items = { "What was the name of your favorite childhood pet?", "What year was your grandmother born?",
                "What is your favorite sport?", "What was your childhood nickname?" };
        Security_Box.getItems().addAll(items);
    }

    @FXML
    private Label Already_Have;

    @FXML
    private Pane BackgroundPane;

    @FXML
    private TextField Confirm_PassField;

    @FXML
    private Label Confirm_Password;

    @FXML
    private Label Dont_Have;

    @FXML
    private Label Enter_Password;

    @FXML
    private Label Enter_User;

    @FXML
    private BorderPane Reset_Frame;

    @FXML
    private AnchorPane Forget_Background;

    @FXML
    private Label Forget_Text;

    @FXML
    private AnchorPane Forget_Top;

    @FXML
    private Hyperlink GoBack_Link;

    @FXML
    private AnchorPane Left_Frame;

    @FXML
    private Button Login_Btn;

    @FXML
    private BorderPane Login_Frame;

    @FXML
    private Label Login_Text;

    @FXML
    private ImageView Logo_Forget;

    @FXML
    private ImageView Logo_Register;

    @FXML
    private ImageView Logo_Text;

    @FXML
    private TextField PH_Password;

    @FXML
    private TextField PH_User;

    @FXML
    private Label Pass_Reset;

    @FXML
    private Button Register_Btn;

    @FXML
    private BorderPane Register_Frame;

    @FXML
    private TextField Register_PassField;

    @FXML
    private Label Register_Text;

    @FXML
    private TextField Register_UserField;

    @FXML
    private AnchorPane Registration_Bg;

    @FXML
    private Hyperlink Registration_Link;

    @FXML
    private AnchorPane Registration_Top;

    @FXML
    private Hyperlink Reset_Link;

    @FXML
    private Button Reset_Btn;

    @FXML
    private TextField Reset_PassField;

    @FXML
    private TextField Reset_UserField;

    @FXML
    private AnchorPane Right_Frame;

    @FXML
    private TextField Security_Answer1;

    @FXML
    private TextField Security_Answer2;

    @FXML
    private Label Security_Question;

    @FXML
    private Label Security_Question1;

    @FXML
    private Label User_Reset;

    @FXML
    void Answer_Box1(ActionEvent event) {

    }

    @FXML
    void Answer_Box2(ActionEvent event) {

    }

    @FXML
    void Click_Here(ActionEvent event) {

        TranslateTransition slideTaskPaneIn = new TranslateTransition(Duration.seconds(0.5), Register_Frame);
        slideTaskPaneIn.setToX(-1225);
        slideTaskPaneIn.play();

        // Slide DefaultMenu from right to left
        TranslateTransition slideDefaultMenuOut = new TranslateTransition(Duration.seconds(0.5), Login_Frame);
        slideDefaultMenuOut.setToX(1225);
        slideDefaultMenuOut.play();

    }

    @FXML
    void GoBack_Btn(ActionEvent event) {

        TranslateTransition slideTaskPaneIn = new TranslateTransition(Duration.seconds(0.5), Login_Frame);
        slideTaskPaneIn.setToX(-10); // Move TaskPane to original position
        slideTaskPaneIn.play();

        // Slide DefaultMenu from right to left
        TranslateTransition slideDefaultMenuOut = new TranslateTransition(Duration.seconds(0.5), Register_Frame);
        slideDefaultMenuOut.setToX(10); // Move DefaultMenu off-screen to the left
        slideDefaultMenuOut.play();

    }

    @FXML
    void Reset(ActionEvent event) {

        TranslateTransition slideTaskPaneIn = new TranslateTransition(Duration.seconds(0.5), Reset_Frame);
        slideTaskPaneIn.setToX(-2607);
        slideTaskPaneIn.play();

        TranslateTransition slideRegisterFrameOut = new TranslateTransition(Duration.seconds(0.5), Register_Frame);
        slideRegisterFrameOut.setToX(1000);
        slideRegisterFrameOut.play();

        TranslateTransition slideLoginFrameOut = new TranslateTransition(Duration.seconds(0.5), Login_Frame);
        slideLoginFrameOut.setToX(1000);
        slideLoginFrameOut.play();

    }

    @FXML
    void Login_Click(ActionEvent event) {

    }

    @FXML
    void Pass_Login(ActionEvent event) {

    }

    @FXML
    void Question_Box(ActionEvent event) {

    }

    @FXML
    void Register_Click(ActionEvent event) {

    }

    @FXML
    void Register_ConfirmPasswordBox(ActionEvent event) {

    }

    @FXML
    void Register_PasswordBox(ActionEvent event) {

    }

    @FXML
    void Register_UsernameBox(ActionEvent event) {

    }

    @FXML
    void Reset_Click(ActionEvent event) {

    }

    @FXML
    void Reset_Password(ActionEvent event) {

    }

    @FXML
    void Reset_Username(ActionEvent event) {

    }

    @FXML
    void User_Login(ActionEvent event) {

    }

}
