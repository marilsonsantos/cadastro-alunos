package model;

import utilitarios.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AlunoDAO {

    private Connection con = Conexao.abrirConexao();

    public void cadastraAluno(AlunoBean ab) {

        String sql = "INSERT INTO TBL_ALUNO (NOME, SOBRENOME, RG, CPF, EMAIL, TELEFONE, CELULAR) VALUES ('" + ab.getNome() + "', '" + ab.getSobrenome() + "', '"
                + ab.getRg() + "', '" + ab.getCpf() + "', '" + ab.getEmail() + "', '" + ab.getTelefone() + "', '" + ab.getCelular() + "')";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!", "CADASTRO DE ALUNO", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }

    public AlunoBean exibeAluno(AlunoBean ab) {

        String cod = (JOptionPane.showInputDialog(null, "Informe o código do aluno", "CÓDIGO DO ALUNO", JOptionPane.INFORMATION_MESSAGE));

        String sql = "SELECT * FROM TBL_ALUNO WHERE CODIGO_ALUNO = " + cod + ";";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            rs.next();

            ab.setNome(rs.getString("nome"));
            ab.setEmail(rs.getString("email"));
            ab.setTelefone(rs.getString("telefone"));
            ab.setSobrenome(rs.getString("sobrenome"));
            ab.setCelular(rs.getString("celular"));
            ab.setCpf(rs.getString("cpf"));
            ab.setRg(rs.getString("rg"));
            ab.setCod(rs.getInt("codigo_aluno"));

            return ab;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
        return ab;
    }

    public void alteraAluno(AlunoBean ab) {

        String sql = "UPDATE TBL_ALUNO SET NOME = '" + ab.getNome() + "', EMAIL = '" + ab.getEmail() + "', SOBRENOME = '" + ab.getSobrenome()
                + "', CPF = '" + ab.getCpf() + "', RG = '" + ab.getRg() + "', TELEFONE = '" + ab.getTelefone() + "', CELULAR = '" + ab.getCelular() + "' WHERE CODIGO_ALUNO = " + ab.getCod() + ";";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso!", "ALTERAR ALUNO", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void excluiAluno(AlunoBean ab) {

        String sql = "DELETE FROM TBL_ALUNO WHERE CODIGO_ALUNO = " + ab.getCod() + ";";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso!", "EXCLUIR ALUNO", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }

    public ResultSet listaAluno(AlunoBean ab) {

        ResultSet rs = null;

        try {

            String sql = "SELECT * FROM tbl_aluno";

            PreparedStatement ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            return rs;

        } catch (SQLException e) {

            System.out.println("Erro: " + e.getMessage());

        }

        return rs;

    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

}
