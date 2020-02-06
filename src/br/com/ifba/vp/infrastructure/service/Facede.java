/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.cliente.model.bean.Cliente;
import br.com.ifba.vp.cliente.service.IServiceCliente;
import br.com.ifba.vp.cliente.service.ServiceCliente;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.fornecedor.service.IServiceFornecedor;
import br.com.ifba.vp.fornecedor.service.ServiceFornecedor;
import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.vp.funcionariocaixa.service.IServiceFuncionarioCaixa;
import br.com.ifba.vp.funcionariocaixa.service.ServiceFuncionarioCaixa;
import br.com.ifba.vp.produto.model.bean.Produto;
import br.com.ifba.vp.produto.service.IServiceProduto;
import br.com.ifba.vp.produto.service.ServiceProduto;
import java.util.List;

/**
 *
 * @author iagow
 */
public class Facede implements IFacede {
    
    //------------PRODUTO-------------
    
    private final IServiceProduto serviceProduto = new ServiceProduto();
    
    @Override
    public Produto saveProduto(Produto produto){
        return this.serviceProduto.saveProduto(produto);
    }
    
    @Override
    public List <Produto> findByNomeProduto(String nomeProduto){
        return this.serviceProduto.findByNomeProduto(nomeProduto);
    }
    
    @Override
    public List <Produto> findByCodBarras(Integer codigoBarras){
        return this.serviceProduto.findByCodBarras(codigoBarras);
    }
    
    /*@Override
    public List <Produto> deleteProduto(Integer codigoBarras){
        return this.serviceProduto.deleteProduto(codigoBarras);
    }*/
    
    /*@Override
    public Produto deleteProduto(Integer codigoBarras){
        return this.serviceProduto.deleteProduto(codigoBarras);
    }*/
    
    //------------FUNCIONARIO CAIXA-------------
    
    private final IServiceFuncionarioCaixa serviceFuncionarioCaixa = new ServiceFuncionarioCaixa();
    
    @Override
    public FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa){
        return this.serviceFuncionarioCaixa.saveFuncionario(funcionarioCaixa);
    }
    
    public List <FuncionarioCaixa> findByCpfFuncionario(Long CPF){
        return this.serviceFuncionarioCaixa.findByCpfFuncionario(CPF);
    }
    
    public List <FuncionarioCaixa> login(){
        return this.serviceFuncionarioCaixa.login();
    }
    
    //------------FORNECEDOR-------------
    private final IServiceFornecedor serviceFornecedor = new ServiceFornecedor();
    
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor){
        return this.serviceFornecedor.saveFornecedor(fornecedor);
    }
    
    //------------CLIENTE-------------
    
    private final IServiceCliente serviceCliente = new ServiceCliente();
    
    @Override
    public Cliente saveCliente(Cliente cliente){
        return this.serviceCliente.saveCliente(cliente);
    }
}
