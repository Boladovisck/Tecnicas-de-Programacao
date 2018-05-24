import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
 	Stage janela;
 	Scene cena1,cena2;
 	Button button1,button2;


	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception{
		janela = primaryStage;
		janela.setTitle("Ayy limão");
		button1 = new Button("pra cena 2");
		button1.setOnAction(e -> janela.setScene(cena2));
		
		button2 = new Button("pra cena 1");
		button2.setOnAction(e-> janela.setScene(cena1));
		
		VBox Layout = new VBox(20);
		Layout.getChildren().add(button1);
		cena1 = new Scene(Layout, 300 , 250);
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button2);
		cena2= new Scene(layout,500,500);
		
		janela.setScene(cena1);
		
		janela.show();


	}
	
	
} 
