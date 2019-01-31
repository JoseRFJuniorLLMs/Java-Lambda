package ex6;

import java.util.Optional;
/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class Principal {
    public static void main(String[] args) {

        Cache cache = new Cache();
        Optional<Jogador> ronaldo = cache.get("Ronaldo");
        //ronaldo.map(jogador -> jogador.getNome());
        ronaldo.map(Jogador::getNome).ifPresent(System.out::println);
    }
}
