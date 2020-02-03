/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.service;

import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author iagow
 */
public interface IServiceProduto {
    
    
   //Método que salva o produto na base de dados
    public abstract Produto saveProduto(Produto produto);
    
    //Método que busca um produto da base de dados
    public abstract List <Produto> findByNomeProduto(String nomeProduto); 
}
