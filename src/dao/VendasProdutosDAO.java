/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JlrVendas;
import bean.JlrVendasprodutos;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;



/**
 *
 * @author u1845853
 */
public class VendasProdutosDAO extends AbstractDAO{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();        
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();        
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();        
        session.delete(object);
        session.getTransaction().commit();        
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JlrVendasprodutos.class);
        criteria.add(Restrictions.eq("id_jlr_vendasProdutos", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
    }

    public Object listProdutos(JlrVendas vendas) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JlrVendasprodutos.class);
        criteria.add(Restrictions.eq("jlrVendas", vendas));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
    }
    
    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JlrVendasprodutos.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;    
    }

    public static void main(String[] args) {
        VendasProdutosDAO vendasProdutosDAO = new VendasProdutosDAO();
        vendasProdutosDAO.listAll();
    }
    public boolean existeId(int id) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(JlrVendasprodutos.class);
    criteria.add(Restrictions.eq("id_jlr_vendasProdutos", id));
    List lista = criteria.list();
    session.getTransaction().commit();

    return !lista.isEmpty();
    }
}
