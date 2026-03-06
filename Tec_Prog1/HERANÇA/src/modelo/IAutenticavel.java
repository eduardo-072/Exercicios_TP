package modelo;

public interface IAutenticavel {
	boolean login(String usuario, int senha);
	void logout();
}
