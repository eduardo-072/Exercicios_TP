package Exercicio1;

public class Cliente {
    private String nome;
    private int idade;
    private String sexo;

    public Cliente(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getResumo() {
        return "Cliente cadastrado:\n" +
               "Nome: " + nome + "\n" +
               "Idade: " + idade + "\n" +
               "Sexo: " + sexo;
    }
}
