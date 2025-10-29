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
public class ControllerVendedor extends AbstractTableModel {

    private List lstJlrVendedor;

    public void setList(List lstJlrVendedor) {
        this.lstJlrVendedor = lstJlrVendedor;
    }

    public JlrVendedor getBean(int rowIndex) {
        return (JlrVendedor) lstJlrVendedor.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstJlrVendedor.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JlrVendedor vendedor = (JlrVendedor) lstJlrVendedor.get(rowIndex);
        if (columnIndex == 0) {
            return vendedor.getIdJlrVendedor();
        } else if (columnIndex == 1) {
            return vendedor.getJlrNome();
        } else if (columnIndex == 2) {
            return vendedor.getJlrCpf();
        } else if (columnIndex == 3) {
            return vendedor.getJlrTelefone();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Nome";
        } else if (columnIndex == 2) {
            return "Cpf";
        } else if (columnIndex == 3) {
            return "Telefone";
        }
        return "";
    }
}
