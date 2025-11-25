/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.JlrVendasprodutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerVendasProdutos extends AbstractTableModel {

    private List lstJlrVendasProdutos;

    public void setList(List lstJlrVendasProdutos) {
        this.lstJlrVendasProdutos = lstJlrVendasProdutos;
        this.fireTableDataChanged();
    }
    
    public JlrVendasprodutos getBean(int rowIndex) {
        return (JlrVendasprodutos) lstJlrVendasProdutos.get(rowIndex);
    }

    public void addBean(JlrVendasprodutos jlrVendasprodutos) {
        lstJlrVendasProdutos.add(jlrVendasprodutos);
        this.fireTableDataChanged();
    }
    
    public void removeBean(int rowIndex) {
        lstJlrVendasProdutos.remove(rowIndex);
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return lstJlrVendasProdutos.size();                
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JlrVendasprodutos jlrVendasprodutos = (JlrVendasprodutos) lstJlrVendasProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return jlrVendasprodutos.getJlrProdutos().getIdJlrProdutos();
        } else if (columnIndex ==1) {
            return jlrVendasprodutos.getJlrProdutos().getJlrNome();
        } else if (columnIndex ==2) {
            return jlrVendasprodutos.getJlrQuantidade();
        } else if (columnIndex ==3) {
            return jlrVendasprodutos.getJlrValorUnitario();
        }else if (columnIndex ==4) {
            return jlrVendasprodutos.getJlrValorUnitario()*jlrVendasprodutos.getJlrQuantidade();
        }
        return ""; 
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Produto";         
        } else if ( columnIndex == 2) {
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Valor Unitário";
        } else if ( columnIndex == 4) {
            return "Total";
        } 
        return "";
    }
}
