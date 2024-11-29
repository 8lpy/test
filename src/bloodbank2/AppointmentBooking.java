package bloodbank2;  

import javafx.application.Application;  
import javafx.geometry.Insets;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.layout.GridPane;  
import javafx.scene.layout.StackPane;  
import javafx.scene.paint.Color;  
import javafx.scene.text.Font;  
import javafx.stage.Stage;  

public class AppointmentBooking extends Application {  

    private Label messageLabel; // لعرض الرسالة  

    @Override  
    public void start(Stage primaryStage) {  
        // إعداد StackPane لملائمة كل العناصر بشكل مرتّب  
        StackPane stackPane = new StackPane();  
        stackPane.setPrefSize(398, 543); // تعيين الأبعاد العامة للمشهد  

        // إنشاء GridPane لتوزيع الأزرار  
        GridPane grid = new GridPane();  
        grid.setPadding(new Insets(20)); // المساحة الخارجية حول الشبكة  
        grid.setVgap(10); // المسافة الرأسية بين الصفوف  
        grid.setHgap(10); // المساحة الأفقية بين الأعمدة  
        
        messageLabel = new Label(); // تهيئة الرسالة ككائن لعرضها لاحقًا  
        messageLabel.setTextFill(Color.GREEN);  
        messageLabel.setFont(new Font("Arial", 16));  

        // إضافة الأزرار إلى GridPane  
        String[] buttonLabels = {"7-8", "8-9", "9-10", "10-11", "11-12", "12-13", "13-14", "14-15"};  
        for (int i = 0; i < buttonLabels.length; i++) {  
            final String timeSlot = buttonLabels[i]; // متغير نهائي  

            Button button = new Button("Book " + timeSlot);  
            button.setPrefSize(100, 50);  
            button.setStyle("-fx-background-color: #1eff00; -fx-text-fill: black; -fx-font-weight: bold;");  

            // إضافة تأثيرات عند التحويم  
            button.setOnMouseEntered(e -> button.setStyle("-fx-background-color: #00ff00; -fx-text-fill: black;"));  
            button.setOnMouseExited(e -> button.setStyle("-fx-background-color: #1eff00; -fx-text-fill: black;"));  

            // إضافة الزر إلى GridPane  
            grid.add(button, i % 4, i / 4); // ترتيب الأزرار في 4 أعمدة  
        }  

        // إضافة الرسالة إلى المخطط  
        grid.add(messageLabel, 0, 3, 4, 1); // عرض الرسالة عبر 4 أعمدة تبدأ من الصف الرابع  
        
        // إضافة زر "رجوع" في منتصف الصف الآخر بالأسفل  
        Button backButton = new Button("Back");  
        backButton.setPrefSize(100, 50);  
        backButton.setStyle("-fx-text-fill: black;"); // جعل اللون النص بدون خلفية  
        GridPane.setMargin(backButton, new Insets(20, 0, 0, 0)); // إضافة مسافة فوق الزر  
        grid.add(backButton, 0, 4, 4, 1); // إضافة زر "رجوع" ليكون عبر 4 أعمدة  
        grid.setHalignment(backButton, javafx.geometry.HPos.CENTER); // توسيط الزر أفقيًا  
      backButton.setOnAction(e -> backButton(primaryStage));  


        // إضافة GridPane إلى StackPane  
        stackPane.getChildren().add(grid); // إضافة GridPane إلى StackPane  

        // إعداد المشهد بحجم محدد  
        Scene scene = new Scene(stackPane, 398, 543);  
        primaryStage.setTitle("Appointment Booking");  
        primaryStage.setScene(scene);  
        primaryStage.show();  
    }  

    // دالة لحجز الموعد وعرض رسالة النجاح  
    private void bookAppointment(String timeSlot) {  
        messageLabel.setText("تم الحجز بنجاح لفترة: " + timeSlot);  
    }  

     public void backButton(Stage primaryStage) {
             MainMenu mainMenu = new MainMenu(); // إنشاء كائن جديد من MainMenu  
            try {  
                mainMenu.start(primaryStage); // استدعاء دالة start الخاصة بها  
            } catch (Exception e) {  
                e.printStackTrace();  
        }  
     }
    public static void main(String[] args) {  
        launch(args);  
    }  
}