package main;

import client.api;
import conexao.ConexaoPostgres;
import dao.EmpresaDao;
import dao.SocioDao;
import model.Empresa;
import model.Socio;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CNPJ: ");
        String cnpj = scan.nextLine().replaceAll("\\D", "");

        try {

            // consulta API
            Empresa empresa = api.consultarCnpj(cnpj);

            if (empresa == null) {
                System.out.println("Empresa não encontrada.");
                return;
            }

            // conexão com banco
            try (Connection conn = ConexaoPostgres.getConnection()) {

                EmpresaDao empresaDao = new EmpresaDao(conn);
                empresaDao.salvarEmpresa(empresa);

                SocioDao socioDao = new SocioDao(conn);

                List<Socio> socios = empresa.getQsa();

                if (socios != null) {
                    for (Socio socio : socios) {
                        socioDao.salvarSocio(socio, empresa.getCnpj());
                    }
                }

                System.out.println("Empresa e sócios salvos no banco!");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}