package br.com.wppatendu.responses;

import br.com.wppatendu.entities.PessoaFisica;

public class PessoaFisicaResponse {
	
	private Boolean existe;
	private PessoaFisica pessoaFisica;
	public Boolean getExiste() {
		return existe;
	}
	public void setExiste(Boolean existe) {
		this.existe = existe;
	}
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	

}
