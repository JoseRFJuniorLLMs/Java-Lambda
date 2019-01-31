package busca_arquivos;

import java.nio.file.Files;
import java.nio.file.Paths;
/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class BuscaArquivo3_Funcional {
   public static void main(String[] args) throws Exception {
      String palavra = "JOSE";
      String arquivo = "nomes.txt";
      
      long contador = Files.lines(Paths.get(arquivo))
         .filter(linha -> linha.contains(palavra))
         .count();
      System.out.printf("A palavra [%s] ocorreu %d vezes\n", palavra, contador);
   }

}
