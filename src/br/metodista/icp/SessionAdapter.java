package br.metodista.icp;

import com.ericsson.icp.ISessionListener;
import com.ericsson.icp.util.ErrorReason;
import com.ericsson.icp.util.ISessionDescription;
import com.ericsson.icp.util.MIMEContainer;

public class SessionAdapter implements ISessionListener {

	@Override
	public void processSessionAlerting() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionCancelled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionEnded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionInformation(String arg0, byte[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionInformationFailed(ErrorReason arg0, long arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionInformationSuccessful(String arg0, byte[] arg1,
			int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionInvitation(String arg0, boolean arg1,
			ISessionDescription arg2, MIMEContainer arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionMediaNegotiation(ISessionDescription arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionMessage(String arg0, byte[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionMessage(String arg0, byte[] arg1, int arg2,
			String arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionMessageFailed(ErrorReason arg0, long arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionMessageSuccessful(String arg0, byte[] arg1,
			int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionOptions(String arg0, ISessionDescription arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionOptionsFailed(ErrorReason arg0, long arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionOptionsSuccessful(String arg0,
			ISessionDescription arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionPublishFailed(String arg0, byte[] arg1, int arg2,
			ErrorReason arg3, long arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionPublishSuccessful(String arg0, int arg1,
			byte[] arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionReceivedPRACK(ISessionDescription arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionReceivedPRACKResponse(ISessionDescription arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionRefer(String arg0, String arg1, byte[] arg2,
			int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionReferEnded(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionReferFailed(String arg0, ErrorReason arg1,
			long arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionReferNotify(String arg0, int arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionReferNotifyFailed(String arg0, ErrorReason arg1,
			long arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionReferNotifySuccessful(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionReferSuccessful(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionStartFailed(ErrorReason arg0, long arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionStarted(ISessionDescription arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionSubscribeDeactived(String arg0, String arg1,
			byte[] arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionSubscribeFailed(String arg0, String arg1,
			byte[] arg2, int arg3, ErrorReason arg4, long arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionSubscribeNotification(String arg0, String arg1,
			byte[] arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionSubscribeSuccessful(String arg0, String arg1,
			byte[] arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionUpdate(ISessionDescription arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionUpdateFailed(ErrorReason arg0, long arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSessionUpdateSuccessful(ISessionDescription arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processError(ErrorReason arg0) {
		// TODO Auto-generated method stub
		
	}
}
