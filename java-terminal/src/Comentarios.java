public class Comentarios {
    public static void main(String[] args) {
        // Este é um comentário de linha única

        /*
         * Este é um comentário de múltiplas linhas.
         * Ele pode se estender por várias linhas.
         */

          /**
         * Este é um comentário de documentação.
         * Ele é usado para gerar documentação automática.
         * Pode incluir tags como @param, @return, etc.
         * Tem que ser usado por fora de métodos, classes ou atributos para ser reconhecido como documentação.
         */
    }
        /**
         * Forma errada de usar o comentário:
         * Este método foi elaborado as pressas
         * por isso eu abreviei o nome das variáveis
         * mas olha, ele tem a finalidade somar ou multiplicar
         * dois números
         */

    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M = multiplicação
            r = n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
}
