package ex5;
// Demonstrating lambdas and streams with an array of Integers.

public class Aula334 {
    public static void main(String[] args) {
        //Analisador upparCase = (s) -> s.toUpperCase();
        Analisador upparCase = String::toUpperCase;
        System.out.println(upparCase.analiza("testando lambda"));

        //Operacao soma = ((a, b) -> a + b);
        //Operacao soma = ((a, b) -> Integer.sum(a,b));
        Operacao soma = Integer::sum;
        System.out.println("SOMA A E B :" + (soma.opera(1 , 2)));

    } //
}