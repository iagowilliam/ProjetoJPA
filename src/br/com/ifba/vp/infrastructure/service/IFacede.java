/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.cliente.model.bean.Cliente;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author iagow
 */
public interface IFacede {
    
    //------------- Produto -------------
    public abstract Produto saveProduto(Produto protudo);
    
    public abstract List <Produto> findByNomeProduto(String nomeProduto);
    
    public abstract List <Produto> findByCodBarras (Integer codigoBarras);
    
    //public abstract List <Produto> deleteProduto(Integer codigoBarras);
    
    //public abstract Produto deleteProduto(Integer codigoBarras);
    
    //------------- FuncionarioCaixa -------------
    public abstract FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa);

    public abstract List <FuncionarioCaixa> findByCpfFuncionario(Long CPF);
    
    public abstract List <FuncionarioCaixa> login();
    //------------- Fornecedor -------------
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    
    //------------- Cliente -------------
    public abstract Cliente saveCliente(Cliente cliente);
}
