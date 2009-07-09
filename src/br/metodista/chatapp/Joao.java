package br.metodista.chatapp;

public class Joao extends BaseChat {

	public static void main(String[] args) {
		Joao j = new Joao();
		
		try {
			j.inicia("Joao");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ChatForm frm = new ChatForm();
		j.serviceListener.setForm(frm);
		j.sessionListener.setForm(frm);
		frm.montaForm("Joao", j);
	}


}
