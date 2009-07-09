package br.metodista.chatapp;

public class Maria extends BaseChat {

	public static void main(String[] args) {
		Maria m = new Maria();
		try {
			m.inicia("Maria");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ChatForm frm = new ChatForm();
		m.serviceListener.setForm(frm);
		m.sessionListener.setForm(frm);
		frm.montaForm("Maria", m);
		
	}
}
