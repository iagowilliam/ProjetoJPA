/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

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
    public List <Produto> findByNomeProduto(Produto produto){
        return this.serviceProduto.findByNomeProduto(produto);
    }
    
    //------------FUNCIONARIO CAIXA-------------
    
   /* private final IServiceFuncionarioCaixa serviceFuncionarioCaixa = new ServiceFuncionarioCaixa();
    
    @Override
    public FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa){
        return this.serviceFuncionarioCaixa.saveFuncionario(funcionarioCaixa);
    }*/
    
    //------------FORNECEDOR-------------
    private final IServiceFornecedor serviceFornecedor = new ServiceFornecedor();
    
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor){
        return this.serviceFornecedor.saveFornecedor(fornecedor);
    }
}
