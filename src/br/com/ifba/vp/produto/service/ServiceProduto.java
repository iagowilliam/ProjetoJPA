 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.service;

import br.com.ifba.vp.infrastructure.exception.BusinessException;
import br.com.ifba.vp.produto.model.bean.Produto;
import br.com.ifba.vp.produto.model.dao.IProdutoDAO;
import br.com.ifba.vp.produto.model.dao.ProdutoDAO;
import java.util.List;

/**
 *
 * @author iagow
 */
public class ServiceProduto implements IServiceProduto{
    
    //Representa mensagem de erro se o produto for null
    public final static String PRODUTO_NULL = "Produto null";
    
    //Objeto que faz a comunicação com a camada DAO
    private final IProdutoDAO produtoDAO = new ProdutoDAO();
    
    //Salva o produto
    @Override
    public Produto saveProduto(Produto produto) {
        
        if(produto == null){
            //Tratamento de exceção
            throw new BusinessException(PRODUTO_NULL);
        }
        
        return this.produtoDAO.save(produto);
    }
    
    @Override
    public List <Produto> findByNomeProduto(String nomeProduto){
        
        return this.produtoDAO.findByNomeProduto(nomeProduto);
    }
      
    @Override
    public List <Produto> findByCodBarras(Integer codigoBarras){
        return this.produtoDAO.findByCodBarras(codigoBarras);
    }
    
    @Override
    public void deleteByCodigoBarras(Produto produto){
        if(produto == null){
            throw new BusinessException(PRODUTO_NULL);
        }
        
        this.produtoDAO.delete(produto);
        
    }
    
}
