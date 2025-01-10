package title;

import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(getParameters().getNamed().get("title"));
        stage.show();
    }
   }

