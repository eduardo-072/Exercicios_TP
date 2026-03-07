package main.java.BuscaCEp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        SistemaCep sistema = new SistemaCep();
        Scanner scan = new Scanner(System.in);

        boolean rodando = true;

        while (rodando) {
            System.out.println("1- Buscar endereço");
            System.out.println("2- Excluir endereço");
            System.out.println("3- Histórico de endereços");
            System.out.println("4- sair");

        String opc = scan.nextLine();

        switch(opc){
            case "1":
                System.out.print("Digite o CEP: ");
                String BuscarCep = scan.nextLine();

                if(!BuscarCep.matches("\\d{8}")){
                    System.out.println("CEP inválido! Digite 8 números.");
                    break;
                }

                Endereco e = sistema.buscarEndereco(BuscarCep);

                if(e != null){
                    System.out.println("Endereço encontrado: " + e);
                } else {
                    System.out.println("CEP não está na lista");
                }
                break;
            case "2":
                System.out.println("Digite o CEP para excluir: ");
                String excluirCep = scan.nextLine();
                boolean excluido = sistema.excluirEndereco(excluirCep);

                if(excluido){
                    System.out.println("Endereço excluído da lista");
                } else {
                    System.out.println("CEP não está na lista");
                }
                break;

            case "3":
                if(sistema.getHistorico().isEmpty()){
                    System.out.println("Nenhum endereço buscado ainda");
                } else {
                    for(Endereco end : sistema.getHistorico()){
                        System.out.println(end);
                    }
                }
                break;

            case "4":
                rodando = false;
                System.out.println("Saindo do programa");
                break;

            default:
                System.out.println("Opção inválida");
                break;
            }
        }

    }
}
