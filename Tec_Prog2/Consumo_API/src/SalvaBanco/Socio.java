import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class Socio {

    public void salvarSocios(String cnpjEmpresa, List<Socio> socios) throws Exception {

        String sql = """
        INSERT INTO socios
        (cnpj_empresa, nome_socio, cpf, funcao)
        VALUES (?, ?, ?, ?)
        """;

        try (Connection conn = ConexaoPostgres.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            for (Socio s : socios) {

                stmt.setString(1, cnpjEmpresa);
                stmt.setString(2, s.getNome_socio());
                stmt.setString(3, s.getCnpj_cpf_do_socio());
                stmt.setString(4, s.getQualificacao_socio());

                stmt.executeUpdate();
            }
        }
    }
}