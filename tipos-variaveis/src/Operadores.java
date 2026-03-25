public class Operadores {
    public static void main(String[] args) {
        //String nomeCompleto = "LINGUAGEM" + "JAVA"; // "+" com texto serve para concatenar,
        //juntar as palavras.
        //System.out.println(nomeCompleto);

        int numero = 5; 
        System.out.println(- numero); // dessa forma o número ainda fica positivo

        numero = - numero; // dessa forma no número passa a ser negativo
        System.out.println(numero); 

        numero = + numero; // dessa forma o número ainda mantém negativo,
        //pois o sinal de "+" não tem efeito sobre o número, porque ele é um operador aritimetico
        System.out.println(numero);

        numero = numero * -1; // dessa forma o número passa a ser positivo,
        //pois o operador de multiplicação tem efeito sobre o número, fazendo assim a conversão
        System.out.println(numero);
        
        numero++; // operador de incremento, ele acrescenta mais 1 ao número
        numero = numero + 1; // pega o número atual e soma mais 1
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);// operador de negação, inverte o valor da variável

        boolean variavel2 = true;
        variavel2 = !variavel2;// reatribuindo o valor da variável com negação
        System.out.println(variavel2);

        int a, b;

        a = 5;
        b = 6;
        String resultado = "";

        if (a == b) { // forma com if e else
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }
        System.out.println(resultado);

        String resultado2 = (a == b) ? "Verdadeiro" : "Falso"; // forma com operador ternário,
        //é uma forma mais simples de escrever um if e else
        System.out.println(resultado2);
    }

}
