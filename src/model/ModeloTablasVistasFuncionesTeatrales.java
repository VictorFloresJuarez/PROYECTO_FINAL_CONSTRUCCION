package model;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class ModeloTablasVistasFuncionesTeatrales extends AbstractTableModel{
	//clase utilizada por el controlador de la vista de FUNCIONES teatrales para la creacion de la tabla
	
	protected static final String COLUMN_NAMES[] = {
	        "Nombre de la obra", "Fecha de la obra", "Hora de la obra"
	    };
	
	private ArrayList<FuncionTeatral> funcionesTeatrales;
	
	public ModeloTablasVistasFuncionesTeatrales(ArrayList<FuncionTeatral> obrasTeatrales) {
		this.funcionesTeatrales = new ArrayList<FuncionTeatral>(obrasTeatrales);
	}
	

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return funcionesTeatrales.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return COLUMN_NAMES.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		FuncionTeatral funcionTeatral=funcionesTeatrales.get(rowIndex);
		switch (columnIndex) {
		case 0: return funcionTeatral.getObraTeatral().getNombre();
		case 1: return funcionTeatral.getFechaPresentacion();
		case 2: return funcionTeatral.getHoraPresentacion();
		default:
			throw new IllegalArgumentException("Unexpected value: " + columnIndex);
		}
	}
	
	public String getColumnName(int column) {
		switch(column) {
		case 0:return "Nombre de la Obra";
		case 1: return "Fecha de la obra";
		case 2: return "Hora de la obra";
		default: 
			throw new IllegalArgumentException("Unexpected value: " + column);
		}
				
	}
	
	public Class<?> getColumnClass(int column) {
		return getValueAt(0,column).getClass();	
	}
	
	public boolean isCellEditable(int row, int column) {
		return false;
	}
	
	

}
