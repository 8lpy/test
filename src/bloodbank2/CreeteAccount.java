
package bloodbank2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CreeteAccount extends Application {

    private TextField usernameTextField;
    private PasswordField passwordField;
    
    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        root.setPrefHeight(543.0);
        root.setPrefWidth(398.0);
        root.setStyle("-fx-background-color: #ff007f;");

        Button createAccountButton = new Button("Create the account");
        createAccountButton.setLayoutX(99.0);
        createAccountButton.setLayoutY(301.0);
        createAccountButton.setPrefHeight(81.0);
        createAccountButton.setPrefWidth(182.0);
        createAccountButton.setFont(Font.font("System Bold", 15.0));
        createAccountButton.setOnAction(e -> createAccountButton(primaryStage));  


         usernameTextField = new TextField();
        usernameTextField.setLayoutX(99.0);
        usernameTextField.setLayoutY(197.0);
        usernameTextField.setPrefHeight(25.0);
        usernameTextField.setPrefWidth(182.0);
        usernameTextField.setPromptText("username");
        usernameTextField.setStyle("-fx-background-radius: 10px;");

         passwordField = new PasswordField();
        passwordField.setLayoutX(99.0);
        passwordField.setLayoutY(247.0);
        passwordField.setPrefHeight(25.0);
        passwordField.setPrefWidth(182.0);
        passwordField.setPromptText("password");
        passwordField.setStyle("-fx-background-radius: 10px;");

        Button backButton = new Button("Back");
        backButton.setLayoutX(99.0);
        backButton.setLayoutY(407.0);
        backButton.setPrefHeight(81.0);
        backButton.setPrefWidth(182.0);
        backButton.setFont(Font.font("System Bold", 15.0));
        backButton.setOnAction(e -> backButton(primaryStage));  


        root.getChildren().addAll(createAccountButton, usernameTextField, passwordField, backButton);

        Scene scene = new Scene(root, 398, 543);

        primaryStage.setTitle("Blood Bank View");
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
     
      public void createAccountButton(Stage primaryStage) {
                
        String username = usernameTextField.getText();  
        String password = passwordField.getText();
          
        UserDatabase userDB = new UserDatabase();
        userDB.addUser(username, password); 
        
        
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



 class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}


 class UserDatabase {
    private ArrayList<User> users = new ArrayList<>();
    private static final String FILENAME = "users.txt";

    public UserDatabase() {
        loadUsersFromFile();
        
      addUser("yazeed", "123");
        addUser("hospital", "123");
        addUser("manager", "123");
        addUser("staff", "123");

        
    }

    private void loadUsersFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                addUser(data[0], data[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveUsersToFile() {
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            for (User user : users) {
                bw.write(user.getUsername() + "," + user.getPassword());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     void addUser(String username, String password) {
        User newUser = new User(username, password);
        users.add(newUser);
        saveUsersToFile();
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
