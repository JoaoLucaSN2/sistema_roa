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
public class ControllerVendas extends AbstractTableModel {

    private List lstJlrVendas;

    public void setList(List lstJlrVendas) {
        this.lstJlrVendas = lstJlrVendas;
    }

    public JlrVendas getBean(int rowIndex) {
        return (JlrVendas) lstJlrVendas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstJlrVendas.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JlrVendas vendas = (JlrVendas) lstJlrVendas.get(rowIndex);
        if (columnIndex == 0) {
            return vendas.getIdJlrVendas();
        } else if (columnIndex == 1) {
            return vendas.getJlrStatus();
        } else if (columnIndex == 2) {
            return vendas.getJlrTotal();
        } else if (columnIndex == 3) {
            return vendas.getJlrData();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Status";
        } else if (columnIndex == 2) {
            return "Total";
        } else if (columnIndex == 3) {
            return "Data e Hora";
        }
        return "";
    }
}
