package ex7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Principal {

    public static void filtro(List<String> lista, Predicate<String> condicao) {

         lista.stream()
                .map(String::toUpperCase)
                .filter(condicao::test)
                .forEach(System.out::println);
    }
        public static void main (String[] args){
            List<String> lista1 = Arrays.asList("Santa Caratirna", "Ceara", "Maranhao", "Maranhao", "MARANHAO");
            System.out.println("Estados :");
            filtro(lista1, s -> s.startsWith("M"));
        }
    }
