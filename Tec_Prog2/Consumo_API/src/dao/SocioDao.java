package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Socio;

public class SocioDao {

    private Connection conn;

    public SocioDao(Connection conn) {
        this.conn = conn;
    }

    public void salvarSocio(Socio socio, String cnpjEmpresa) throws SQLException {

        String sql = "INSERT INTO socios (cnpj_empresa, nome_socio, cnpj_cpf_socio, qualificacao_socio) " +
                     "VALUES (?, ?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, cnpjEmpresa);
        stmt.setString(2, socio.getNomeSocio());
        stmt.setString(3, socio.getCnpjCpfSocio());
        stmt.setString(4, socio.getQualificacaoSocio());

        stmt.executeUpdate();
    }
}