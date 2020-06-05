package br.com.wppatendu.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "empresaatv")
public class EmpresaAtv {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SeqEmpresaAtv")
	@SequenceGenerator(name = "SeqEmpresaAtv", sequenceName = "seqemresa_atv", allocationSize = 1)
	private Long idempresaatv;
	private String cnae;
	private String descricao;
	private Boolean principal;
	public Long getIdempresa_atv() {
		return idempresaatv;
	}
	public void setIdempresa_atv(Long idempresaatv) {
		this.idempresaatv = idempresaatv;
	}
	public String getCnae() {
		return cnae;
	}
	public void setCnae(String cnae) {
		this.cnae = cnae;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getPrincipal() {
		return principal;
	}
	public void setPrincipal(Boolean principal) {
		this.principal = principal;
	}
	
}
