package dao;

import model.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpresaDao {

    private final Connection connection;

    public EmpresaDao(Connection connection) {
        this.connection = connection;
    }

    public void salvarEmpresa(Empresa empresa){
        String sql = "INSERT INTO empresas (cnpj, razao_social, nome_fantasia, logradouro, bairro, cep, telefone) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?) " +
                "ON CONFLICT (cnpj) DO UPDATE SET " +
                "razao_social = EXCLUDED.razao_social, " +
                "nome_fantasia = EXCLUDED.nome_fantasia, " +
                "logradouro = EXCLUDED.logradouro, " +
                "bairro = EXCLUDED.bairro, " +
                "cep = EXCLUDED.cep, " +
                "telefone = EXCLUDED.telefone";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, empresa.getCnpj());
            stmt.setString(2, empresa.getRazaoSocial());
            stmt.setString(3, empresa.getNomeFantasia());
            stmt.setString(4, empresa.getLogradouro());
            stmt.setString(5, empresa.getBairro());
            stmt.setString(6, empresa.getCep());
            stmt.setString(7, empresa.getTelefone());

            stmt.executeUpdate();
        } catch (SQLExceprion e)
            System.out.println("Erro ao salvar empresa no banco " + e.getMessage());
    }
}