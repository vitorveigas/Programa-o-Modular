import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class AulasPM242 {
    public static void main(String[] args){
            String path = "./src/main/java/pucmg/aulaspm242/data/arg2.txt";
            try {
                // Fluxo de Saida de um arquivo
                OutputStream os = new FileOutputStream(path);
                Writer wr = new OutputStreamWriter(OS);
                BufferedWriter br = new BufferedWriter(wr);
                br.write("Escrevendo nosso primeiro arquivo em Java!");
                br.newLine();
                br.write("Outra Linha!");
                br.close();
            } catch (Exception e) {
                System.out.println("Algo de errado não está certo");
            }
    }
}

