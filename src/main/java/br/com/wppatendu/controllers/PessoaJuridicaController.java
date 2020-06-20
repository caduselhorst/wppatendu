package br.com.wppatendu.controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.wppatendu.entities.PessoaJuridica;
import br.com.wppatendu.repositories.PessoaJuridicaRepository;

@RestController
public class PessoaJuridicaController {

	private PessoaJuridicaRepository repository;
	
	public PessoaJuridicaController(PessoaJuridicaRepository repository) {
		this.repository = repository;
	}
	
	
	@RequestMapping(value="pessoajuridica/fonewa/{numero_wa}", method = RequestMethod.GET)
	public PessoaJuridica getPessoaJuridica(@PathVariable(name = "numero_wa") String numero) {
		
		Optional<PessoaJuridica> pf = repository.findByNumerowa(numero);
		
		if(!pf.isPresent()) {
			return null;
		} else {
			return pf.get();
		}
		
	}
	
	@RequestMapping(value="pessoajuridica/cnpj/{cnpj}", method = RequestMethod.GET)
	public PessoaJuridica getPessoaJuridicaByCnpj(@PathVariable(name = "cnpj") String cnpj) {
		
		Optional<PessoaJuridica> pf = repository.findByCnpj(cnpj);
		
		
		if(!pf.isPresent()) {
			return null;
		} else {
			return pf.get();
		}
		
	}
	
	@RequestMapping(value="pessoajuridica/id/{id}", method = RequestMethod.GET)
	public ResponseEntity<PessoaJuridica> getPessoaFisicaById(@PathVariable(name = "id") Long id) {
		//logger.info(String.format("Novo GET -> id[%1$s]", id));
		Optional<PessoaJuridica> pf = repository.findById(id);
			
		if(!pf.isPresent()) {
			return ResponseEntity.ok(null);
		} else {
			return ResponseEntity.ok(pf.get());
		}
				
	}
	
	@RequestMapping(value="pessoajuridica", method = RequestMethod.POST)
	public PessoaJuridica salva(@RequestBody @Validated PessoaJuridica pessoaJuridica) {
		return repository.save(pessoaJuridica);
	}
}
