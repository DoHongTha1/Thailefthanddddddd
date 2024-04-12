package com.example.thailefthanddddddd;

import com.example.thailefthanddddddd.utils.ToolFXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HelloController {
    public TextField tfPassword;
    public TextField tfUsername;
    public AnchorPane home;
    public Pane loginPage;
    public ImageView homeImage;
    public AnchorPane trangchu;
    public AnchorPane nhanvien;

    public void login() throws IOException {
        String username = tfUsername.getText();
        String password = tfPassword.getText();

        if(username.equals("1") && password.equals("1"))
        {
            ToolFXML.openFXML("home.fxml");
            ToolFXML.closeFXML(loginPage);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Tai khoan hoac mat khau sai");
            alert.showAndWait();
        }
    }




    public void salary(ActionEvent actionEvent) {

    }

    public void schedule(ActionEvent actionEvent) {
    }


}