/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Renata
 */
public class Menu extends JFrame {
     
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
    contrfuncionarios= new JButton("Controle de Funcionários");
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
    public static void main(String[] args) {
        Menu app= new Menu();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}


