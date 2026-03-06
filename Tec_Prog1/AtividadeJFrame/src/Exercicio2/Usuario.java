package Exercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Usuario extends JFrame {

	    private String tema;
	    private boolean notificacoesHabilitadas;
	    private int volume;
	    
	    public Usuario() {

	        this.tema = "Claro";
	        this.notificacoesHabilitadas = true;
	        this.volume = 50;
	    }

	    public String getTema() {
	        return tema;
	    }
	    
	    public void setTema(String tema) {
	        this.tema = tema;
	    }
	    
	    public boolean isNotificacoesHabilitadas() {
	        return notificacoesHabilitadas;
	    }
	    
	    public void setNotificacoesHabilitadas(boolean notificacoesHabilitadas) {
	        this.notificacoesHabilitadas = notificacoesHabilitadas;
	    }
	    
	    public int getVolume() {
	        return volume;
	    }
	    
	    public void setVolume(int volume) {
	        this.volume = volume;
	    }
	    
	    @Override
	    public String toString() {
	        return "=== PREFERÊNCIAS DO USUÁRIO ===\n\n" +
	               "Tema: " + tema + "\n" +
	               "Notificações: " + (notificacoesHabilitadas ? "Habilitadas" : "Desabilitadas") + "\n" +
	               "Volume: " + volume + "%";
	    }
	}
