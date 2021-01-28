package com.estudo.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.estudo.pontointeligente.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa,Long>{
	
	@Transactional(readOnly = true) // metodo de consulta
	Empresa findByCnpj (String cnpj);
	
	
	
}
