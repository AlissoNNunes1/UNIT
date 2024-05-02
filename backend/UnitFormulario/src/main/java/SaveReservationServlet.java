// SaveReservationServlet.java
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveReservationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String nome = request.getParameter("nome");
            String sexo = request.getParameter("sexo");
            String email = request.getParameter("email");
            String dataChegada = request.getParameter("dataChegada");
            int noites = Integer.parseInt(request.getParameter("noites"));
            int hospedes = Integer.parseInt(request.getParameter("hospedes"));
            String mensagem = request.getParameter("mensagem");

            // Conecte-se ao banco de dados e salve os dados
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO reservas (nome, sexo, email, dataChegada, noites, hospedes, mensagem) VALUES (?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, nome);
            stmt.setString(2, sexo);
            stmt.setString(3, email);
            stmt.setString(4, dataChegada);
            stmt.setInt(5, noites);
            stmt.setInt(6, hospedes);
            stmt.setString(7, mensagem);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}