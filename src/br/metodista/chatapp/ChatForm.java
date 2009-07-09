package br.metodista.chatapp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.metodista.listener.FormListener;

public class ChatForm {
	
	private JPanel panel = new JPanel();
	private JFrame frame = new JFrame("");
	
	private JButton btnChamada = new JButton("Chamar");

	private JButton btnEnviar  = new JButton("Enviar");
	
	private JTextField txfMsgEnviar  = new JTextField();
	private JTextField txfMsgReceber = new JTextField();
	
	private JLabel lblStatus = new JLabel("DESCONECTADO");
	
	private FormListener formListener;
	
	private JPanel getPanelChamada() {
		JPanel subPanel = new JPanel();
		subPanel.setLayout( new GridLayout(1,1) );
		subPanel.add( btnChamada );
		btnChamada.setName("btnChamada");
		btnChamada.addMouseListener(formListener);
		return subPanel;
	}
	
	private JPanel getPanelMensagens() {
		JPanel subPanel = new JPanel();
		subPanel.setLayout( new GridLayout(2,2) );
		subPanel.add(btnEnviar);   subPanel.add( txfMsgEnviar );  
		subPanel.add( new JLabel("Recebida") );  subPanel.add( txfMsgReceber ); 
		
		btnEnviar.setName("btnEnviar");
		btnEnviar.addMouseListener(formListener);
		
		return subPanel;
	}
	
	private JPanel getPanelStatus() {
		JPanel subPanel = new JPanel();
		subPanel.setLayout( new GridLayout(1,1) );
		subPanel.add( lblStatus );
		return subPanel;
	}
	
	
	public void montaForm(String nome, BaseChat baseChat) {
		formListener = new FormListener(this, baseChat);
		
		panel.setLayout( new BorderLayout() );		
		
		panel.add( getPanelChamada(),        BorderLayout.NORTH );
		panel.add( getPanelMensagens(),      BorderLayout.CENTER );
		panel.add( getPanelStatus(),         BorderLayout.SOUTH );		
		
		frame.setTitle("Chat: "+nome );
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setSize( new Dimension(450,150) );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public void setStatus(String status) {
		lblStatus.setText(status);
	}

	public String getMensagem() {
		String msg = txfMsgEnviar.getText();
		txfMsgEnviar.setText("");
		return msg;
	}
	
	public void setMensagem(String msg) {
		txfMsgReceber.setText(msg);
	}


}
