package model;

public class Fornecedor {
	private Integer CNPJ;
	private String nome;
	private String telefone;
	private String CEP;
	private String endereco;
	private String cidade;
	private String descricao;
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
	public String gettelefone() {
		return telefone;
	}
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String CEP) {
		this.CEP = CEP;
	}
	public String getendereco() {
		return endereco;
	}
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	public String getcidade() {
		return cidade;
	}
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	public String getdescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
	
}