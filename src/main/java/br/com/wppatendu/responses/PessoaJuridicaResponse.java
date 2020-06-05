package br.com.wppatendu.responses;

import br.com.wppatendu.entities.PessoaJuridica;

public class PessoaJuridicaResponse {

	private Boolean existe;
	private PessoaJuridica pessoaJuridica;
	public Boolean getExiste() {
		return existe;
	}
	public void setExiste(Boolean existe) {
		this.existe = existe;
	}
	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}
	
	
}
