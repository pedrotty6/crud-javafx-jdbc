module crud_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.graphics, javafx.fxml;
}



