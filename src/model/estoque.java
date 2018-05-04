package model;

public class estoque {
	private Integer cod_ingredientes;
	private Integer CNPJ;
	private String nome;
	private Integer quantidade;
	private String descricao;
	public Integer getCod() {
		return cod_ingredientes;
	}
	public void setCod(Integer cod_ingredientes) {
		this.cod_ingredientes = cod_ingredientes;
	}
	public Integer getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(Integer CNPJ) {
		this.CNPJ = CNPJ;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public Integer getquantidade() {
		return quantidade;
	}
	public void setquantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getdescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
}