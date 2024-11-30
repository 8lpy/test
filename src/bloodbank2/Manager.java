
        
package bloodbank2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Manager extends Application {

    
    private Label newRequestLabel;
    private Label bloodTypeLabel;
    private Label quantityLabel;
    
    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        root.setPrefHeight(543.0);
        root.setPrefWidth(398.0);
        root.setStyle("-fx-background-color: #ff007f;");

        Button aproveButton = new Button("Approve");
        aproveButton.setLayoutX(97.0);
        aproveButton.setLayoutY(256.0);
        aproveButton.setPrefHeight(67.0);
        aproveButton.setPrefWidth(205.0);
        aproveButton.setStyle("-fx-background-radius: 10px;");
        aproveButton.setFont(Font.font("System Bold", 27.0));
        aproveButton.setOnAction(e -> aproveButton(primaryStage));  


        ImageView imageView = new ImageView(new Image("Image/picture-fram-260nw-242360284.png"));
        imageView.setFitHeight(280.0);
        imageView.setFitWidth(398.0);
        imageView.setPreserveRatio(true);

        Button rejectButton = new Button("Reject");
        rejectButton.setLayoutX(96.0);
        rejectButton.setLayoutY(342.0);
        rejectButton.setPrefHeight(67.0);
        rejectButton.setPrefWidth(205.0);
        rejectButton.setStyle("-fx-background-radius: 10px;");
        rejectButton.setFont(Font.font(29.0));
        rejectButton.setOnAction(e -> rejectButton(primaryStage));  


        Button backButton = new Button("Back");
        backButton.setLayoutX(99.0);
        backButton.setLayoutY(427.0);
        backButton.setPrefHeight(73.0);
        backButton.setPrefWidth(192.0);
        backButton.setStyle("-fx-background-radius: 10px;");
        backButton.setFont(Font.font("System Bold", 24.0));
        backButton.setOnAction(e -> backButton(primaryStage));  


         newRequestLabel = new Label("There is a new blood request:");
        newRequestLabel.setLayoutX(21.0);
        newRequestLabel.setLayoutY(24.0);
        newRequestLabel.setFont(Font.font(14.0));

         bloodTypeLabel = new Label("Type: A+");
        bloodTypeLabel.setLayoutX(206.0);
        bloodTypeLabel.setLayoutY(26.0);
        bloodTypeLabel.setFont(Font.font("System Bold", 11.0));

         quantityLabel = new Label("Quantity: 100ml");
        quantityLabel.setLayoutX(261.0);
        quantityLabel.setLayoutY(26.0);
        quantityLabel.setFont(Font.font("System Bold", 11.0));

        root.getChildren().addAll(imageView ,aproveButton, rejectButton, backButton, newRequestLabel, bloodTypeLabel, quantityLabel );

        Scene scene = new Scene(root, 398, 543);
        primaryStage.setTitle("Blood Request");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
       public void aproveButton(Stage primaryStage) {
           if(newRequestLabel.isVisible()){
               
           
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Success");
    alert.setHeaderText(null);
    alert.setContentText("Request has been  Approved!");
    alert.showAndWait();
    
    newRequestLabel.setVisible(false);
    bloodTypeLabel.setVisible(false);
    quantityLabel.setVisible(false);
           }
           
           else{
                         Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Eror");
    alert.setHeaderText(null);
    alert.setContentText("Error!");
    alert.showAndWait();
               
               
               
           }

       }
       public void rejectButton(Stage primaryStage) {
           
                      if(newRequestLabel.isVisible()){

           
           
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Success");
    alert.setHeaderText(null);
    alert.setContentText("Request has been  Rejected!");
    alert.showAndWait();
    
     newRequestLabel.setVisible(false);
    bloodTypeLabel.setVisible(false);
    quantityLabel.setVisible(false);
           
       }
                      
                      else{
                                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Eror");
    alert.setHeaderText(null);
    alert.setContentText("Error!");
    alert.showAndWait();
    
                      }
                      
       }
    
    public void backButton(Stage primaryStage) {
            
               BloodBank2 bloodbank = new BloodBank2(); 
            try {  
                bloodbank.start(primaryStage); 
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
    }

    public static void main(String[] args) {
        launch(args);
    }
}