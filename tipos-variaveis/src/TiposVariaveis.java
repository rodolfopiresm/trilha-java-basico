public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500; // se usar 2.500 no java seria o referente 2.5

        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // o java entende que o numero curto é menor
        short numeroCurto2 = (short) numeroNormal; // para converter um numero normal para curto, tem que usar o cast

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_PI = 3.14; // o final é para declarar uma constante,
        //ou seja, um valor que não pode ser alterado e deve ser sempre em CAIXA ALTA


    }
}