import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class AlunoDAO {
    private Connection conn;

    public AlunoDAO() {
        conn = Conexao.getConnection();
    }

    public void salvar(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome, email, curso, genero, receberEmail, receberNotificacao, rua, cidade) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEmail());
            stmt.setString(3, aluno.getCurso());
            stmt.setString(4, aluno.getGenero());
            stmt.setBoolean(5, aluno.isReceberEmail());
            stmt.setBoolean(6, aluno.isReceberNotificacao());
            stmt.setString(7, aluno.getRua());
            stmt.setString(8, aluno.getCidade());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
// READ
public List <Aluno> listar() {
    List<Aluno> lista = new ArrayList<>();
    String sql = "SELECT * FROM aluno";
    try {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Aluno aluno = new Aluno();
            aluno.setId(rs.getInt("id"));
            aluno.setNome(rs.getString("nome"));
            aluno.setEmail(rs.getString("email"));
            aluno.setCurso(rs.getString("curso"));
            aluno.setGenero(rs.getString("genero"));
            aluno.setReceberEmail(rs.getBoolean("receberEmail"));
            aluno.setReceberNotificacao(rs.getBoolean("receberNotificacao"));
            aluno.setRua(rs.getString("rua"));
            aluno.setCidade(rs.getString("cidade"));
            lista.add(aluno);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
         return lista;
    }
// UPDATE
    public void atualizar(Aluno aluno) {
    String sql = "UPDATE aluno SET nome=?, email=?, curso=?, genero=?, receberEmail=?, receberNotificacao=?, rua=?, cidade=? WHERE id=?";
        try {
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, aluno.getNome());
        stmt.setString(2, aluno.getEmail());
        stmt.setString(3, aluno.getCurso());
        stmt.setString(4, aluno.getGenero());
        stmt.setBoolean(5, aluno.isReceberEmail());
        stmt.setBoolean(6, aluno.isReceberNotificacao());
        stmt.setString(7, aluno.getRua());
        stmt.setString(8, aluno.getCidade());
        stmt.setInt(9, aluno.getId());
        stmt.executeUpdate();
        stmt.close();
        } catch (SQLException e) {
        e.printStackTrace();
        }
    }
// DELETE
public void excluir(int id) {
    String sql = "DELETE FROM aluno WHERE id=?";
    try {
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}



