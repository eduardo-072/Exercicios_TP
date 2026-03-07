package Tarefa;
class Tarefa{
    int id;
    String titulo;
    String categoria;
    boolean concluida;

    public Tarefa(int id, String titulo, String categoria){
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.concluida= false;
    }

    public void Editar(String NovoTitulo, String NovaCategoria){
        titulo = NovoTitulo;
        categoria = NovaCategoria;
    }

    public void marcarConcluida(){
        concluida = true;
    }

    public String toString(){
        return "ID: " + id + " " +
                "Titulo: " + titulo + " " +
                "Categoria: " + categoria + " " +
                "Concluída: " + concluida;

    }
}