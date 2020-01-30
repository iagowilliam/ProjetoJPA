/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Icaro
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
abstract public class Funcionario extends Pessoa{
    
    protected String email;
    protected int Senha;
    
   /* abstract void CadastroCliente();
    
    abstract void CadastroProduto();
    
    abstract void ControleEstoque();*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int Senha) {
        this.Senha = Senha;
    }
    
    
}
