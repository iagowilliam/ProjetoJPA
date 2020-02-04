/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionariocaixa.service;

import br.com.ifba.vp.funcionariocaixa.model.dao.FuncionarioCaixaDAO;
import br.com.ifba.vp.funcionariocaixa.model.dao.IFuncionarioCaixaDAO;
import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.vp.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author iagowillian
 */
public class ServiceFuncionarioCaixa implements IServiceFuncionarioCaixa{
    
    //Representa mensagem de erro se o funcionariofor null
    public final static String FUNCIONARIOCAIXA_NULL = "Funcionario null";
    
    //Objeto que faz a comunicação com a camada DAO
    private final IFuncionarioCaixaDAO funcionarioCaixaDAO = new FuncionarioCaixaDAO();
    
    //Salva o produto
    @Override
    public FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa) {
        
        if(funcionarioCaixa == null){
            //Tratamento de exceção
            throw new BusinessException(FUNCIONARIOCAIXA_NULL);
        }
        
        return this.funcionarioCaixaDAO.save(funcionarioCaixa);
    }
    
    @Override
    public List <FuncionarioCaixa> findByCpfFuncionario(Long CPF){
        return this.funcionarioCaixaDAO.findByCpfFuncionario(CPF);
    }
    
    public List <FuncionarioCaixa> login(){
        return this.funcionarioCaixaDAO.login();
    }
    
}
