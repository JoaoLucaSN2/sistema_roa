/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.JlrUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerUsuarios extends AbstractTableModel {

    private List lstJlrUsuarios;

    public void setList(List lstJlrUsuarios) {
        this.lstJlrUsuarios = lstJlrUsuarios;
    }
    
    public JlrUsuarios getBean(int rowIndex) {
        return (JlrUsuarios) lstJlrUsuarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstJlrUsuarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JlrUsuarios usuarios = (JlrUsuarios) lstJlrUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return usuarios.getIdJlrUsuarios();
        } else if (columnIndex ==1) {
            return usuarios.getNome();        
        } else if (columnIndex ==2) {
            return usuarios.getApelido();
        } else if (columnIndex ==3) {
            return usuarios.getCpf();
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
            return "Apelido";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
}
