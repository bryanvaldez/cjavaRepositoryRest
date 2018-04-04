/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.persistence.repository;

import com.rest.persistence.model.Cuenta;
import com.rest.persistence.projections.NoMonto;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author SBOOT060318
 */
@RepositoryRestResource(collectionResourceRel = "cuentas", path = "cuentas", excerptProjection = NoMonto.class)
public interface CuentasRepository extends PagingAndSortingRepository<Cuenta, Integer>{

    List<Cuenta> findByNroCuenta(@Param("nroCuenta") String nroCuenta);
    
}
