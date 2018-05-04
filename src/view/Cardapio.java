package Janelas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Cardapio extends JFrame{
	JToolBar barra;
	JButton add, rem, ped, menu, logout;
	ImageIcon icone, imgadd,imgrem, imgped;
	JTextField prato, desc;
	JComboBox ingrediente, tipo;
	JLabel pratol, descl, tipol, ingredientel;
	JTable Cardap;
	JScrollPane scroll;
	String[] colunas = {"Prato","Descrição", "Tipo", "Ingrediente"}, ingredientes = {"",""}, tipos = {"Torta","Bolo","Salgado","Bebidas Frias","Bebidas Quentes"};
	Object[][] dados = new Object[][]{{"","", "", "", "", ""}};
	public Cardapio(){
		super("Controle de Funcionários");
		Container tela = getContentPane();
		tela.setLayout(null);

		ImageIcon imagem = new ImageIcon("cafecardapio.png");
	    Image img = imagem.getImage();
	    Image imga = img.getScaledInstance(400,500,java.awt.Image.SCALE_SMOOTH);
	    imagem = new ImageIcon(imga);
	    JLabel imaa = new JLabel(imagem);
	    imaa.setBounds(950,100,400,500);
	    
	    icone = new ImageIcon("Icon.png");
		imgadd = new ImageIcon("Add.png");
		imgrem = new ImageIcon("Rem.png");
		imgped = new ImageIcon("Ped.png");	
		setIconImage(icone.getImage());
		
		add = new JButton(imgadd);
		rem = new JButton(imgrem);
		ped = new JButton(imgped);
		menu = new JButton("Menu");
		logout = new JButton("Logout");
		
		logout.setBounds(1150,600,100,50);
		menu.setBounds(1150,655,100,50);
		
		add.setToolTipText("Adiciona um novo prato");
		rem.setToolTipText("Remove o(s) prato(s) selecionado(s)");
		
		barra = new JToolBar("Barra de Comandos");
		barra.add(ped);
		barra.add(add);
		barra.add(rem);
		barra.setBounds(1,1,1600,50);
		
		pratol = new JLabel("Prato");
		descl = new JLabel("Descrição");
		tipol = new JLabel("Tipo");
		ingredientel = new JLabel("Ingrediente");
		
		pratol.setBounds(50,100,200,20);
		descl.setBounds(50,140,200,20);
		tipol.setBounds(50,180,200,20);
		ingredientel.setBounds(50,220,200,20);
		
		prato = new JTextField();
		desc = new JTextField();
		tipo = new JComboBox(tipos);
		ingrediente = new JComboBox(ingredientes);
		ingrediente.setMaximumRowCount(5);
		tipo.setMaximumRowCount(5);
		
		prato.setBounds(210,100,500,20);
		desc.setBounds(210,140,500,20);
		tipo.setBounds(210,180,500,20);
		ingrediente.setBounds(210,220,500,20);
		
		Cardap = new JTable(dados,colunas);
		scroll = new JScrollPane(Cardap);
		scroll.setBounds(50,350,950,350);
		
		tela.add(barra);
		tela.add(imaa);
		tela.add(scroll);
		tela.add(prato);
		tela.add(desc);
		tela.add(tipo);
		tela.add(ingrediente);
		tela.add(pratol);
		tela.add(descl);
		tela.add(tipol);
		tela.add(ingredientel);
		tela.add(logout);
		tela.add(menu);
		setIconImage(icone.getImage());
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
		setResizable(false);
		
		
	}
	public static void main(String args[]){
		Cardapio app = new Cardapio();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}