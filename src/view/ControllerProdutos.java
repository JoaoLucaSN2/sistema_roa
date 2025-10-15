/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.JlrProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class ControllerProdutos extends AbstractTableModel {

    private List lstJlrProdutos;

    public void setList(List lstJlrProdutos) {
        this.lstJlrProdutos = lstJlrProdutos;
    }

    public JlrProdutos getBean(int rowIndex) {
        return (JlrProdutos) lstJlrProdutos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstJlrProdutos.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JlrProdutos produtos = (JlrProdutos) lstJlrProdutos.get(rowIndex);
        if (columnIndex == 0) {
            return produtos.getIdJlrProdutos();
        } else if (columnIndex == 1) {
            return produtos.getJlrNome();
        } else if (columnIndex == 2) {
            return produtos.getJlrPreco();
        } else if (columnIndex == 3) {
            return produtos.getJlrTipo();
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
            return "Preço";
        } else if (columnIndex == 3) {
            return "Tipo";
        }
        return "";
    }
}
