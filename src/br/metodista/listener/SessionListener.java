package br.metodista.listener;

import java.io.UnsupportedEncodingException;

import br.metodista.chatapp.BaseChat;
import br.metodista.chatapp.ChatForm;
import br.metodista.icp.SessionAdapter;

import com.ericsson.icp.util.ISessionDescription;
import com.ericsson.icp.util.MIMEContainer;

public class SessionListener  extends SessionAdapter {
	
	private ChatForm form;
	private BaseChat baseChat;
	
	public SessionListener() {}

	public SessionListener(ChatForm form, BaseChat baseChat) {
		this.form = form;
		this.baseChat = baseChat;
	}
	
    public void processSessionInvitation(String aFrom, boolean aProvisionalRequired, ISessionDescription aSdpBody, MIMEContainer aContainer) {
    	form.setStatus("Conectado de " + aFrom + " ICP " + baseChat.ICP_PROFILE);
    }
    
    public void processSessionMessage(String aContentType, byte[] aMessage, int aLength) {
    	String mensagem="";
        try  {
        	mensagem = new String(aMessage, "UTF-8");
        } catch (UnsupportedEncodingException e) {
        	mensagem = "Erro decodificando mensagem !";
        }
    	form.setMensagem(mensagem);
    	
    }
    
    public void setForm(ChatForm form) {
		this.form = form;
	}
	

}

