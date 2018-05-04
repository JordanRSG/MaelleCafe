package model;

public class Pedidos {
	private Integer cod_ped;
	private Integer cod_funcionario;
	private Integer cod_listap;
	private String cliente;
	private String horario;
	private String mesa;
	public Integer getCod() {
		return cod_ped;
	}
	public void setCod(Integer cod_ped) {
		this.cod_ped = cod_ped;
	}
	public Integer getCod2() {
		return cod_funcionario;
	}
	public void setCod2(Integer cod_funcionario) {
		this.cod_funcionario = cod_funcionario;
	}
	public Integer getCod3() {
		return cod_listap;
	}
	public void setCod3(Integer cod_listap) {
		this.cod_listap = cod_listap;
	}
	public String getcliente() {
		return cliente;
	}
	public void setcliente(String cliente) {
		this.cliente = cliente;
	}
	public String gethorario() {
		return horario;
	}
	public void sethorario(String horario) {
		this.horario = horario;
	}
	public String getmesa() {
		return mesa;
	}
	public void setmesa(String mesa) {
		this.mesa = mesa;
	}
}