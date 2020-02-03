/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.model.dao;

import br.com.ifba.vp.infrastructure.dao.IGenericDAO;
import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author iagow
 */
public interface IProdutoDAO extends IGenericDAO<Produto>{
    
    public abstract List <Produto> findByNomeProduto(String nomeProduto);
    
}
