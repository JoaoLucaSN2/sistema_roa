/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.JlrClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class ControllerClientes extends AbstractTableModel {

    private List lstJlrClientes;

    public void setList(List lstJlrClientes) {
        this.lstJlrClientes = lstJlrClientes;
    }

    public JlrClientes getBean(int rowIndex) {
        return (JlrClientes) lstJlrClientes.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstJlrClientes.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JlrClientes clientes = (JlrClientes) lstJlrClientes.get(rowIndex);
        if (columnIndex == 0) {
            return clientes.getIdJlrClientes();
        } else if (columnIndex == 1) {
            return clientes.getJlrNome();
        } else if (columnIndex == 2) {
            return clientes.getJlrCpf();
        } else if (columnIndex == 3) {
            return clientes.getJlrCep();
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
            return "Cep";
        }
        return "";
    }
}
