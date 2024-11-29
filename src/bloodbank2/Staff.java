package bloodbank2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Staff extends Application {

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        root.setPrefHeight(543.0);
        root.setPrefWidth(398.0);
        root.setStyle("-fx-background-color: #ff007f;");

        Button createDonationButton = new Button("Create a new donation");
        createDonationButton.setLayoutX(108.0);
        createDonationButton.setLayoutY(125.0);
        createDonationButton.setPrefHeight(81.0);
        createDonationButton.setPrefWidth(182.0);
        createDonationButton.setFont(Font.font("System Bold", 15.0));
        createDonationButton.setOnAction(e -> createDonationButton(primaryStage));  

        Button createAccountButton = new Button("Create a new account");
        createAccountButton.setLayoutX(108.0);
        createAccountButton.setLayoutY(216.0);
        createAccountButton.setPrefHeight(81.0);
        createAccountButton.setPrefWidth(182.0);
        createAccountButton.setFont(Font.font("System Bold", 15.0));
        createAccountButton.setOnAction(e -> createAccountButton(primaryStage));  

        Button backButton = new Button("Back");
        backButton.setLayoutX(108.0);
        backButton.setLayoutY(407.0);
        backButton.setPrefHeight(81.0);
        backButton.setPrefWidth(182.0);
        backButton.setFont(Font.font("System Bold", 15.0));
        backButton.setOnAction(e -> backButton(primaryStage)); 

        root.getChildren().addAll(createDonationButton, createAccountButton, backButton);

        Scene scene = new Scene(root, 398, 543);

        primaryStage.setTitle("Blood Bank View");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
            public void createAccountButton(Stage primaryStage) {
                          
              CreeteAccount creeteAccount = new CreeteAccount(); 
            try {  
                creeteAccount.start(primaryStage);
            } catch (Exception e) {  
                e.printStackTrace();  
            } 
            
        
                
                
            }
            
            
            
        public void createDonationButton(Stage primaryStage) {
            
                 Donation donation = new Donation();   
            try {  
                donation.start(primaryStage); 
            } catch (Exception e) {  
                e.printStackTrace();  
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

