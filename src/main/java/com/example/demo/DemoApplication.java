package com.example.demo;

import com.example.demo.view.PrimaryStageView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        launchApp(DemoApplication.class, PrimaryStageView.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        super.start(stage);
    }
}
