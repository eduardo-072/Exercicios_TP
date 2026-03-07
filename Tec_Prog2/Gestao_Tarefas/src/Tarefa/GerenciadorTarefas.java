package Tarefa;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {

    List<Tarefa> tarefas = new ArrayList<>();
    int contadorID = 1;

    public void CriarTarefa(String titulo, String categoria){
        tarefas.add(new Tarefa(contadorID++, titulo, categoria));
    }

    public void ListarTarefas(){
        for(Tarefa t : tarefas){
            System.out.println(t);
        }
    }

    public void ExcluirTarefa(int id){
        tarefas.removeIf(t -> t.id == id);
        }

    public void ConcluirTarefa(int id) {
        for (Tarefa t : tarefas) {
            if (t.id == id) {
                t.marcarConcluida();
            }
        }
    }

    public void FiltrarCategoria(String categoria) {
        for (Tarefa t : tarefas) {
            if (t.categoria.equalsIgnoreCase(categoria)) {
                System.out.println(t);
            }
        }
    }

    public void FiltrarStatus(boolean status) {
        for (Tarefa t : tarefas) {
            if (t.concluida == status) {
                System.out.println(t);
            }
        }
    }
}