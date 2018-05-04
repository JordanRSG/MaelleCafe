package view;
import javax.swing.*;
import javax.swing.table.TableColumnModel;

import controller.EstoqueJbdcDAO;
import controller.JdbUtil;
import model.estoque;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class Estoque extends JFrame{
	JToolBar barra;
	JButton add, rem, menu, logout;
	ImageIcon icone, imgadd,imgrem;
	JTextField item, quant, desc;
	JComboBox fornecedor;
	JLabel iteml, quantl, descl, fornecedorl;
	JTable estoq;
	JScrollPane scroll;
	String[] colunas = {"CNPJ","Nome", "Quantidade", "Descrição"},fornecedores = {"1","3"};
	Object[][] dados = new Object[][]{{"","", "", ""}};
	public Estoque(){
		super("Controle de Funcionários");
		Container tela = getContentPane();
		tela.setLayout(null);
		
		try{
			estoque estoque = new estoque();
			Connection connection = null;
			try {
				connection = JdbUtil.getConnection();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			EstoqueJbdcDAO estoqueJbdcDAO = new EstoqueJbdcDAO(connection);
			dados = estoqueJbdcDAO.carregar();
		}
		catch(SQLException e1){
			e1.printStackTrace();
		}
		
						
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
						
						estoq.requestFocus();
						estoq.changeSelection(0,0,false, false);
						
						int row = estoq.getSelectedRow();
						String selected = estoq.getValueAt(row, 0).toString();
						int row1 = Integer.parseInt(selected);
						
						add.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){								
								try{
									estoque estoque = new estoque();
									Connection connection = null;
									try {
										connection = JdbUtil.getConnection();
									} catch (ClassNotFoundException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									estoque.setnome(item.getText());
									estoque.setquantidade(Integer.parseInt(quant.getText()));
									estoque.setdescricao(desc.getText());
									estoque.setCNPJ(Integer.parseInt((fornecedor.getSelectedItem()).toString()));
									EstoqueJbdcDAO estoqueJbdcDAO = new EstoqueJbdcDAO(connection);
									estoqueJbdcDAO.salvar(estoque);
								}
								catch(SQLException e1){
									e1.printStackTrace();
								}
							}
					    });
						rem.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){								
								try{
									estoque estoque = new estoque();
									Connection connection = null;
									try {
										connection = JdbUtil.getConnection();
									} catch (ClassNotFoundException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									EstoqueJbdcDAO estoqueJbdcDAO = new EstoqueJbdcDAO(connection);
									estoqueJbdcDAO.excluir(row1);
								}
								catch(SQLException e1){
									e1.printStackTrace();
								}
							}
					    });
						
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