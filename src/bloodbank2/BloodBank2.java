
package bloodbank2;  

import java.util.ArrayList;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.PasswordField;  
import javafx.scene.control.TextField;  
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView;  
import javafx.scene.layout.AnchorPane;  
import javafx.scene.layout.Pane;  
import javafx.scene.text.Font;  
import javafx.stage.Stage;  

public class BloodBank2 extends Application {  

    private Scene loginScene;  
    private TextField usernameField;  
    private PasswordField passwordField;  
    private Label label;  

    @Override  
    public void start(Stage primaryStage) throws Exception {  
        AnchorPane root = new AnchorPane();  
        Pane pane = new Pane();  
        root.getChildren().add(pane);  

        ImageView background = new ImageView(new Image("file:../imige/Black BackGround.jpg"));  
        background.setFitWidth(400);  
        background.setFitHeight(552);  
        pane.getChildren().add(background);  

        ImageView userIcon = new ImageView(new Image("file:../imige/user.png"));  
        userIcon.setFitWidth(200);  
        userIcon.setFitHeight(104);  
        userIcon.setLayoutX(141);  
        userIcon.setLayoutY(67);  
        pane.getChildren().add(userIcon);  

        passwordField = new PasswordField();  
        passwordField.setLayoutX(71);  
        passwordField.setLayoutY(309);  
        passwordField.setPrefWidth(246);  
        pane.getChildren().add(passwordField);  

        Label passwordLabel = new Label("Password");  
        passwordLabel.setLayoutX(153);  
        passwordLabel.setLayoutY(271);  
        passwordLabel.setTextFill(javafx.scene.paint.Color.WHITE);  
        passwordLabel.setFont(new Font("Bodoni MT Bold", 18));  
        pane.getChildren().add(passwordLabel);  

        usernameField = new TextField();  
        usernameField.setLayoutX(70);  
        usernameField.setLayoutY(229);  
        usernameField.setPrefWidth(246);  
        pane.getChildren().add(usernameField);  

        Label usernameLabel = new Label("User");  
        usernameLabel.setLayoutX(174);  
        usernameLabel.setLayoutY(187);  
        usernameLabel.setTextFill(javafx.scene.paint.Color.WHITE);  
        usernameLabel.setFont(new Font("Bodoni MT Bold", 18));  
        pane.getChildren().add(usernameLabel);  

        Button signInButton = new Button("Sign in");  
        signInButton.setLayoutX(124);  
        signInButton.setLayoutY(403);  
        signInButton.setPrefWidth(139);  
        signInButton.setPrefHeight(36);  
        signInButton.setTextFill(javafx.scene.paint.Color.valueOf("#1eff00"));  
        signInButton.setFont(new Font("Bell MT", 12));  
        signInButton.setOnAction(e -> signInButton(primaryStage));  
        pane.getChildren().add(signInButton);  

        label = new Label();  
        label.setLayoutX(94);  
        label.setLayoutY(360);  
        label.setPrefWidth(234);  
        label.setVisible(false);  
        pane.getChildren().add(label);  

        Button signUpButton = new Button("Signup");  
        signUpButton.setLayoutX(124);  
        signUpButton.setLayoutY(461);  
        signUpButton.setPrefWidth(139);  
        signUpButton.setPrefHeight(36);  
        signUpButton.setFont(new Font("Bell MT", 12));
        signUpButton.setOnAction(e -> signUpButton(primaryStage));  

        pane.getChildren().add(signUpButton);  
        

        
        loginScene = new Scene(root, 398, 543);  
        primaryStage.setScene(loginScene);  
        primaryStage.setTitle("BloodBank");
        primaryStage.show();  
    }  

    public void signInButton(Stage primaryStage) {  
        label.setVisible(true);  
        String username = usernameField.getText();  
        String password = passwordField.getText();  

     UserDatabase userDB = new UserDatabase();
    ArrayList<User> users = userDB.getUsers();

    boolean loggedIn = false;

    for (User user : users) {
        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            loggedIn = true;
            break;
        }
    }
        
        
        
        
        if(loggedIn){
        
        if (username.equals("yazeed") && password.equals("123")) {  
            
            MainMenu mainMenu = new MainMenu();  
            try {  
                mainMenu.start(primaryStage); 
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }
        
        else if(username.equals("hospital") && password.equals("123")){
            
              Hospital hospital = new Hospital(); 
            try {  
                hospital.start(primaryStage); 
            } catch (Exception e) {  
                e.printStackTrace();  
            }
            
        }
       
        else if(username.equals("manager") && password.equals("123")){
              Manager manager = new Manager(); 
            try {  
                manager.start(primaryStage); 
            } catch (Exception e) {  
                e.printStackTrace();  
            }
        }
        else if(username.equals("staff") && password.equals("123")){
              Staff staff = new Staff(); 
            try {  
                staff.start(primaryStage); 
            } catch (Exception e) {  
                e.printStackTrace();  
            }
        }
        else{
            
                MainMenu mainMenu = new MainMenu();  
            try {  
                mainMenu.start(primaryStage); 
            } catch (Exception e) {  
                e.printStackTrace();  
            } 
            
        }

        }
        
        
        else {  
            label.setText("Username or password is wrong!");   
        }  
    }  

        public void signUpButton(Stage primaryStage) {  
            
              CreeteAccount creeteAccount = new CreeteAccount();  
            try {  
                creeteAccount.start(primaryStage);
            } catch (Exception e) {  
                e.printStackTrace();  
            } 
            
        }

    
    
    public static void main(String[] args) {  
        launch(args);  
    }  
}  

