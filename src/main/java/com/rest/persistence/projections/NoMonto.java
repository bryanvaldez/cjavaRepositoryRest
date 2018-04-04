/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.persistence.projections;

import com.rest.persistence.model.Cuenta;
import org.springframework.data.rest.core.config.Projection;

/**
 *
 * @author SBOOT060318
 */
//@Projection(name = "noMonto", types = Cuenta.class)
public interface NoMonto {
    Integer getIdCuenta();
    Integer getNroCuenta();
}
