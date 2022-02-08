package com.mapeo.restjpa2;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mapeo.restjpa2.entity.Seguros;
import com.mapeo.restjpa2.repository.SeguroRepository;
import com.mapeo.restjpa2.utilidades.Utilidades;

@SpringBootTest
class SeguroServiceTest {

	
	private static Log LOG = LogFactory.getLog(SeguroServiceTest.class);
	
	@Autowired
	SeguroRepository seguroRepo;
	
	@Autowired
	Utilidades utilidad;
	
	@Test
	void getSeguros() {
		
		List<Seguros> listaObtenida = seguroRepo.findAll();
		
		LOG.info("TEST getSeguros: COMPLETADO CON EXITO");
		assertTrue(listaObtenida.size()>0,"PRUEBA UNITARIA EXITOSA: getSeguros");
	}
	
	@Test
	void guardarSeguro() {
		Seguros seguro =  new Seguros();

		seguro.setCondicionesParticulares("ACCIDENTE");
		seguro.setDniCl(8);
		seguro.setFechaInicio(new Date());
		seguro.setFechaVencimiento(utilidad.getFecha("10/11/2022"));
		seguro.setRamo("vida");
		
		
		Seguros resultadoGuardar = seguroRepo.save(seguro);
		
		LOG.info("TEST guardarSeguro: COMPLETADO CON EXITO");
		assertNotNull(resultadoGuardar,"PRUEBA UNITARIA EXITOSA: guardarSeguro");
	}
	
	@Test
	void eliminarSeguro() {
		
		Optional<Seguros> seguroBusqueda =  seguroRepo.findById(29);
		if(seguroBusqueda.isPresent()) {
			seguroRepo.delete(seguroBusqueda.get());
		}
		
		LOG.info("TEST eliminarSeguro: COMPLETADO CON EXITO");
		assertTrue(true,"PRUEBA UNITARIA EXITOSA: eliminarSeguro");
		
	}
	
	@Test
	void getSegurosDespuesFecha() {
		
		List<Seguros> listaBusqueda = seguroRepo.findByFechaInicioAfter(utilidad.getFecha("2021-12-31"));

		LOG.info("TEST getSeguros: COMPLETADO CON EXITO");
		assertTrue(listaBusqueda.size()>0,"PRUEBA UNITARIA EXITOSA: getSeguros");
	}
	

	
}
