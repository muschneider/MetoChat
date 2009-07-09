package br.metodista.listener;

import java.awt.event.MouseEvent;

import br.metodista.chatapp.BaseChat;
import br.metodista.chatapp.ChatForm;
import br.metodista.chatapp.FormAdapter;

public class FormListener extends FormAdapter {
	
	private ChatForm form;
	private BaseChat baseChat;
	
	public FormListener(ChatForm form, BaseChat baseChat) {
		this.form = form;
		this.baseChat = baseChat;
	}

	public void mouseClicked(MouseEvent e) {
		if ("btnEnviar".equals(e.getComponent().getName())) {
			String msg = form.getMensagem();
			baseChat.enviaMensagem(msg);
		}
		
		if ("btnChamada".equals(e.getComponent().getName())) {
			if  ( "Maria".equals( baseChat.ICP_PROFILE ) ) {
				try {
					baseChat.criaSesssionUsuario("sip:joao@ericsson.com");
					form.setStatus("CONECTADO");
				}
				catch (Exception err) {
					form.setStatus("Erro para conectar em Joao");
					err.printStackTrace();
				}
			} else { // eh o Joao
				try {
					baseChat.criaSesssionUsuario("sip:maria@ericsson.com");
					form.setStatus("CONECTADO");
				}
				catch (Exception err) {
					form.setStatus("Erro para conectar em Maria");
					err.printStackTrace();
				}
			}
		}
	}

}

