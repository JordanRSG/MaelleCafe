package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import model.estoque;

public class PedidosJbdcDAO {
	private Connection conn;
	public PedidosJbdcDAO(Connection conn) {
		this.conn = conn;
	}
	public void salvar(pedidos c) throws SQLException{
		String sql = "insert into tb_pedidos (cod_funcionario, cod_listap, cliente, horario, mesa) values ('"+c.getcod2()+"','"+c.getcod3()+"','"+c.getcliente()+"','"+c.gethorario()+"','"+c.getmesa()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}
	final public void excluir(int cod_ped) throws SQLException{
		String sql = "delete from tb_pedidos where id= '"+cod_ped+"';";
		System.out.println(sql);
		try {
			PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
			prepareStatement.executeUpdate();
			prepareStatement.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public String[][] carregar() throws SQLException{
		
		String sql = "select * from tb_pedidos";
		System.out.println(sql);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		int i=0;
		String[][] registro = new String[5000][6];
		while (rs.next()) {
			
			int cod_ped = rs.getInt("cod_ped");
			int cod_funcionario = rs.getInt("cod_funcionario");
			int cod_listap = rs.getInt("cod_listap");
			String cliente = rs.getString("cliente");
			String horario = rs.getString("horario");
			String mesa = rs.getString("mesa");
			registro[i][0] = ""+cod_ped;
			registro[i][1] = ""+cod_funcionario;
			registro[i][2] = ""+cod_listap;
			registro[i][3] = ""+cliente;
			registro[i][4] = ""+horario;
			registro[i][5] = ""+mesa;
			i++;
		}
		return registro;
	}
}