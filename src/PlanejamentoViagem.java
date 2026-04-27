
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
        String duracaoString = JOptionPane.showInputDialog("Quantos dias de viagem ?");
        String gastoDiario = JOptionPane.showInputDialog("Quanto de gasto por dia ?");
        
        if(viajante.isEmpty()|| duracaoString.isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Campos vazios (╬▔皿▔)╯ ");
        }
 
        int duracao = Integer.parseInt(duracaoString);
        double gastoDay = Double.parseDouble(gastoDiario);

            
        
        boolean valida = false;
        while(valida == false){// loop obrigando a entrada de uma data válida .
            try{
            String dataStr = JOptionPane.showInputDialog("qual dia da viajem ? dd/MM/yyyy ");
            //validação de data 
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataViagem = LocalDate.parse(dataStr, df);
            valida = true;
            
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null,"DATA INVÁLIDA ");

            }
        }
        
        
        
        
        
        
        
    }
}
