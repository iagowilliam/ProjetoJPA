/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.dao;

import br.com.ifba.vp.infrastructure.model.AbstractEntity;
import java.util.List;

/**
 *
 * @author iagow
 * @param <Entity>
 */
public interface IGenericDAO <Entity extends AbstractEntity> {
    
    
    /**
     * Salva uma instância de uma entidade persistente no banco de dados.
     * 
     * @param obj a instância que é inserida
     * @return a entidade
     */
    Entity save(Entity obj);
    
    /**
     *
     * @param obj
     */
    void delete(Entity obj);
    
}
