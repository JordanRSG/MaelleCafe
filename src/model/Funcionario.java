package model;

public class Funcionario {
	private Integer cod_funcionario;
	private String nome;
	private String RG;
	private String CPF;
	private String endereco;
	private String telefone;
	private String celular;
	private String email;
	private String CEP;
	private String cidade;
	private String funcao;
	private String num_dep;
	private String usuario;
	private Integer senha;
	public Integer getCod() {
		return cod_funcionario;
	}
	public void setCod(Integer cod_funcionario) {
		this.cod_funcionario = cod_funcionario;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String RG) {
		this.RG = RG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getendereco() {
		return endereco;
	}
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	public String gettelefone() {
		return telefone;
	}
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getcelular() {
		return celular;
	}
	public void setcelular(String celular) {
		this.celular = celular;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String CEP) {
		this.CEP = CEP;
	}
	public String getcidade() {
		return cidade;
	}
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	public String getfuncao() {
		return funcao;
	}
	public void setfuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getnum_dep() {
		return num_dep;
	}
	public void setnum_dep(String num_dep) {
		this.num_dep = num_dep;
	}
	public String getusuario() {
		return usuario;
	}
	public void setusuario(String usuario) {
		this.usuario = usuario;
	}
	public Integer getsenha() {
		return senha;
	}
	public void setsenha(Integer senha) {
		this.senha = senha;
	}
}