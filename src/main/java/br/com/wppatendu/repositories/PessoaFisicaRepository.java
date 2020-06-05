package br.com.wppatendu.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wppatendu.entities.PessoaFisica;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {

	public Optional<PessoaFisica> findByNumerowa(String numerowa);

}
