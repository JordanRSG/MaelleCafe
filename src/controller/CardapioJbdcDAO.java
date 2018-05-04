package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import model.estoque;

public class CardapioJbdcDAO {
	private Connection conn;
	public CardapioJbdcDAO(Connection conn) {
		this.conn = conn;
	}
	public void salvar(cardapio c) throws SQLException{
		String sql = "insert into tb_pratos (cod_listai, nome, descricao, tipo, tempo_prep, preco) values ('"+c.getcod_listai()+"','"+c.getnome()+"','"+c.getdescricao()+"','"+c.gettipo()+"','"+c.gettempo_prep()+"','"+c.getpreco()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}
	final public void excluir(int cod_pratos) throws SQLException{
		String sql = "delete from tb_pratos where id= '"+cod_pratos+"';";
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
		
		String sql = "select * from tb_pratos";
		System.out.println(sql);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		int i=0;
		String[][] registro = new String[5000][7];
		while (rs.next()) {
			
			int cod_pratos = rs.getInt("cod_pratos");
			int cod_listai = rs.getInt("cod_listai");
			String nome = rs.getString("nome");
			String descricao = rs.getString("descricao");
			String tipo = rs.getString("tipo");
			String tempo_prep = rs.getString("tempo_prep");
			Double preco = rs.getDouble("preco");
			registro[i][0] = ""+cod_pratos;
			registro[i][1] = ""+cod_listai;
			registro[i][2] = ""+nome;
			registro[i][3] = ""+descricao;
			registro[i][4] = ""+tipo;
			registro[i][5] = ""+tempo_prep;
			registro[i][6] = ""+preco;
			i++;
		}
		return registro;
	}
}