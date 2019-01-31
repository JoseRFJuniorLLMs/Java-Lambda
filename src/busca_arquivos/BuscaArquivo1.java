package busca_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class BuscaArquivo1 {
   public static void main(String[] args) throws Exception {
      String palavra = "SILVA";
      String arquivo = "nomes.txt";
      try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))) {

         long contador = 0;

         String linha = null;

         while ((linha = bufferedReader.readLine()) != null) {
            if (linha.contains(palavra)) {
               contador++;
            }
         }

         System.out.printf("A palavra [%s] ocorreu %d vezes\n", palavra, contador);
      }
   }

}
