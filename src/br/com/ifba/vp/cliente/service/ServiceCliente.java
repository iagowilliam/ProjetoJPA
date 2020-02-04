/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.service;

import br.com.ifba.vp.cliente.dao.ClienteDAO;
import br.com.ifba.vp.cliente.dao.IClienteDAO;
import br.com.ifba.vp.cliente.model.bean.Cliente;
import br.com.ifba.vp.infrastructure.exception.BusinessException;

/**
 *
 * @author iagowillian
 */
public class ServiceCliente implements IServiceCliente{
    
    //Representa mensagem de erro de o cliente for null
    public final static String CLIENTE_NULL = "Cliente null";
    
    //Objeto que faz a comunicação com a camada dao
    private final IClienteDAO clienteDAO = new ClienteDAO();
    
    //Salva o cliente
    @Override
    public Cliente saveCliente(Cliente cliente){
        
        if(cliente == null){
            //Tratamento de exeção
            throw new BusinessException(CLIENTE_NULL);
        }
        
        return this.clienteDAO.save(cliente);
    }
    
}

