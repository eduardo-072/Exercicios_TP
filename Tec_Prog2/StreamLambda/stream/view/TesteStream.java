package view;

import model.Funcionario;

import java.util.*;
import java.util.stream.Collectors;

public class TesteStream {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Weverton","MangineEngine",20000,15));
        funcionarios.add(new Funcionario("Wagner","MangineEngine",10000,5));
        funcionarios.add(new Funcionario("Wanderson","Ti",13000,8));
        funcionarios.add(new Funcionario("Wendel","Designer",9000,5));
        funcionarios.add(new Funcionario("Wellingthon","Ti",10000,5));
        funcionarios.add(new Funcionario("Weithor","Designer",12000,7));
        funcionarios.add(new Funcionario("Wallison","MangineEngine",10000,5));
        funcionarios.add(new Funcionario("Tevez","Ti",15000,12));

        List<Funcionario> salarioSuperior = funcionarios.stream()
                .filter(f -> f.getSalario() > 3000)
                .toList();
        salarioSuperior.forEach(System.out::println);

        funcionarios.stream()
                .filter(f -> f.getAnosServico() > 10)
                .forEach(f -> f.setSalario(f.getSalario() * 1.05));

        funcionarios.forEach(f -> System.out.println(
                "Funcionário: " + f.getNome() +
                        ", Departamento: " + f.getDepartamento() +
                        ", Salário: R$ " + f.getSalario()
        ));

        List<Funcionario> ordenados = funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getNome))
                .toList();

        ordenados.forEach(f -> System.out.println(
                "Funcionário: " + f.getNome() +
                        ", Departamento: " + f.getDepartamento() +
                        ", Salário: R$ " + f.getSalario()
        ));

        double totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(0.0, Double::sum);

        System.out.println("\nTotal gasto com salários: R$ " + totalSalarios);

        Map<String, Double> mediaPorDepto = funcionarios.stream()
                .collect(Collectors.groupingBy(
                        Funcionario::getDepartamento,
                        Collectors.averagingDouble(Funcionario::getSalario)
                ));

        System.out.println("Média por Departamento");
        mediaPorDepto.forEach((dep, media) ->
                System.out.println("Departamento: " + dep + " | Média: R$ " + media)
        );

        System.out.println("Maior Tempo de Serviço");
        funcionarios.stream()
                .max(Comparator.comparing(Funcionario::getAnosServico))
                .ifPresent(f -> System.out.println(
                        f.getNome() + " - " + f.getAnosServico() + " anos"
                ));
    }
}
