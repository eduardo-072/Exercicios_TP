import java.sql.Connection;
import java.sql.PreparedStatement;

public class Empresa {

    public void salvar(Empresa empresa) throws Exception {

        String sql = """
        INSERT INTO empresas (cnpj, razao_social, nome_fantasia, logradouro, numero,
        complemento, bairro, cidade, estado, cep)
        VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
        """;

        try (Connection conn = ConexaoPostgres.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, empresa.getCnpj());
            stmt.setString(2, empresa.getRazao_social());
            stmt.setString(3, empresa.getNome_fantasia());
            stmt.setString(4, empresa.getLogradouro());
            stmt.setString(5, empresa.getNumero());
            stmt.setString(6, empresa.getComplemento());
            stmt.setString(7, empresa.getBairro());
            stmt.setString(8, empresa.getMunicipio());
            stmt.setString(9, empresa.getUf());
            stmt.setString(10, empresa.getCep());

            stmt.executeUpdate();
        }
    }
}