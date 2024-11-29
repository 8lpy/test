
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
        
//        ImageView imageView = new ImageView(new Image("file:imige/picture-fram-260nw-242360284.png"));
//        imageView.setFitHeight(333.0);
//        imageView.setFitWidth(419.0);
//        imageView.setLayoutX(-3.0);
//        imageView.setLayoutY(301.0);
//        imageView.setPickOnBounds(true);
//        imageView.setPreserveRatio(true);

//        ImageView imageView2 = new ImageView(new Image("file:imige/picture-fram-260nw-242360284.png"));
//        imageView2.setFitHeight(217..0);
//        imageView2.setFitWidth(426.0);
//        imageView2.setLayoutX(-13.0);
//        imageView2.setPickOnBounds(true);
//        imageView2.setPreserveRatio(true);

//        ImageView imageView3 = new ImageView(new Image("file:imige/picture-fram-260nw-242360284.png"));
//        imageView3.setFitHeight(207.0);
//        imageView3.setFitWidth(154.0);
//        imageView3.setLayoutX(29.0);
//        imageView3.setLayoutY(59.0);
//        imageView3.setPickOnBounds(true);
//        imageView.setPreserveRatio(true);

//        ImageView imageView4 = new ImageView(new Image("file:imige/picture-fram-260nw-242360284.png"));
//        imageView4.setFitHeight(200.0);
//        imageView4.setFitWidth(200.0);
//        imageView3.setLayoutX(100.0);
//        imageView3.setLayoutY(246.0);

        pane.getChildren().addAll(frame, bookAppointmentBtn, backButton, historyBtn);

        root.getChildren().addAll(pane);

        Scene scene = new Scene(root, 398, 543);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
    
        public void bookAppointmentBtn(Stage primaryStage) {
             AppointmentBooking AB = new AppointmentBooking(); 
            try {  
                AB.start(primaryStage); 
            } catch (Exception e) {  
                e.printStackTrace();  
        } 
            
        }
       public void historyBtn(Stage primaryStage) {
                 History history = new History(); 
            try {  
                history.start(primaryStage); 
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