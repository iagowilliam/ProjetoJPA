/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionariocaixa.service;

import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;

/**
 *
 * @author iagowillian
 */
public interface IServiceFuncionarioCaixa {
    
    //Metodo que salva o funcionario na base de dados
    public abstract FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa);
    
}
