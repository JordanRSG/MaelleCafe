package Janelas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Funcionario extends JFrame{
	JToolBar barra;
	JButton add, rem, menu, logout;
	ImageIcon icone, imgadd,imgrem;
	JTextField func, cargo, desc, tel, end, sal;
	JLabel funcl, cargol, descl, tell, endl, sall;
	JTable funcs;
	JScrollPane scroll;
	String[] colunas = {"Funcionários","Cargo", "Descrição", "Telefone", "Endereço", "Salário"};
	Object[][] dados = new Object[][]{{"Funcionários1","Cargo1", "Descrição1", "Telefone1", "Endereço1", "Salário1"},{false,"Funcionários2","Cargo2", "Descrição2", "Telefone2", "Endereço2", "Salário2"}};
	public Funcionario(){
		super("Controle de Funcionários");
		Container tela = getContentPane();
		tela.setLayout(null);
		
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
		
		add.setToolTipText("Adiciona um novo funcionário");
		rem.setToolTipText("Remove o(s) funcionário(s) selecionado(s)");
		
		barra = new JToolBar("Barra de Comandos");
		barra.add(add);
		barra.add(rem);
		barra.setBounds(1,1,1600,50);
		
		funcl = new JLabel("Funcionário");
		cargol = new JLabel("Cargo");
		descl = new JLabel("Descrição");
		tell = new JLabel("Telefone");
		endl = new JLabel("Endereço");
		sall = new JLabel("Salário");
		
		funcl.setBounds(50,100,200,20);
		cargol.setBounds(50,140,200,20);
		descl.setBounds(50,180,200,20);
		tell.setBounds(50,220,200,20);
		endl.setBounds(50,260,200,20);
		sall.setBounds(50,300,200,20);
		
		func = new JTextField();
		cargo = new JTextField();
		desc = new JTextField();
		tel = new JTextField();
		end = new JTextField();
		sal = new JTextField();
		
		func.setBounds(210,100,500,20);
		cargo.setBounds(210,140,500,20);
		desc.setBounds(210,180,500,20);
		tel.setBounds(210,220,500,20);
		end.setBounds(210,260,500,20);
		sal.setBounds(210,300,500,20);
		
		funcs = new JTable(dados,colunas);
		scroll = new JScrollPane(funcs);
		scroll.setBounds(50,350,950,350);
		
		tela.add(barra);
		tela.add(imaa);
		tela.add(scroll);
		tela.add(func);
		tela.add(cargo);
		tela.add(desc);
		tela.add(tel);
		tela.add(end);
		tela.add(sal);
		tela.add(funcl);
		tela.add(cargol);
		tela.add(descl);
		tela.add(tell);
		tela.add(endl);
		tela.add(sall);
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