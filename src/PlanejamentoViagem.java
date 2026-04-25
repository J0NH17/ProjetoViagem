
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.JOptionPane;

public class PlanejamentoViagem {

    public static void main(String[] args) {

        int confirma = JOptionPane.showConfirmDialog(null, "Deseja marcar viajar ? ", "PLANERJAR VIAGEM", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_NO_OPTION) {

        } else {

            JOptionPane.showMessageDialog(null, "viajem cancelada");
        }
        marcarV();
    }

    public static void marcarV() {
        

        String viajante = JOptionPane.showInputDialog("Qual o nome do viajante");
        if (viajante.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio ");
        }
        String duracaoString = JOptionPane.showInputDialog("Quantos dias de viagem ?");
        if (duracaoString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio ");
        }

        int duracao = Integer.parseInt(duracaoString);
        String gastoDiario = JOptionPane.showInputDialog("Quanto de gasto por dia ?");
        double gastoDay = Double.parseDouble(gastoDiario);

        String dataStr = JOptionPane.showInputDialog("qual dia da viajem ? dd/MM/yyyy ");
         LocalDate dataViagem = LocalDate.now() ;

        try{
        //validação de data 
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataViagem = LocalDate.parse(dataStr, df);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"DATA INVÁLIDA ");

        }
        dataViagem.getDayOfMonth();
  
    }

}
