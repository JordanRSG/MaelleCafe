package Janelas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Estoque extends JFrame{
	JToolBar barra;
	JButton add, rem, menu, logout;
	ImageIcon icone, imgadd,imgrem;
	JTextField item, quant, desc;
	JComboBox fornecedor;
	JLabel iteml, quantl, descl, fornecedorl;
	JTable estoq;
	JScrollPane scroll;
	String[] colunas = {"Item","Quantidade", "Descrição", "Fornecedor"}, fornecedores = {"",""};
	Object[][] dados = new Object[][]{{"","", "", "", "", ""}};
	public Estoque(){
		super("Controle de Funcionários");
		Container tela = getContentPane();
		tela.setLayout(null);
		
		ImageIcon imagem = new ImageIcon("cafeestoque.png");
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
		
		add.setToolTipText("Adiciona um novo item");
		rem.setToolTipText("Remove o(s) item(s) selecionado(s)");
		
		barra = new JToolBar("Barra de Comandos");
		barra.add(add);
		barra.add(rem);
		barra.setBounds(1,1,1600,50);
		
		iteml = new JLabel("Item");
		quantl = new JLabel("Quantidade");
		descl = new JLabel("Descrição");
		fornecedorl = new JLabel("Fornecedor");
		
		iteml.setBounds(50,100,200,20);
		quantl.setBounds(50,140,200,20);
		descl.setBounds(50,180,200,20);
		fornecedorl.setBounds(50,220,200,20);
		
		item = new JTextField();
		quant = new JTextField();
		desc = new JTextField();
		fornecedor = new JComboBox(fornecedores);
		fornecedor.setMaximumRowCount(5);
		
		item.setBounds(210,100,500,20);
		quant.setBounds(210,140,500,20);
		desc.setBounds(210,180,500,20);
		fornecedor.setBounds(210,220,500,20);
		
		estoq = new JTable(dados,colunas);
		scroll = new JScrollPane(estoq);
		scroll.setBounds(50,350,950,350);
		
		tela.add(barra);
		tela.add(imaa);
		tela.add(scroll);
		tela.add(item);
		tela.add(quant);
		tela.add(desc);
		tela.add(fornecedor);
		tela.add(iteml);
		tela.add(quantl);
		tela.add(descl);
		tela.add(fornecedorl);
		tela.add(logout);
		tela.add(menu);
		setIconImage(icone.getImage());
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
		setResizable(false);
		
		
	}
	public static void main(String args[]){
		Estoque app = new Estoque();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}