// ListReservationsServlet.java
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ListReservationsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String email = request.getParameter("email");

            // Conecte-se ao banco de dados e busque as reservas
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM reservas WHERE email = ?");
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            // Exiba as reservas na página HTML
            while (rs.next()) {
                response.getWriter().println(rs.getString("nome") + " " + rs.getString("dataChegada") + " " + rs.getInt("noites") + " " + rs.getInt("hospedes") + " " + rs.getString("mensagem"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}