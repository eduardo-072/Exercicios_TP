package modelo;

public class SistemasdeSeguranca implements IAutenticavel{
	private String usuario = "admin";
	private int senha = 1234;
	private boolean logado = false;
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean login(String usuario, int senha) {
		if(this.usuario.equals(usuario) && this.senha == senha ) {
			logado = true;
			System.out.println("Login feito");
			return true;
		} else {
			System.out.println("Login não feito");
			return false;
		}
	}
	
	public void logout() {
		if(logado) {
			logado = false;
			System.out.println("Logout feito");
		} else {
			System.out.println("Usuario não autenticado");
		}
	}
	
	public boolean isAutenticado() {
		return logado;
	}
}
