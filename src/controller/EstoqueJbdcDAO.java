package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import model.estoque;

public class EstoqueJbdcDAO {
	private Connection conn;
	public EstoqueJbdcDAO(Connection conn) {
		this.conn = conn;
	}
	public void salvar(estoque c) throws SQLException{
		String sql = "insert into tb_ingredientes (CNPJ, nome, quantidade, descricao) values ('"+c.getCNPJ()+"','"+c.getnome()+"','"+c.getquantidade()+"','"+c.getdescricao()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}
	final public void excluir(int cod_ingredientes) throws SQLException{
		String sql = "delete from tb_ingredientes where id= '"+cod_ingredientes+"';";
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
		
		String sql = "select * from tb_ingredientes";
		System.out.println(sql);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		int i=0;
		String[][] registro = new String[5000][5];
		while (rs.next()) {
			
			int cod_Ingredientes = rs.getInt("cod_ingred");
			int CNPJ = rs.getInt("CNPJ");
			String nome = rs.getString("nome");
			int quantidade = rs.getInt("quantidade");
			String descricao = rs.getString("descricao");
			registro[i][0] = ""+cod_Ingredientes;
			registro[i][1] = ""+CNPJ;
			registro[i][2] = ""+nome;
			registro[i][3] = ""+quantidade;
			registro[i][4] = ""+descricao;
			i++;
		}
		return registro;
	}
}