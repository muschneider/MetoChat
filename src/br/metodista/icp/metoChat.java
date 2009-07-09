package br.metodista.icp;

import com.ericsson.icp.ICPFactory;
import com.ericsson.icp.IPlatform;
import com.ericsson.icp.IProfile;
import com.ericsson.icp.IService;
import com.ericsson.icp.services.IMSM.IMsgManager;
import com.ericsson.icp.services.IMSM.IMsgSending;
import com.ericsson.icp.services.IMSM.ImsmFactory;

public class metoChat {

	public static void main(String[] args) throws Exception {
		IPlatform platform = ICPFactory.createPlatform();
		platform.registerClient("MetoChat");
		platform.addListener(new PlatformAdapter());
		IProfile profile = platform.createProfile("IMSSetting");
		profile.addListener(new ProfileAdapter());

		IService gmetoChatSIPService = profile.createService("+g.metoChat.SIP",
				"");
		gmetoChatSIPService.addListener(new ServiceAdapter());

		IMsgManager msgManager = ImsmFactory.createMsgManager(profile);
		msgManager.setListener(new MsgManagerAdapter());

	}

}
