package bloodbank2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppointmentBooking extends Application {

    private Label messageLabel; 
    private Button backButton;
    @Override
    public void start(Stage primaryStage) {
        StackPane stackPane = new StackPane();  
        stackPane.setPrefSize(398, 543); 
        stackPane.setStyle("-fx-background-color: #ff007f");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20)); 
        grid.setVgap(10); 
        grid.setHgap(10); 

        messageLabel = new Label(); 
        messageLabel.setTextFill(Color.BLACK);
        messageLabel.setFont(new Font("Arial", 16));

       
        String[] buttonLabels = {"7-8", "8-9", "9-10", "10-11", "11-12", "12-13", "13-14", "14-15"};
        for (int i = 0; i < buttonLabels.length; i++) {
            final String timeSlot = buttonLabels[i]; 

            Button button = new Button("Book " + timeSlot);
            button.setPrefSize(100, 50);
            button.setStyle("-fx-text-fill: black; -fx-font-weight: bold;");

          
         

            button.setOnAction(e -> bookAppointment(timeSlot)); 

           
            grid.add(button, i % 4, i / 4); 
        }

       
        grid.add(messageLabel, 0, 3, 4, 1); 

       
         backButton = new Button("Back");
        backButton.setPrefSize(100, 50);
        backButton.setStyle("-fx-text-fill: black;"); 
        GridPane.setMargin(backButton, new Insets(20, 0, 0, 0)); 
        grid.add(backButton, 0, 4, 4, 1);
        grid.setHalignment(backButton, javafx.geometry.HPos.CENTER); 
        backButton.setOnAction(e -> backButton(primaryStage));

       
        stackPane.getChildren().add(grid);

      
        Scene scene = new Scene(stackPane, 398, 543);
        primaryStage.setTitle("Appointment Booking");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    private void bookAppointment(String timeSlot) {

    Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Success");
    alert.setHeaderText(null);
    alert.setContentText("Appointment has been booked successfully.!");
    alert.showAndWait();
    
    
    
    backButton.fire();

    }

    public void backButton(Stage primaryStage) {
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