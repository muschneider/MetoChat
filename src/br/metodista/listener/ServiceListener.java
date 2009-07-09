package br.metodista.listener;

import br.metodista.chatapp.BaseChat;
import br.metodista.chatapp.ChatForm;
import br.metodista.icp.ServiceAdapter;

import com.ericsson.icp.ISession;
import com.ericsson.icp.util.ISessionDescription;

public class ServiceListener extends ServiceAdapter {

	private ChatForm form;
	private BaseChat baseChat;
	
	public void setForm(ChatForm form) {
		this.form = form;
	}
	
	public ServiceListener(BaseChat baseChat) {
		this.baseChat = baseChat;
	}
	
	
	public void processIncomingSession(ISession aSession) {
		try {
			SessionListener sessionListener = new SessionListener(form, baseChat);
			aSession.addListener( sessionListener );
			
			baseChat.setSession(aSession);
            ISessionDescription localSdp = baseChat.createLocalSdp();
			aSession.acceptInvitation(localSdp);
			System.out.println( aSession.getObjectName()  );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
