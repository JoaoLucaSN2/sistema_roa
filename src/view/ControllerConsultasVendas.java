/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.JlrVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasVendas extends AbstractTableModel {

    private List lstVendedor;

    public void setList(List lstVendedor) {
        this.lstVendedor = lstVendedor;
        this.fireTableDataChanged();
        
    }
    
    public JlrVendedor getBean(int rowIndex) {
        return (JlrVendedor) lstVendedor.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendedor.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JlrVendedor jlrVendedor = (JlrVendedor) lstVendedor.get( rowIndex);
        if ( columnIndex == 0 ){
            return jlrVendedor.getIdJlrVendedor();
        } else if (columnIndex ==1) {
            return jlrVendedor.getJlrNome();        
        } else if (columnIndex ==2) {
            return jlrVendedor.getJlrTelefone();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Telefone";
        } 
        return "";
    }
}
