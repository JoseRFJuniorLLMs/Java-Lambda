package ex6;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class Cache {
    private  final Map<String, Jogador> cache = new HashMap<>();

    public Optional <Jogador> get(String chave) {

        return Optional.ofNullable(cache.get(chave));
    }

    public Jogador get(String chave, Supplier<Jogador> jogadorSupplier){

        Jogador jogador = cache.get(chave);
        if (jogador == null) {
            jogador = jogadorSupplier.get();
            cache.put(chave, jogador);
        }
        return jogador;
    }
}
