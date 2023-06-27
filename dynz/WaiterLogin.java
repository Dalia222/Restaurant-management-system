///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package dynz;
//
//import javafx.event.ActionEvent;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.StackPane;
//
///**
// *
// * @author dell
// */
//public class WaiterLogin extends Scene{
//     public WaiterLogin(StackPane parent, double d, double d1) {
//        super(parent, d, d1);
//
//        GridPane g1 = new GridPane();
//
//        ImageView background1 = new ImageView("C:\\Users\\dell\\Desktop\\wooden-board-empty-table-top-blurred-background.png");
//        background1.setFitHeight(600);
//        background1.setFitWidth(1000);
//        final PasswordField pf = new PasswordField();
//        Label un = new Label("Username");
//        Label pass = new Label("Password");
//
//        g1.add(un, 0, 1);
//        g1.add(new TextField(), 0, 2);
//        g1.add(pass, 3, 1);
//        g1.add(pf, 3, 2);
//
//        Button Login = new Button("Login");
//        Button Back = new Button("Back");
//        g1.add(Login, 0, 13);
//        g1.add(Back, 9, 13);
//
//        Back.setOnAction((ActionEvent event) -> {        
//            DYNZ.myStage.setScene(new Welcome(new Label(), 1000, 600));
//
//        });
//
//        Login.setOnAction((ActionEvent Event) -> {
//             DYNZ.myStage.setScene(new Waiter(new Label(), 1000, 600));
//        });
//
//        g1.setAlignment(Pos.CENTER);
//        g1.getStylesheets().add("/dynz/WelcomeStyle.css");
//        parent.getChildren().addAll(background1, g1);
//        setRoot(parent);
//    }
//}
