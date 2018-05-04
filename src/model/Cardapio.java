package model;

public class Cardapio {
	private Integer cod_prato;
	private Integer cod_listai;
	private String nome;
	private String descricao;
	private String tipo;
	private String tempo_prep;
	private Double preco;
	public Integer getCod() {
		return cod_prato;
	}
	public void setCod(Integer cod_prato) {
		this.cod_prato = cod_prato;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String gettipo() {
		return tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	public String gettempo_prep() {
		return tempo_prep;
	}
	public void settempo_prep(String tempo_prep) {
		this.tempo_prep = tempo_prep;
	}
	public String getdescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getpreco() {
		return preco;
	}
	public Double setpreco(Double preco) {
		return this.preco = preco;
	}
}