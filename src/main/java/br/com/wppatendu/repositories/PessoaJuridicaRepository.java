package br.com.wppatendu.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wppatendu.entities.PessoaJuridica;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
	public Optional<PessoaJuridica> findByNumerowa(String numerowa);
	public Optional<PessoaJuridica> findByCnpj(String cnpj);
}
