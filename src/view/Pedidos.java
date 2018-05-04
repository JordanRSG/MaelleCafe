package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Pedidos extends JFrame{
	JToolBar barra;
	JButton add, rem, menu, logout;
	ImageIcon icone, imgadd,imgrem;
	JTextField mesa, nome;
	JComboBox pedido, pag;
	JLabel mesal, nomel, pagl, pedidol;
	JTable Pedid;
	JScrollPane scroll;
	String[] colunas = {"Mesa","Nome", "Método de Pagamento", "Pedido"}, pedidos = {"",""}, paga = {"Dinheiro","Crédito","Débito"};
	Object[][] dados = new Object[][]{{"","", "", "", "", ""}};
	public Pedidos(){
		super("Controle de Funcionários");
		Container tela = getContentPane();
		tela.setLayout(null);
		
		ImageIcon imagem = new ImageIcon("cafepedidos.png");
	    Image img = imagem.getImage();
	    Image imga = img.getScaledInstance(400,500,java.awt.Image.SCALE_SMOOTH);
	    imagem = new ImageIcon(imga);
	    JLabel imaa = new JLabel(imagem);
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
		
		add.setToolTipText("Adiciona um novo pedido");
		rem.setToolTipText("Remove o(s) pedido(s) selecionado(s)");
		
		barra = new JToolBar("Barra de Comandos");
		barra.add(add);
		barra.add(rem);
		barra.setBounds(1,1,1600,50);
		
		mesal = new JLabel("Mesa");
		nomel = new JLabel("Nome");
		pagl = new JLabel("Método de Pagamento");
		pedidol = new JLabel("Pedido");
		
		mesal.setBounds(50,100,200,20);
		nomel.setBounds(50,140,200,20);
		pagl.setBounds(50,180,200,20);
		pedidol.setBounds(50,220,200,20);
		
		mesa = new JTextField();
		nome = new JTextField();
		pag = new JComboBox(paga);
		pedido = new JComboBox(pedidos);
		pedido.setMaximumRowCount(5);
		pag.setMaximumRowCount(5);
		
		mesa.setBounds(210,100,500,20);
		nome.setBounds(210,140,500,20);
		pag.setBounds(210,180,500,20);
		pedido.setBounds(210,220,500,20);
		
		Pedid = new JTable(dados,colunas);
		scroll = new JScrollPane(Pedid);
		scroll.setBounds(50,350,950,350);
		
		tela.add(barra);
		tela.add(imaa);
		tela.add(scroll);
		tela.add(mesa);
		tela.add(nome);
		tela.add(pag);
		tela.add(pedido);
		tela.add(mesal);
		tela.add(nomel);
		tela.add(pagl);
		tela.add(pedidol);
		tela.add(logout);
		tela.add(menu);
		setIconImage(icone.getImage());
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
		setResizable(false);
		
		
	}
	public static void main(String args[]){
		Pedidos app = new Pedidos();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}