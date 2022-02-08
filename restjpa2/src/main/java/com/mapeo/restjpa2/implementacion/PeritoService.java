package com.mapeo.restjpa2.implementacion;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.mapeo.restjpa2.dto.PeritosDto;
import com.mapeo.restjpa2.entity.Peritos;
import com.mapeo.restjpa2.repository.PeritoRepository;
import com.mapeo.restjpa2.ws.PeritoServiceInterface;



@Component
public class PeritoService implements PeritoServiceInterface{

	@Autowired
	PeritoRepository peritoRepo;
	
	@Override
	public List<Peritos> getPeritos(){
		return peritoRepo.findAll();
	}
	
	@Override
	public Peritos guardarPerito(@RequestBody PeritosDto peritoDto) {
		
		Peritos perito =  convertirPeritosDtoAPerito(peritoDto);
		return peritoRepo.save(perito);
	}
	
	@Override
	public void eliminarPerito(@PathVariable("id") Integer id) {
		Optional<Peritos> peritoExistente = peritoRepo.findById(id);
		if(peritoExistente.isPresent()) {
			peritoRepo.delete(peritoExistente.get());
		}
	}
	
	@Override
	public List<Peritos> getPeritosPorInicialNumeroTelefono(@RequestParam("inicialTelefono") Integer inicialTelefono){
		return peritoRepo.findByTelefonoContactoNotLike(inicialTelefono);
	}
	
	@Override
	public List<Peritos> getPeritosNulos(){
		return peritoRepo.findByApellidoPerito2IsNullOrTelefonoOficinaIsNull();
	}
	
	public Peritos convertirPeritosDtoAPerito(PeritosDto peritoDto) {
			
		ModelMapper map =  new ModelMapper();
		return map.map(peritoDto, Peritos.class);
	}
	
}
