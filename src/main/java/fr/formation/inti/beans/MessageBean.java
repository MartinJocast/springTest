package fr.formation.inti.beans;

public class MessageBean {

	public void message() {
		System.out.println("Bonjour !");
	}
	
	public MessageBean() {
		System.out.println("Creation de MessageBean !");
	}
	
	public static MessageBean createInstance() {
		return new MessageBean();
	}
}
