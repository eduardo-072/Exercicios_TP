package Tarefa;

import Tarefa.GerenciadorTarefas;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorTarefas sistema = new GerenciadorTarefas();

        int opcao;

        do {
            System.out.println("\n1 - Criar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Excluir tarefa");
            System.out.println("5 - Filtrar por categoria");
            System.out.println("6 - Filtrar por status");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    sistema.CriarTarefa(titulo, categoria);
                    break;

                case 2:
                    sistema.ListarTarefas();
                    break;

                case 3:
                    System.out.print("ID da tarefa: ");
                    sistema.ConcluirTarefa(sc.nextInt());
                    break;

                case 4:
                    System.out.print("ID da tarefa: ");
                    sistema.ExcluirTarefa(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Categoria: ");
                    sistema.FiltrarCategoria(sc.next());
                    break;

                case 6:
                    System.out.print("Concluídas / Pendentes: ");
                    sistema.FiltrarStatus(sc.nextInt() == 1);
                    break;

            }

        } while (opcao != 0);
    }
}