package com.example.thailefthanddddddd;

import com.example.thailefthanddddddd.utils.ToolFXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class HelloController {
    public TextField tfPassword;
    public TextField tfUsername;
    public AnchorPane home;
    public Pane loginPage;

    public void login() throws IOException {
        String username = tfUsername.getText();
        String password = tfPassword.getText();

        if(username.equals("thailefthand") && password.equals("phongrighthand"))
        {
            ToolFXML.openFXML("home.fxml");
            ToolFXML.closeFXML(loginPage);
        }
        else {
            System.out.println("sai tk mk");
        }
    }
}