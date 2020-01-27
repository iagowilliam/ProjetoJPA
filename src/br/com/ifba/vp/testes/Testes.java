/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.testes;

import br.com.ifba.vp.produto.model.bean.Produto;
import br.com.ifba.vp.produto.model.dao.ProdutoDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author iagow
 */
public class Testes {
    
    public static void main(String[] args) {
        
        //SALVANDO PRODUTO NA BASE DE DADOS
        
        /*Produto p = new Produto();
        
        p.setCodigoBarras(999);
        p.setDataValidade("16/10/2020");
        p.setGenero("Alimenticio");
        p.setLote(1);
        p.setNomeProduto("Carne");
        p.setPreco(12.00);
        p.setSecao(10);
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        
        em.close();*/
        
        //PROCUTANDO UM PRODUTO NA BASE DE DADOS PELO SEU CÓDIGO DE BARRAS
        
        /*ProdutoDAO pdao = new ProdutoDAO();
        Produto p = pdao.findByCodBarras(999);
        
        System.out.println("Nome: " + p.getNomeProduto());
        System.out.println("Lote: " + p.getLote());
        System.out.println("Preço: " + p.getPreco());
        System.out.println("Data de Validade: " + p.getDataValidade());*/
        
        
        //PEGANDO TODOS OS PROCUTOS DA BASE DE DADOS 
        
        /*ProdutoDAO pdao = new ProdutoDAO();
        
        for(Produto p: pdao.findAll()){
            System.out.println("Nome Produto: " + p.getNomeProduto());
        }*/
        
        //REMOVENDO UM PRODUTO DA BASE DE DADOS
        
        /*ProdutoDAO pdao = new ProdutoDAO();
        
        pdao.remove(999);*/
        
        
    }
    
}
