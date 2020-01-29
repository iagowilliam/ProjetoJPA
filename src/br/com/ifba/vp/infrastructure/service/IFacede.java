/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.vp.produto.model.bean.Produto;

/**
 *
 * @author iagow
 */
public interface IFacede {
    
    //------------- Produto -------------
    public abstract Produto saveProduto(Produto protudo);
    
    
    //------------- FuncionarioCaixa -------------
    //public abstract FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa);

}
