package view;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import controller.FuncionarioJbdcDAO;
import controller.JdbUtil;
public class Funcionario extends JFrame{
	JToolBar barra;
	JButton add, rem, menu, logout;
	ImageIcon icone, imgadd,imgrem;
	JTextField txbnome,txbRG, txbCPF, txbendereco, txbtelefone, txbcelular, txbemail, txbCEP, txbcidade, txbfuncao, txbnumdep, txbusuario, txbsenha;
	JLabel lblnome,lblRG, lblCPF, lblendereco, lbltelefone, lblcelular, lblemail, lblCEP, lblcidade, lblfuncao, lblnumdep, lblusuario, lblsenha;
	JTable funcs;
	JScrollPane scroll;
	String[] colunas = {"nome","RG", "CPF", "endereco", "telefone", "celular", "email", "CEP", "cidade", "funcao", "num_dep", "usuario", "senha"};
	Object[][] dados = new Object[][]{{"nome1","RG1", "CPF1", "endereco1", "telefone1", "celular1", "email1", "CEP1", "cidade1", "funcao1", "num_dep1", "usuario1", "senha1"},{"nome2","RG2", "CPF2", "endereco2", "telefone2", "celular2", "email2", "CEP2", "cidade2", "funcao2", "num_dep2", "usuario2", "senha2"}};
	public Funcionario(){
		super("Controle de Funcionários");
		Container tela = getContentPane();
		tela.setLayout(null);
		
		try{
			model.Funcionario funcionario = new model.Funcionario();
			Connection connection = null;
			try {
				connection = JdbUtil.getConnection();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			FuncionarioJbdcDAO funcionarioJbdcDAO = new FuncionarioJbdcDAO(connection);
			dados = funcionarioJbdcDAO.carregar();
		}
		catch(SQLException e1){
			e1.printStackTrace();
		}
		
		ImageIcon imagem = new ImageIcon("cafeefornecedores.png");
	    Image img = imagem.getImage();
	    Image imga = img.getScaledInstance(400,500,java.awt.Image.SCALE_SMOOTH);
	    imagem = new ImageIcon(imga);
	    JLabel imaa= new JLabel(imagem);
	    imaa.setBounds(1100,100,400,500);
	    
		icone = new ImageIcon("Icon.png");
		imgadd = new ImageIcon("Add.png");
		imgrem = new ImageIcon("Rem.png");
		setIconImage(icone.getImage());
		
		add = new JButton(imgadd);
		rem = new JButton(imgrem);
		menu = new JButton("Menu");
		logout = new JButton("Logout");
		
		logout.setBounds(1290,600,100,50);
		menu.setBounds(1290,655,100,50);
		
		add.setToolTipText("Adiciona um novo funcionário");
		rem.setToolTipText("Remove o(s) funcionário(s) selecionado(s)");
		
		barra = new JToolBar("Barra de Comandos");
		barra.add(add);
		barra.add(rem);
		barra.setBounds(1,1,1600,50);
		
		lblnome  = new JLabel("Nome::.");
		lblRG = new JLabel("RG::.");
		lblCPF = new JLabel("CPF::.");
		lblendereco = new JLabel("Endereço::.");
		lbltelefone = new JLabel("Telefone::.");
		lblcelular = new JLabel("Celular::.");
		lblemail = new JLabel("Email::.");
		lblCEP = new JLabel("Cep::.");
		lblcidade = new JLabel("Cidade::.");
		lblfuncao = new JLabel("Função::.");
		lblnumdep = new JLabel("Num_Dependentes::.");
		lblusuario = new JLabel("Usuario::.");
		lblsenha = new JLabel("Senha::.");
		
		lblnome.setBounds(50,100,200,20);
		lblRG .setBounds(50,150,200,20);
		lblCPF .setBounds(50,200,200,20);
		lblendereco .setBounds(50,250,200,20);
		lbltelefone .setBounds(50,300,200,20);
		lblcelular .setBounds(50,350,200,20);
		lblemail .setBounds(500,350,200,20);
		lblCEP .setBounds(500,100,200,20);
		lblcidade .setBounds(500,150,200,20);
		lblfuncao .setBounds(500,200,200,20);
		lblnumdep .setBounds(500,250,200,20);
		lblusuario .setBounds(500,300,200,20);
		lblsenha .setBounds(820,300,200,20);
		
		txbnome  = new JTextField();
		txbRG = new JTextField();
		txbCPF = new JTextField();
		txbendereco = new JTextField();
		txbtelefone = new JTextField();
		txbcelular = new JTextField();
		txbemail = new JTextField();
		txbCEP = new JTextField();
		txbcidade = new JTextField();
		txbfuncao = new JTextField();
		txbnumdep = new JTextField();
		txbusuario = new JTextField();
		txbsenha = new JTextField();
		funcs = new JTable(dados,colunas);
		scroll = new JScrollPane(funcs);
		scroll.setBounds(50,350,950,350);
		
		
		txbnome .setBounds(130,100,200,20);
		txbRG .setBounds(130,150,200,20);
		txbCPF.setBounds(130,200,200,20);
		txbendereco .setBounds(130,250,200,20);
		txbtelefone .setBounds(130,300,200,20);
		txbcelular.setBounds(130,350,200,20);
		txbemail .setBounds(620,350,200,20);
		txbCEP .setBounds(620,100,200,20);
		txbcidade.setBounds(620,150,200,20);;
		txbfuncao .setBounds(620,200,200,20);
		txbnumdep .setBounds(620,250,200,20);
		txbusuario.setBounds(620,300,200,20);
		txbsenha .setBounds(860,300,200,20);
		
		
		tela.add(txbnome); 
		tela.add(txbRG);
		tela.add(txbCPF);
		tela.add(txbendereco);
		tela.add(txbtelefone);
		tela.add(txbcelular);
		tela.add(txbemail);
		tela.add(txbCEP);
		tela.add(txbcidade);
		tela.add(txbfuncao);
		tela.add(txbnumdep);
		tela.add(txbusuario);
		tela.add(txbsenha);
		
		funcs = new JTable(dados,colunas);
		scroll = new JScrollPane(funcs);
		scroll.setBounds(50,480,950,350);
		
		int row = funcs.getSelectedRow();
		String selected = funcs.getValueAt(row, 0).toString();
		int row1 = Integer.parseInt(selected);
		
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){								
				try{
					model.Funcionario funcionario = new model.Funcionario();
					Connection connection = null;
					try {
						connection = JdbUtil.getConnection();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					funcionario.setnome(txbnome.getText());
					funcionario.setRG(txbRG.getText());
					funcionario.setCPF(txbCPF.getText());
					funcionario.setendereco(txbendereco.getText());
					funcionario.settelefone(txbtelefone.getText());
					funcionario.setcelular(txbcelular.getText());
					funcionario.setemail(txbemail.getText());
					funcionario.setCEP(txbCEP.getText());
					funcionario.setcidade(txbcidade.getText());
					funcionario.setfuncao(txbfuncao.getText());
					funcionario.setnum_dep(txbnumdep.getText());
					funcionario.setusuario(txbusuario.getText());
					funcionario.setsenha(Integer.parseInt(txbsenha.getText()));
					FuncionarioJbdcDAO funcionarioJbdcDAO = new FuncionarioJbdcDAO(connection);
					funcionarioJbdcDAO.salvar(funcionario);
				}
				catch(SQLException e1){
					e1.printStackTrace();
				}
			}
	    });
		rem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){								
				try{
					Funcionario funcionario = new Funcionario();
					Connection connection = null;
					try {
						connection = JdbUtil.getConnection();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					FuncionarioJbdcDAO funcionarioJbdcDAO = new FuncionarioJbdcDAO(connection);
					funcionarioJbdcDAO.excluir(row1);
				}
				catch(SQLException e1){
					e1.printStackTrace();
				}
			}
	    });
		
		
		tela.add(lblnome);  
		tela.add(lblRG );
	    tela.add(lblCPF); 
		tela.add(lblendereco);
		tela.add(lbltelefone); 
		tela.add(lblcelular); 
		tela.add(lblemail);
		tela.add(lblCEP);
		tela.add(lblcidade );
	    tela.add(lblfuncao );
		tela.add(lblnumdep );
		tela.add(lblusuario );
	    tela.add(lblsenha);
		
		
		tela.add(barra);
		tela.add(imaa);
		tela.add(scroll);
		tela.add(lblfuncao);        
		tela.add(lblnome);
	
		tela.add(logout);
		tela.add(menu);
		setIconImage(icone.getImage());
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
		setResizable(false);
		}
	public static void main(String args[]){
		Funcionario app = new Funcionario();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}