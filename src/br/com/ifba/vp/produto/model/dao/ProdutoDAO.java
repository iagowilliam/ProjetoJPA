/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.model.dao;

//import br.com.ifba.vp.infrastructure.dao.ConnectionFactory;
import br.com.ifba.vp.infrastructure.dao.GenericDAO;
import br.com.ifba.vp.produto.model.bean.Produto;
import javax.persistence.EntityManager;
import java.util.List;



/**
 *
 * @author iagow
 */
public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO{
    
    /*public Produto save(Produto produto){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try{
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
            
        }catch (Exception e){
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
          
        return produto;
    }*/
    
    
    
    public Produto findByCodBarras(Integer codigoBarras){
        
        //EntityManager em = new ConnectionFactory().getConnection();
        Produto produto = null;
        
        try{
            produto = em.find(Produto.class, codigoBarras);
                    
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return produto;
    }
    
   /* public List<Produto> findAll(){
        
        //EntityManager em = new ConnectionFactory().getConnection();
        
        List<Produto> produtos = null;
        
        try{
            
            produtos = em.createQuery("from Produto p").getResultList();
                    
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return produtos;
        
    }
    
    public Produto remove(Integer codigoBarras){
        
        //EntityManager em = new ConnectionFactory().getConnection();
        Produto produto = null;
        
        try{
            produto = em.find(Produto.class, codigoBarras);
            em.getTransaction().begin();
            em.remove(produto);
            em.getTransaction().commit();
            
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback(); 
        }finally{
            em.close();
        }
        
        return produto;
    }*/
            
}
