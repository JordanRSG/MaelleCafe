package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import model.estoque;

public class FornecedorJbdcDAO {
	private Connection conn;
	public FornecedorJbdcDAO(Connection conn) {
		this.conn = conn;
	}
	public void salvar(fornecedor c) throws SQLException{
		String sql = "insert into tb_fornecedores (CNPJ, nome, telefone, CEP, endereco, cidade, descricao) values ('"+c.getCNPJ()+"','"+c.getnome()+"','"+c.gettelefone()+"','"+c.getCEP()+"','"+c.getendereco()+"','"+c.getcidade()+"','"+c.getdescricao()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}
	final public void excluir(int CNPJ) throws SQLException{
		String sql = "delete from tb_fornecedores where id= '"+CNPJ+"';";
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
		
		String sql = "select * from tb_fornecedores";
		System.out.println(sql);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		int i=0;
		String[][] registro = new String[5000][7];
		while (rs.next()) {
			
			int CNPJ = rs.getInt("CNPJ");
			String nome = rs.getString("nome");
			String telefone = rs.getString("telefone");
			String CEP = rs.getString("CEP");
			String endereco = rs.getString("endereco");
			String cidade = rs.getString("cidade");
			String descricao = rs.getString("descricao");
			registro[i][0] = ""+CNPJ;
			registro[i][1] = ""+nome;
			registro[i][2] = ""+telefone;
			registro[i][3] = ""+CEP;
			registro[i][4] = ""+endereco;
			registro[i][5] = ""+cidade;
			registro[i][6] = ""+descricao;
			i++;
		}
		return registro;
	}
}