/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author iagow
 */

@MappedSuperclass
public class AbstractEntity {
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
