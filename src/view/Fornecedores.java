package view;
import javax.swing.*;

import controller.EstoqueJbdcDAO;
import controller.FornecedorJbdcDAO;
import controller.JdbUtil;
import model.Fornecedor;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.SQLException;
public class Fornecedores extends JFrame{
	JToolBar barra;
	JButton add, rem, menu, logout;
	ImageIcon icone, imgadd,imgrem;
	JTextField forn, desc, tel, end;
	JLabel fornl, descl, tell, endl;
	JTable forns;
	JScrollPane scroll;
	String[] colunas = {"Fornecedores", "Descrição", "Telefone", "Endereço"};
	Object[][] dados = new Object[][]{{"", "", "", ""}};
	public Fornecedores(){
		super("Controle de Fornecedores");
		Container tela = getContentPane();
		tela.setLayout(null);
		
		try{
			Fornecedor fornecedores = new Fornecedor();
			Connection connection = null;
			try {
				connection = JdbUtil.getConnection();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			FornecedorJbdcDAO fornecedorJbdcDAO = new FornecedorJbdcDAO(connection);
			dados = FornecedorJbdcDAO.carregar();
		}
		catch(SQLException e1){
			e1.printStackTrace();
		}
		
		ImageIcon imagem = new ImageIcon("cafeefornecedores.png");
	    Image img = imagem.getImage();
	    Image imga = img.getScaledInstance(400,500,java.awt.Image.SCALE_SMOOTH);
	    imagem = new ImageIcon(imga);
	    JLabel imaa= new JLabel(imagem);
	    imaa.setBounds(950,100,400,500);
	    
	    icone = new ImageIcon("Icon.png");
		imgadd = new ImageIcon("Add.png");
		imgrem = new ImageIcon("Rem.png");
		setIconImage(icone.getImage());
		
		add = new JButton(imgadd);
		rem = new JButton(imgrem);
		menu = new JButton("Menu");
		logout = new JButton("Logout");
		
		logout.setBounds(1150,600,100,50);
		menu.setBounds(1150,655,100,50);
		
		add.setToolTipText("Adiciona um novo fornecedor");
		rem.setToolTipText("Remove o(s) fornecedor(s) selecionado(s)");
		
		barra = new JToolBar("Barra de Comandos");
		barra.add(add);
		barra.add(rem);
		barra.setBounds(1,1,1600,50);
		
		fornl = new JLabel("Fornecedor");
		descl = new JLabel("Descrição");
		tell = new JLabel("Telefone");
		endl = new JLabel("Endereço");
		
		fornl.setBounds(50,100,200,20);
		descl.setBounds(50,140,200,20);
		tell.setBounds(50,180,200,20);
		endl.setBounds(50,220,200,20);
		
		forn = new JTextField();
		desc = new JTextField();
		tel = new JTextField();
		end = new JTextField();
		
		forn.setBounds(210,100,500,20);
		desc.setBounds(210,140,500,20);
		tel.setBounds(210,180,500,20);
		end.setBounds(210,220,500,20);
		
		forns = new JTable(dados,colunas);
		scroll = new JScrollPane(forns);
		scroll.setBounds(50,350,950,350);
		
		forns.requestFocus();
		forns.changeSelection(0,0,false, false);
		
		int row = forns.getSelectedRow();
		String selected = forns.getValueAt(row, 0).toString();
		int row1 = Integer.parseInt(selected);
		
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){								
				try{
					Fornecedor fornecedor = new Fornecedor();
					Connection connection = null;
					try {
						connection = JdbUtil.getConnection();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					fornecedor.setnome(forn.getText());
					fornecedor.settelefone(tel.getText());
					fornecedor.setendereco(end.getText());
					fornecedor.setdescricao(desc.getText());
					FornecedorJbdcDAO fornecedorJbdcDAO = new FornecedorJbdcDAO(connection);
					fornecedorJbdcDAO.salvar(fornecedor);
				}
				catch(SQLException e1){
					e1.printStackTrace();
				}
			}
	    });
		rem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){								
				try{
					Fornecedor fornecedor = new Fornecedor();
					Connection connection = null;
					try {
						connection = JdbUtil.getConnection();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					FornecedorJbdcDAO fornecedorJbdcDAO = new FornecedorJbdcDAO(connection);
					fornecedorJbdcDAO.excluir(row1);
				}
				catch(SQLException e1){
					e1.printStackTrace();
				}
			}
	    });
		
		tela.add(barra);
		tela.add(imaa);
		tela.add(scroll);
		tela.add(forn);
		tela.add(desc);
		tela.add(tel);
		tela.add(end);
		tela.add(fornl);
		tela.add(descl);
		tela.add(tell);
		tela.add(endl);
		tela.add(logout);
		tela.add(menu);
		setIconImage(icone.getImage());
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
		setResizable(false);
		
		
	}
	public static void main(String args[]){
		Fornecedores app = new Fornecedores();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}