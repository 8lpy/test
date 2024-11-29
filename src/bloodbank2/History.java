
package bloodbank2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class History extends Application {
    
    
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("History");

        AnchorPane root = new AnchorPane();
        root.setPrefSize(397, 543);
        root.setStyle("-fx-background-color: #ff007f");

        Rectangle rectangle = new Rectangle(398, 281);
        rectangle.setLayoutX(-1);
        rectangle.setLayoutY(-1);
        rectangle.setFill(Color.web("#e13995"));
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        root.getChildren().add(rectangle);

        Button backButton = new Button("Back");
        backButton.setLayoutX(151);
        backButton.setLayoutY(311);
        backButton.setPrefSize(81, 56);
        backButton.setFont(Font.font("System Bold", 16));
        backButton.setOnAction(e -> backButton2(primaryStage));  
        root.getChildren().add(backButton);

        Label nameLabel = new Label("Name: yazeed");
        nameLabel.setLayoutX(129);
        nameLabel.setLayoutY(14);
        nameLabel.setPrefSize(141, 28);
        nameLabel.setFont(Font.font("System Bold", 19));
        root.getChildren().add(nameLabel);

        Label donation1Label = new Label("you donated in 2024/9/28 to Nader Mohamed");
        donation1Label.setLayoutX(14);
        donation1Label.setLayoutY(55);
        donation1Label.setPrefSize(332, 21);
        donation1Label.setFont(Font.font("System Bold", 15));
        root.getChildren().add(donation1Label);

        Label donation2Label = new Label("you donated in 2024/5/17 to Sultan Al-Balawi");
        donation2Label.setLayoutX(14);
        donation2Label.setLayoutY(76);
        donation2Label.setPrefSize(332, 21);
        donation2Label.setFont(Font.font("System Bold", 15));
        root.getChildren().add(donation2Label);

        Label donation3Label = new Label("you donated in 2024/1/13 to As Anonymos");
        donation3Label.setLayoutX(14);
        donation3Label.setLayoutY(97);
        donation3Label.setPrefSize(332, 21);
        donation3Label.setFont(Font.font("System Bold", 15));
        root.getChildren().add(donation3Label);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }
    
       public void backButton2(Stage primaryStage) {
            
            MainMenu mainMenu = new MainMenu(); 
            try {  
                mainMenu.start(primaryStage); 
            } catch (Exception e) {  
                e.printStackTrace();  
        } 
           
        }  

    public static void main(String[] args) {
        launch(args);
    }
}