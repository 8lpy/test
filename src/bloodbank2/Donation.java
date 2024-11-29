
        
package bloodbank2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Donation extends Application {

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        root.setPrefHeight(543.0);
        root.setPrefWidth(398.0);
        root.setStyle("-fx-background-color: #ff007f;");

        TextField firstnameTextField = new TextField();
        firstnameTextField.setLayoutX(99.0);
        firstnameTextField.setLayoutY(119.0);
        firstnameTextField.setPrefHeight(25.0);
        firstnameTextField.setPrefWidth(182.0);
        firstnameTextField.setPromptText("Firstname");
        firstnameTextField.setStyle("-fx-background-radius: 10px;");

        Button backButton = new Button("Back");
        backButton.setLayoutX(99.0);
        backButton.setLayoutY(433.0);
        backButton.setPrefHeight(81.0);
        backButton.setPrefWidth(182.0);
        backButton.setFont(Font.font("System Bold", 15.0));
        backButton.setOnAction(e -> backButton(primaryStage));  


        TextField lastnameTextField = new TextField();
        lastnameTextField.setLayoutX(99.0);
        lastnameTextField.setLayoutY(166.0);
        lastnameTextField.setPrefHeight(25.0);
        lastnameTextField.setPrefWidth(182.0);
        lastnameTextField.setPromptText("Lastname");
        lastnameTextField.setStyle("-fx-background-radius: 10px;");

        TextField ageTextField = new TextField();
        ageTextField.setLayoutX(99.0);
        ageTextField.setLayoutY(207.0);
        ageTextField.setPrefHeight(25.0);
        ageTextField.setPrefWidth(182.0);
        ageTextField.setPromptText("Age");
        ageTextField.setStyle("-fx-background-radius: 10px;");

        ComboBox<String> bloodTypeComboBox = new ComboBox<>();
        bloodTypeComboBox.setLayoutX(115.0);
        bloodTypeComboBox.setLayoutY(259.0);
        bloodTypeComboBox.setPrefWidth(150.0);
        bloodTypeComboBox.setPromptText("BloodType");
        bloodTypeComboBox.getItems().addAll("A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-");
        Button printLabelButton = new Button("Print Label");
        printLabelButton.setLayoutX(99.0);
        printLabelButton.setLayoutY(322.0);
        printLabelButton.setPrefHeight(81.0);
        printLabelButton.setPrefWidth(182.0);
        printLabelButton.setFont(Font.font("System Bold", 15.0));
        printLabelButton.setOnAction(e -> printLabelButton(primaryStage));  


        root.getChildren().addAll(firstnameTextField, backButton, lastnameTextField, ageTextField, bloodTypeComboBox, printLabelButton);

        Scene scene = new Scene(root, 398, 543);

        primaryStage.setTitle("Staff View");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
      public void printLabelButton(Stage primaryStage) {
            
           
            
        }
      
        public void backButton(Stage primaryStage) {
            
              Staff staff = new Staff();  
            try {  
                staff.start(primaryStage);
            } catch (Exception e) {  
                e.printStackTrace();  
            } 
            
        }

    public static void main(String[] args) {
        launch(args);
    }
}