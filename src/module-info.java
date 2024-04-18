module crud_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	requires java.sql;
	requires org.jfxtras.styles.jmetro;
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.graphics, javafx.fxml;
	opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
}



