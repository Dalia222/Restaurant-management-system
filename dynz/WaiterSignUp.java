/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dynz;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author dodo
 */
public class WaiterSignUp extends Scene {

    public WaiterSignUp(Parent parent, double d, double d1, Branches branch1, Tables t1, Customer c1, Manager m1, Owner owner1, Waiter waiter1, Menu menu1, Item item1, Order order1, Register Register1) {
        super(parent, d, d1);
        StackPane p = new StackPane();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10); //horizontal gap in pixels
        grid.setVgap(10); //vertical gap in pixels
        grid.setPadding(new Insets(10, 10, 10, 10));
        ImageView background2 = new ImageView("C:\\Users\\dell\\Documents\\NetBeansProjects\\DYNZ\\src\\Backmanager.jpg");
        background2.setFitHeight(600);
        background2.setFitWidth(1000);
        /* Create account form components*/
        Text scenetitle = new Text("Enter His Data:");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 18));
        grid.add(scenetitle, 0, 0, 2, 1);

        /* Adding the first name field */
        Label firstName = new Label("First Name:");
        grid.add(firstName, 0, 1);
        TextField firstNameTextField = new TextField();
        grid.add(firstNameTextField, 1, 1);
// Adding Back Button
        Button back = new Button("Back");
        grid.add(back, 0, 10);
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                System.out.println("Clicked");
                DYNZ.myStage.setScene(new ManagerMenu(new Pane(), 1000, 600, branch1, t1, c1, m1, owner1, waiter1, menu1, item1, order1, Register1));
            }
        });
        /* Adding the last name field */
        Label lastName = new Label("Last Name:");
        grid.add(lastName, 0, 2);
        TextField lastNameField = new TextField();
        grid.add(lastNameField, 1, 2);

        /* Adding the gender field */
        Label pn = new Label("Phone Number:");
        grid.add(pn, 0, 3);
        TextField Phonenumber = new TextField();
        grid.add(Phonenumber, 1, 3);

        /* Adding the level field */
        Label sal = new Label("Salary:");
        grid.add(sal, 0, 4);
        TextField salary = new TextField();
        grid.add(salary, 1, 4);
        /* Adding the username field */
        Label username = new Label("ID:");
        grid.add(username, 0, 5);
        TextField usernameField = new TextField();
        grid.add(usernameField, 1, 5);

        /* Adding the password field */
        Label password = new Label("Password:");
        grid.add(password, 0, 6);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 6);

        Label repassword = new Label("Confirm your Password:");
        grid.add(repassword, 0, 7);
        PasswordField pwreBox = new PasswordField();
        grid.add(pwreBox, 1, 7);

        /* Adding a Add Student button */
        Button addBtn = new Button("Add Waiter");
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Add Waiter");
                alert.setHeaderText(null);
                try {
                    if (m1.ADDWaiter(waiter1, firstNameTextField.getText(), lastNameField.getText(), Phonenumber.getText(), Integer.parseInt(salary.getText()), usernameField.getText(), pwBox.getText(), pwreBox.getText()).equals("done")) {
                        
                        alert.setContentText("Waiter Added");
                    } else if (m1.ADDWaiter(waiter1, firstNameTextField.getText(), lastNameField.getText(), Phonenumber.getText(), Integer.parseInt(salary.getText()), usernameField.getText(), pwBox.getText(), pwreBox.getText()).equals("passwords doesn't match")) {
                        alert.setContentText("Passwords doesn't match");
                    } else if (m1.ADDWaiter(waiter1, firstNameTextField.getText(), lastNameField.getText(), Phonenumber.getText(), Integer.parseInt(salary.getText()), usernameField.getText(), pwBox.getText(), pwreBox.getText()).equals("repeated ID")) {
                        alert.setContentText("Repeated ID");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(WaiterSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
                alert.show();
            }
        });
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(addBtn);
        grid.add(hbBtn, 1, 10);
        p.getChildren().addAll(background2, grid);
        p.getStylesheets().add("/dynz/WelcomeStyle.css");
        setRoot(p);
    }
}
