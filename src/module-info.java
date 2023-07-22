module MP3Player {
	requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;
    requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
