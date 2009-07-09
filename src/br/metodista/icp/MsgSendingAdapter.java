package br.metodista.icp;

import com.ericsson.icp.services.IMSM.IMsgSending;
import com.ericsson.icp.services.IMSM.IMsgSendingListener;
import com.ericsson.icp.util.ErrorReason;

public class MsgSendingAdapter implements IMsgSendingListener {

	@Override
	public void processCancelled(IMsgSending arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void processSendMsgResult(IMsgSending arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void processError(ErrorReason arg0) {
		// TODO Auto-generated method stub

	}

}
