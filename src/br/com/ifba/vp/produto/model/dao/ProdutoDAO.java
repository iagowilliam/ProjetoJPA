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
import javax.persistence.Query;



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
    
    
    
    @Override
    public List <Produto> findByCodBarras(Integer codigoBarras){
        
        String query = "select p from Produto p where upper(p.codigoBarras) like upper('" + codigoBarras +"%')";
                
        return GenericDAO.em.createQuery(query).getResultList();
    }
    
    /*@Override
    public List <Produto> deleteProduto(Integer codigoBarras){
        
        //String query = "delete p from Produto p where upper(p.codigoBarras) like upper('" + codigoBarras +"%')";
        String query = "delete * from Produto where upper(codigoBarras) like upper('" + codigoBarras +"%')";
        return GenericDAO.em.createQuery(query).getResultList();
    }*/
    
    /*@Override
    public Produto deleteProduto(Integer codigoBarras){
        
        String query = "delete p from Produto p where like upper('" + codigoBarras +"%')";
        //String query = "delete p from Produto p where p.codigoBarras=:codigoBarras";
        //Query query = em.createQuery("delete p from Produto p where p.codigoBarras=:codigoBarras");
        //query.setParameter("codigoBarras", codigoBarras);
        //return (Produto) query.getSingleResult();
        return (Produto) GenericDAO.em.createQuery(query).getSingleResult();
    }*/
    
    @Override
    public List <Produto> findByNomeProduto(String nomeProduto){
        
        
        //Query query = em.createQuery("select produto.nomeProduto, produto.preco, produto.secao, produto.dataValidade from Produto as produto where produto.nomeProduto=:nome");
        //Query query = em.createQuery("select p from Produto as p where p.nomeProduto=:nomeProduto");
        //query.setParameter("nomeProduto",produto.getNomeProduto());
        //return query.getResultList();
        
        String query = "select p from Produto p where upper(p.nomeProduto) like upper('" + nomeProduto +"%')";
        
        
        
        return GenericDAO.em.createQuery(query).getResultList();
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
