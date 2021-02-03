package com.estudo.pontointeligente.api.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.estudo.pontointeligente.api.entities.Empresa;


@SpringBootTest
@ActiveProfiles("test")
public class EmpresaRepositoryTest {
	
	@Autowired
	private EmpresaRepository empRepository;
	
	private static final String CNPJ = "51463645000100";
	
	@Before
	public void setUp() throws Exception{
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Empresa de exemplo");
		empresa.setCnpj(CNPJ);
		this.empRepository.save(empresa);
	}
	
	@After
	public final void tearDown() {
		this.empRepository.deleteAll();
	}
	
	@Test
	public void testBuscarPorCNPJ() {
		Empresa empresa = this.empRepository.findByCnpj(CNPJ);
		assertEquals(CNPJ, empresa.getCnpj());
	}
	
}
