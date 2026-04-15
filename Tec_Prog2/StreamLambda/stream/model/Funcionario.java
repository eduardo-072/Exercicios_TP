package model;

public class Funcionario {

    private String nome;
    private String departamento;
    private double salario;
    private int anosServico;

    public Funcionario(String nome, String departamento, double salario, int anosServico) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.anosServico = anosServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnosServico() {
        return anosServico;
    }

    public void setAnosServico(int anosServico) {
        this.anosServico = anosServico;
    }

    @Override
    public String toString() {
        return "model.Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", anosServico=" + anosServico +
                '}';
    }
}
