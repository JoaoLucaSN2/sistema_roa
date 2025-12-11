/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.JlrVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasVendas extends AbstractTableModel {

    private List lstVendas;

    public void setList(List lstVendas) {
        this.lstVendas = lstVendas;
        this.fireTableDataChanged();
        
    }
    
    public JlrVendas getBean(int rowIndex) {
        return (JlrVendas) lstVendas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendas.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JlrVendas jlrVendas = (JlrVendas) lstVendas.get( rowIndex);
        if ( columnIndex == 0 ){
            return jlrVendas.getIdJlrVendas();
        } else if (columnIndex ==1) {
            return jlrVendas.getJlrStatus();        
        } else if (columnIndex ==2) {
            return jlrVendas.getJlrTotal();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Status";         
        } else if ( columnIndex == 2) {
            return "Totals";
        } 
        return "";
    }
}
