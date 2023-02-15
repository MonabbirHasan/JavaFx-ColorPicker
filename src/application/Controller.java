package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {

	
	@FXML
	private ColorPicker GetColor;
	@FXML
	private Pane BgColor;
	
	
	
	public void ChangeColor(ActionEvent event) {
		Color myColor=GetColor.getValue();
		BgColor.setBackground(new Background(new BackgroundFill(myColor, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	
}
