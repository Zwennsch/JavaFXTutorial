package com.sven.java.fx.jfxTutorial;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setScene(new Scene(createContent()));
    	stage.show();
    }

    private Parent createContent() {
    	VBox root = new VBox();
    	root.setPrefSize(600, 480);
    	
    	TextField input = new TextField();
    	input.setFont(new Font(20));
    	Text output = new Text();
    	
    	output.textProperty().bindBidirectional(input.textProperty());
    	
    	Button button = new Button("Press");
//    	button.setOnAction(e -> {
//    		output.setText(input.getText());
//    	});
    	root.getChildren().addAll(input, button,output);
    	return root;
    }

    public static void main(String[] args) {
        launch(args);
    }

}