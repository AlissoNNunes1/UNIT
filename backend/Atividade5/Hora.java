import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hora {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        
       
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formatador);
        
        
        System.out.println("Data e hora atuais: " + dataHoraFormatada);
    }
}
