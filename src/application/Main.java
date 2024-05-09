package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
public static final String Styles = "Styles.css";
    @Override
    public void start(Stage primaryStage) {
        try {
          
            MyLabel label1 = new MyLabel("Lisseth Merchan", "Usuario.png");
            MyLabel label2 = new MyLabel("Ruth Chilan", "Usuario.png");
            MyLabel label3 = new MyLabel("Alisson Mora", "Usuario.png");
            MyLabel label4 = new MyLabel("Dayanna Lamilla", "Usuario.png");
            MyLabel label5 = new MyLabel("Alexa Orellana", "Usuario.png");
            

           
            VBox labelsContainer = new VBox(label1, label2, label3, label4, label5);
            ScrollPane scrollPane = new ScrollPane(labelsContainer);
           

         
            ObservableList<String> items = FXCollections.observableArrayList(
                    "Item 1", "Item 2", "Item 3", "Item 4", "Item 5");
            ListView<String> listView = new ListView<>(items);
           
         
            TextField textField = new TextField();

            
            VBox vBox = new VBox(listView, textField);
            vBox.setSpacing(10); 

          
            AnchorPane anchorPane = new AnchorPane();
            anchorPane.getChildren().addAll(scrollPane, vBox);

            
            AnchorPane.setTopAnchor(scrollPane, 10.0);
            AnchorPane.setLeftAnchor(scrollPane, 10.0);
            AnchorPane.setBottomAnchor(scrollPane, 10.0);
            AnchorPane.setRightAnchor(scrollPane, 250.0);

            AnchorPane.setTopAnchor(vBox, 10.0);
            AnchorPane.setRightAnchor(vBox, 10.0);
            AnchorPane.setBottomAnchor(vBox, 10.0);
            AnchorPane.setLeftAnchor(vBox, 250.0);

            
            Scene scene = new Scene(anchorPane, 500, 400);
            scene.getStylesheets().add(Styles);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Ejemplo de Interface");
            primaryStage.show();
           
  
           

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

   
    class MyLabel extends Label {
        public MyLabel(String text, String imagePath) {
            super(text);
            Image image = new Image(imagePath);
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(50);
            setGraphic(imageView); 
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
	

