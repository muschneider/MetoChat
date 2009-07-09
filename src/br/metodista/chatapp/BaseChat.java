package br.metodista.chatapp;

import br.metodista.listener.ServiceListener;
import br.metodista.listener.SessionListener;

import com.ericsson.icp.ICPFactory;
import com.ericsson.icp.IPlatform;
import com.ericsson.icp.IProfile;
import com.ericsson.icp.IService;
import com.ericsson.icp.ISession;
import com.ericsson.icp.util.ISessionDescription;
import com.ericsson.icp.util.ITimeDescription;
import com.ericsson.icp.util.SdpFactory;

public class BaseChat {
	
	public String ICP_PROFILE;
	protected ChatForm form; 
	
    protected IPlatform platform;
    protected IProfile profile;
    protected IService service;
    protected ISession session;
    
    protected SessionListener sessionListener = new SessionListener();
    protected ServiceListener serviceListener = new ServiceListener(this);
    
	public void inicia(String ICP_PROFILE) throws Exception {
		this.ICP_PROFILE = ICP_PROFILE;
        platform = ICPFactory.createPlatform();
        platform.registerClient("ChatClient");

        profile = platform.createProfile(ICP_PROFILE);
        
        service = profile.createService("+g.metoChat.SIP", "MetoChat");
        service.addListener(serviceListener);
        
        System.out.println("User Profile: "+ profile.getIdentity());
	}
	
	
    public ISessionDescription createLocalSdp() {
        ISessionDescription localSdp = null;
        try
        {
            localSdp = SdpFactory.createSessionDescription("");
            localSdp.setField(ISessionDescription.FieldType.ProtocolVersion, "0");
            localSdp.setField(ISessionDescription.FieldType.Owner, "- 1111551202156 1111551202156 IN IP4");
            localSdp.setField(ISessionDescription.FieldType.SessionName, "My Chat Application Session");
            ITimeDescription timeDescription = SdpFactory.createTimeDescription();
            timeDescription.setSessionActiveTime("0 0");
            localSdp.addTimeDescription(timeDescription);
        } catch (Exception e)      {
            e.printStackTrace();
        }
        return localSdp;
    }
	
	
	public void criaSesssionUsuario(String uriUsuario) throws Exception {
        final ISessionDescription localSdp = createLocalSdp();
        session = service.createSession();
        session.addListener(sessionListener);
        session.start(uriUsuario, localSdp, profile.getIdentity(), SdpFactory.createMIMEContainer());
	}
    
    public void enviaMensagem(String msg) {
        try  {
            byte[] messageBytes = msg.getBytes("UTF-8");
            session.sendMessage("text/plain", messageBytes, messageBytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setSession(ISession session) {
		this.session = session;
		
	}


}
