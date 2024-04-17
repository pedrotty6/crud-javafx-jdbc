package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepartamento;
	
	@FXML
	private MenuItem menuItemSobre; 
	
	@FXML
	public void onMenuItemVendedorAction() {
		System.out.println("VENDEDOR");
	}
	
	@FXML
	public void onMenuItemDepartmamentoAction() {
		System.out.println("DEPARTAMENTO");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("SOBRE");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
