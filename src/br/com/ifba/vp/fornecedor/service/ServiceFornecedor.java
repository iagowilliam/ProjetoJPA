/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.service;

import br.com.ifba.vp.fornecedor.dao.FornecedorDAO;
import br.com.ifba.vp.fornecedor.dao.IFornecedorDAO;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.infrastructure.exception.BusinessException;

/**
 *
 * @author iagowillian
 */
public class ServiceFornecedor implements IServiceFornecedor{
    
    //Representa mensagem de erro de o produto for null
    public final static String FORNECEDOR_NULL = "Fornecedor null";
    
    //Objeto que faz a comunicação com a camada dao
    private final IFornecedorDAO fornecedorDAO = new FornecedorDAO();
    
    //Salva o fornecedor
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor){
        
        if(fornecedor == null){
            //Tratamento de exeção
            throw new BusinessException(FORNECEDOR_NULL);
        }
        
        return this.fornecedorDAO.save(fornecedor);
    }
}
