
package bloodbank2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Hospital extends Application {

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        root.setPrefHeight(543.0);
        root.setPrefWidth(398.0);
        root.setStyle("-fx-background-color: #ff007f;");

        Pane pane = new Pane();
        pane.setLayoutX(91.0);
        pane.setLayoutY(297.0);
        pane.setPrefHeight(200.0);
        pane.setPrefWidth(200.0);
        pane.setStyle("-fx-background-radius: 40px; -fx-background-color: #ff4d94;");
        pane.setEffect(new DropShadow());

        Button newRecostButton = new Button("New recost");
        newRecostButton.setLayoutX(112.0);
        newRecostButton.setLayoutY(404.0);
        newRecostButton.setPrefHeight(25.0);
        newRecostButton.setPrefWidth(157.0);
        newRecostButton.setFont(Font.font("System Bold", 15.0));
        newRecostButton.setOnAction(e -> newRecostButton(primaryStage));  


        ComboBox<String> bloodComboBox = new ComboBox<>();
        bloodComboBox.setLayoutX(116.0);
        bloodComboBox.setLayoutY(310.0);
        bloodComboBox.setPrefWidth(150.0);
        bloodComboBox.setPromptText("Blood Type");
        bloodComboBox.setVisibleRowCount(2);
        bloodComboBox.getItems().addAll("A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-");


        ComboBox<String> volumeComboBox = new ComboBox<>();
        volumeComboBox.setLayoutX(116.0);
        volumeComboBox.setLayoutY(356.0);
        volumeComboBox.setPrefWidth(150.0);
        volumeComboBox.setPromptText("Volume");
        volumeComboBox.getItems().addAll("100 ml", "200 ml", "300 ml", "400 ml", "500 ml");

        
        Button backButton = new Button("Back");
        backButton.setLayoutX(112.0);
        backButton.setLayoutY(458.0);
        backButton.setPrefHeight(25.0);
        backButton.setPrefWidth(157.0);
        backButton.setFont(Font.font("System Bold", 15.0));
        backButton.setOnAction(e -> backButton(primaryStage));  

//
//        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("../image/hos.png")));
//        imageView.setFitHeight(284.0);
//        imageView.setFitWidth(398.0);
//        imageView.setPreserveRatio(true);

        root.getChildren().addAll(pane, newRecostButton, bloodComboBox, volumeComboBox, backButton);

        Scene scene = new Scene(root, 398, 543);
        primaryStage.setTitle("Hospital Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

      public void backButton(Stage primaryStage) {
          
          BloodBank2 bloodbank = new BloodBank2();  
            try {  
                bloodbank.start(primaryStage); 
            } catch (Exception e) {  
                e.printStackTrace();  
            } 
                  
      }
    
      
        public void newRecostButton(Stage primaryStage) {
          
          Alert alert = new Alert(AlertType.INFORMATION);
          alert.setTitle("Success");
    alert.setHeaderText(null);
    alert.setContentText("Request has been sent successfully!");
    alert.showAndWait();
          
      }
      
    
    public static void main(String[] args) {
        launch(args);
    }
}

  