package projetocafe;
import javax.swing.*;
import java.awt.*;

public class ProjetoCafe extends JFrame{
	JLabel nometela,nome,sen;
    JButton login,Sair,fornecedores;
    JTextField nomedousuario, senha;
public ProjetoCafe(){
        
        super("login");
        Container tela= getContentPane();
       setLayout(null); 
    
       ImageIcon imagem = new ImageIcon("cafelogin.png");
       Image img = imagem.getImage();
       Image imga = img.getScaledInstance(400,500,java.awt.Image.SCALE_SMOOTH);
      imagem = new ImageIcon(imga);
      JLabel imaa= new JLabel(imagem);
       
       
     
    nometela = new JLabel("LOGIN");
    nome = new JLabel("Usuário:");
    sen = new JLabel("Senha:");
     
     
     
    nomedousuario= new JTextField();
    senha= new JTextField();
    login= new JButton("Login");
    Sair= new JButton("Sair");
    
    

    
    nome.setBounds(50,180,200,40);
    sen.setBounds(50,230,200,40);
    nometela.setBounds(270,40,300,100);

  
    nomedousuario.setBounds(100,180,200,40);
     senha.setBounds(100,230,200,40);
   login.setBounds(100,280,200,40);
  Sair.setBounds(100,450,200,40);
    
     
    imaa.setBounds(250,70,400,500);
     nometela.setForeground(Color.red);
    
     
     
    
   
     
     nometela.setFont(new Font("Arial",Font.BOLD,50));
     nometela.setForeground(Color.green);
    
    tela.add(login);
    tela.add(Sair);
    tela.add(nomedousuario);
    tela.add(senha);
    tela.add(nome);
    tela.add(sen);


    tela.add(nometela);
    tela.add(imaa);
    
    
    setSize(700,600);
    setVisible(true);
    setResizable(false);
    setLocationRelativeTo(null);
    
} 
public static void main(String[] args) {
    ProjetoCafe app= new ProjetoCafe();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private class Menu extends JFrame {
    
   JLabel nomeusuario,menu,imagem,img,imgg,imga,imaa,lblbackground,usuario;
   JButton contrestoque,contrpedidos,contrcardapio,contrfuncionarios,fornecedores,logout;
   
   public Menu(){
   
   
    super("MENU");
       Container tela= getContentPane();
      setLayout(null); 
   
      ImageIcon imagem= new ImageIcon("cafe.png");
      Image img= imagem.getImage();
      Image imga =img.getScaledInstance(400,500,java.awt.Image.SCALE_SMOOTH);
     imagem=new ImageIcon(imga);
     JLabel imaa= new JLabel(imagem);
      
      
   usuario = new JLabel("");     
   menu = new JLabel("MENU");
   nomeusuario = new JLabel("Usuário:");
   contrestoque= new JButton("Controle de Estoque");
   contrpedidos= new JButton("Pedidos");
   contrcardapio= new JButton("Cardapio");
   contrfuncionarios= new JButton("Controle de FuncionÃ¡rios");
   fornecedores= new JButton("Fornecedores");
   logout= new JButton("Logout");
   

   
   
   menu.setBounds(270,50,300,100);
   nomeusuario.setBounds(50,20,80,20);
   usuario.setBounds(100,20,100,20);
   contrestoque.setBounds(100,180,200,40);
    contrpedidos.setBounds(100,230,200,40);
    contrfuncionarios.setBounds(100,280,200,40);
  contrcardapio.setBounds(100,330,200,40);
    fornecedores.setBounds(100,380,200,40);
    logout.setBounds(100,430,200,40);
    
   imaa.setBounds(250,70,400,500);
    menu.setForeground(Color.red);
   
    
    
   tela.add(nomeusuario);
  
    
    menu.setFont(new Font("Arial",Font.BOLD,50));
    menu.setForeground(Color.green);
   
    
    
   tela.add(nomeusuario);
    tela.add(usuario);
   tela.add( contrestoque);
   tela.add( contrpedidos);
   tela.add(contrcardapio);
   tela.add(contrfuncionarios);
   tela.add( fornecedores);
   tela.add( logout);
   tela.add(menu);
   tela.add(imaa);
   
   
   setSize(700,600);
   setVisible(true);
   setResizable(false);
   setLocationRelativeTo(null);
   }
}
   private class Fornecedores extends JFrame{
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
   }
		private class Cardapio extends JFrame{
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
private  class Pedidos extends JFrame{
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
}
private  class Estoque extends JFrame{
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
}
	 private class Funcionario extends JFrame{
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
			
	 }
}
}