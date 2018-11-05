package com.mattihew;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application
{

    public static void main(final String[] args)
    {
        Application.launch(Main.class, args);
    }

    @Override
    public void start(final Stage primaryStage) throws IOException
    {
        final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("fxml/Main.fxml"), null, null, c -> this);
        final Scene scene = new Scene(root, -1, -1);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
