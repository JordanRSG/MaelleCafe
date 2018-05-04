package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import model.estoque;

public class FuncionarioJbdcDAO {
	private Connection conn;
	public FuncionarioJbdcDAO(Connection conn) {
		this.conn = conn;
	}
	public void salvar(funcionario c) throws SQLException{
		String sql = "insert into tb_funcionario (nome, RG, CPF, endereco, telefone, celular, email, CEP, cidade, funcao, num_dep, usuario, senha) values ('"+c.getnome()+"','"+c.getRG()+"','"+c.getCPF()+"','"+c.getendereco()+"','"+c.gettelefone()+"','"+c.getcelular()+"','"+c.getemail()+"','"+c.getCEP()+"','"+c.getcidade()+"','"+c.getfuncao()+"','"+c.getnum_dep()+"','"+c.getusuario()+"','"+c.getsenha()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}
	final public void excluir(int cod_funcionario) throws SQLException{
		String sql = "delete from tb_funcionario where id= '"+cod_funcionario+"';";
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
		
		String sql = "select * from tb_funcionario";
		System.out.println(sql);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		int i=0;
		String[][] registro = new String[5000][14];
		while (rs.next()) {
			
			int cod_funcionario = rs.getInt("cod_funcionario");
			String nome = rs.getString("nome");
			String RG = rs.getString("RG");
			String CPF = rs.getString("CPF");
			String endereco = rs.getString("endereco");
			String telefone = rs.getString("telefone");
			String celular = rs.getString("celular");
			String email = rs.getString("email");
			String CEP = rs.getString("CEP");
			String cidade = rs.getString("cidade");
			String funcao = rs.getString("funcao");
			String num_dep = rs.getString("num_dep");
			String usuario = rs.getString("usuario");
			Integer senha = rs.getInt("senha");
			registro[i][0] = ""+cod_funcionario;
			registro[i][1] = ""+RG;
			registro[i][2] = ""+RG;
			registro[i][3] = ""+CPF;
			registro[i][4] = ""+endereco;
			registro[i][5] = ""+telefone;
			registro[i][6] = ""+celular;
			registro[i][7] = ""+email;
			registro[i][8] = ""+CEP;
			registro[i][9] = ""+cidade;
			registro[i][10] = ""+funcao;
			registro[i][11] = ""+num_dep;
			registro[i][12] = ""+usuario;
			registro[i][13] = ""+senha;
			i++;
		}
		return registro;
	}
}