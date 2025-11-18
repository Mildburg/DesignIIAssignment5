package alexgessner.designiiassignment5;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * App class to start the window and load the scenes.
 */

public class App extends Application {
    private static Scene scene;

    /**
     * Starts the scene;
     * @param stage - Stage for the first scene.
     * @throws IOException - just throws exception
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("CRUDView"), 640, 480);
        stage.setTitle("Create new Character");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Load FXML method to make code more concise.
     * @param fxml - string of filepath
     * @return - returns a parent and loads the file.
     * @throws IOException - throws the exception
     */
    public static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}