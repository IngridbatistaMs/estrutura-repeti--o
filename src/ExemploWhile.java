import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada>0) {
            Double valorDoDoce = valorAleatorio();
            if (valorDoDoce > mesada) 
                valorDoDoce = mesada;

            System.out.println("Valor do doce: " + valorDoDoce + " foi adicionado no carrinho");
            mesada = mesada - valorDoDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
