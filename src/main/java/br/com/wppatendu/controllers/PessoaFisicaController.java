package br.com.wppatendu.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.wppatendu.entities.PessoaFisica;
import br.com.wppatendu.repositories.PessoaFisicaRepository;

@RestController
public class PessoaFisicaController {

	private PessoaFisicaRepository repository;
	
	private static final Logger logger = LoggerFactory.getLogger(PessoaFisicaRepository.class);
	
	public PessoaFisicaController(PessoaFisicaRepository repository) {
		this.repository = repository;
	}
	
	
	@RequestMapping(value="pessoafisica/{numero_wa}", method = RequestMethod.GET)
	public ResponseEntity<PessoaFisica> getPessoaFisica(@PathVariable(name = "numero_wa") String numero) {
		logger.info(String.format("Novo GET -> numero_wa[%1$s]", numero));
		Optional<PessoaFisica> pf = repository.findByNumerowa(numero);
				
		if(pf.isEmpty()) {
			return ResponseEntity.ok(null);
		} else {
			return ResponseEntity.ok(pf.get());
		}
				
	}
	
	@RequestMapping(value="pessoafisica/save", method = RequestMethod.POST, consumes = "application/json;charset=UTF-8", produces = "application/json;charset=UTF-8")
	public PessoaFisica salva(RequestEntity<PessoaFisica> pessoaFisica) {
		logger.info(String.format("Novo POST -> PessoaFisica[%1$s, %2$s]", pessoaFisica.getBody().getNome(), pessoaFisica.getBody().getNumerowa()));
		return repository.save(pessoaFisica.getBody());
	}
}
