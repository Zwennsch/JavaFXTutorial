module com.sven.java.fx.jfxTutorial {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sven.java.fx.jfxTutorial to javafx.fxml;
    exports com.sven.java.fx.jfxTutorial;
}