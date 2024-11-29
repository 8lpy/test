
package bloodbank2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainMenu extends Application {

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();

        Pane pane = new Pane();
        pane.setLayoutX(100);
        pane.setLayoutY(246);
        pane.setPrefWidth(200);
        pane.setPrefHeight(200);

        ImageView frame = new ImageView();
        frame.setFitWidth(154);
        frame.setFitHeight(207);
        frame.setLayoutX(29);
        frame.setLayoutY(59);

        Button bookAppointmentBtn = new Button("Book an appointment");
        bookAppointmentBtn.setLayoutX(38);
        bookAppointmentBtn.setLayoutY(89);
        bookAppointmentBtn.setPrefWidth(130);
        bookAppointmentBtn.setPrefHeight(39);
        bookAppointmentBtn.setStyle("-fx-background-radius: 10px; -fx-border-style: red;");
        bookAppointmentBtn.setOnAction(e -> bookAppointmentBtn(primaryStage));  


        Button backButton = new Button("Back");
        backButton.setLayoutX(41);
        backButton.setLayoutY(200);
        backButton.setPrefWidth(124);
        backButton.setPrefHeight(43);
        backButton.setStyle("-fx-background-radius: 10px;");
        backButton.setOnAction(e -> backButton(primaryStage));  


        Button historyBtn = new Button("History");
        historyBtn.setLayoutX(41);
        historyBtn.setLayoutY(141);
        historyBtn.setPrefWidth(124);
        historyBtn.setPrefHeight(43);
        historyBtn.setStyle("-fx-background-radius: 10px;");
        historyBtn.setOnAction(e -> historyBtn(primaryStage));  


        pane.getChildren().addAll(frame, bookAppointmentBtn, backButton, historyBtn);

        root.getChildren().addAll(pane);

        Scene scene = new Scene(root, 398, 543);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
    
        public void bookAppointmentBtn(Stage primaryStage) {
             AppointmentBooking AB = new AppointmentBooking(); // إنشاء كائن جديد من MainMenu  
            try {  
                AB.start(primaryStage); // استدعاء دالة start الخاصة بها  
            } catch (Exception e) {  
                e.printStackTrace();  
        } 
            
        }
       public void historyBtn(Stage primaryStage) {
                 History history = new History(); // إنشاء كائن جديد من MainMenu  
            try {  
                history.start(primaryStage); // استدعاء دالة start الخاصة بها  
            } catch (Exception e) {  
                e.printStackTrace();  
        }
        }  
          public void backButton(Stage primaryStage) {
            
               BloodBank2 bloodbank = new BloodBank2(); // إنشاء كائن جديد من MainMenu  
            try {  
                bloodbank.start(primaryStage); // استدعاء دالة start الخاصة بها  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
              
              
        }  
    

    public static void main(String[] args) {
        launch(args);
    }
}