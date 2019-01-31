package ex6;
/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class Jogador {
    private final String nome;
    private final int gols;

    public Jogador(String nome, int gols) {
        this.nome = nome;
        this.gols = gols;
    }

    public String getNome() {
        return nome;
    }

    public int getGols() {
        return gols;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", gols=" + gols +
                '}';
    }
}
