import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Created by Bunzio on 04.04.2018
 * Contact: bunzeladam@gmail.com
 */
public class TikTakTokeApplication extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Kółko i Krzyżyk by bunzio v1.0.0");
        FXMLLoader fxmlLoader = new FXMLLoader(TikTakTokeApplication.class.getClassLoader().getResource("gui/gui" +
                ".fxml"));
        Parent layout = fxmlLoader.load();

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();



    }


}

