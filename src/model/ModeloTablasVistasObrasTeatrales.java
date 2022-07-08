package model;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class ModeloTablasVistasObrasTeatrales extends AbstractTableModel{
	protected static final String COLUMN_NAMES[] = {
	        "Nombre de la obra", "G\u00E9nero", "Resumen", "Duraci\\u00F3n"
	    };
	
	private ArrayList<ObraTeatral> obrasTeatrales;
	
	public ModeloTablasVistasObrasTeatrales(ArrayList<ObraTeatral> obrasTeatrales) {
		this.obrasTeatrales = new ArrayList<ObraTeatral>(obrasTeatrales);
	}
	

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return obrasTeatrales.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return COLUMN_NAMES.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		ObraTeatral obraTeatral=obrasTeatrales.get(rowIndex);
		switch (columnIndex) {
		case 0: return obraTeatral.getNombre();
		case 1: return obraTeatral.getGenero();
		case 2: return obraTeatral.getResumen();
		case 3: return obraTeatral.getDuracionEnMin();
		default:
			throw new IllegalArgumentException("Unexpected value: " + columnIndex);
		}
	}
	
	public String getColumnName(int column) {
		switch(column) {
		case 0:return "Nombre de la Obra";
		case 1: return "G\\u00E9nero";
		case 2: return "Resumen";
		case 3: return "Duraci\u00F3n";
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
