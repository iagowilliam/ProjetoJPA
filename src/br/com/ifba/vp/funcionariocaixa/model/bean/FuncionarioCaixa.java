/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionariocaixa.model.bean;

import br.com.ifba.vp.infrastructure.model.Funcionario;




/**
 *
 * @author Icaro
 */
public class FuncionarioCaixa extends Funcionario{
    
    private String especialização;

    public String getEspecialização() {
        return especialização;
    }

    public void setEspecialização(String especialização) {
        this.especialização = especialização;
    }

    
    
}
