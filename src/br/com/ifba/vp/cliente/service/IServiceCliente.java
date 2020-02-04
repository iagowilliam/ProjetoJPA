/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.service;

import br.com.ifba.vp.cliente.model.bean.Cliente;

/**
 *
 * @author iagowillian
 */
public interface IServiceCliente {
    
    
    public abstract Cliente saveCliente(Cliente cliente);
}
