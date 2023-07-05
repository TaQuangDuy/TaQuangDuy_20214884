package hust.soict.dsai.javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;   
    @FXML
    private ToggleGroup identical;
    
    private Color cl;

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
//    	newCircle.setCenterX(event.getX());
//    	newCircle.setCenterY(event.getY());
    	Circle newC = new Circle(event.getX(), event.getY(), 4, cl);
    	drawingAreaPane.getChildren().add(newC);
    }
    
    @FXML
    void eraserButtonPressed(ActionEvent event) {
    	cl = Color.WHITE;
    }

    @FXML
    void penButtonPressed(ActionEvent event) {
    	cl = Color.BLACK;
    }

}
