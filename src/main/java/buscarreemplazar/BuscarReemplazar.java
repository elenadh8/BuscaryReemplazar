package buscarreemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazar extends Application {
	private Button buscar,reemplazar,reemplazartodo,cerrar,ayudar;
	private TextField buscarTextField,reemplazarTextField;
	private Label buscarlabel,reemplazarlabel;
	private CheckBox mayuCheck,buscarCheck,expresioncheck,resaltarcheck;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		buscar = new Button("Buscar");
		buscar.setPrefSize(130, 40);
		reemplazar = new Button("Reemplazar");
		reemplazar.setPrefSize(130,40);
		reemplazartodo = new Button("reemplazartodo");
		reemplazartodo.setPrefSize(130, 40);
		cerrar = new Button("cerrar");
		cerrar.setPrefSize(130, 40);
		ayudar = new Button("ayudar");
		ayudar.setPrefSize(130, 40);
		
		buscarTextField = new TextField ();
		buscarTextField.setPrefColumnCount(5);
		reemplazarTextField = new TextField();
		reemplazarTextField.setPrefColumnCount(5);
		
		buscarlabel = new Label("Buscar:");
		reemplazarlabel = new Label("Reemplazar con:");
		
		mayuCheck = new CheckBox("Mayusculas y minisculas");
		buscarCheck = new CheckBox("Expresion regular");
		expresioncheck = new CheckBox("Buscar hacia atras");
		resaltarcheck = new CheckBox("Resaltar resultados");
		

		VBox aVBox = new VBox(buscarlabel,reemplazarlabel);
		aVBox.setSpacing(5);
		VBox cVBox = new VBox(mayuCheck,buscarCheck);	
		cVBox.setSpacing(5);
		VBox dVBox = new VBox(expresioncheck,resaltarcheck);
		dVBox.setSpacing(5);
		VBox eVBox = new VBox(buscar,reemplazar,reemplazartodo,cerrar,ayudar);
		eVBox.setSpacing(5);
		
		HBox aHBox = new HBox(cVBox,dVBox);
		VBox bVBox = new VBox(buscarTextField,reemplazarTextField,aHBox);
		bVBox.setSpacing(5);
		
		GridPane root = new GridPane();
		root.setPadding(new Insets(6));
		root.setHgap(6);
		root.setVgap(6);
		root.setGridLinesVisible(false);
		root.addRow(0,aVBox,bVBox,eVBox);
		ColumnConstraints[]columnas= {new ColumnConstraints(),new ColumnConstraints(),new ColumnConstraints()};
		columnas[1].setHalignment(HPos.CENTER);
		columnas[1].setHgrow(Priority.ALWAYS);
		columnas[1].setFillWidth(true);
		
		Scene scene = new Scene(root, 320, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
