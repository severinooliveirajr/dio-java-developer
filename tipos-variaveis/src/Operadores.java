public class Operadores {

    public static void main(String[] args) {
        //String nomeCompleto = "LINGUAGEM" + "JAVA";
        //System.out.println(nomeCompleto);

        //String Concatenacao = "?";

        //Concatenacao = 1 + 1 + 1 + "1";
        //System.out.println(Concatenacao);

        //Concatenacao = 1 + "1" + 1 + 1;
        //System.out.println(Concatenacao);

        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);
        numero = - numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        System.out.println(numero ++);
        System.out.println(numero);
        System.out.println(++ numero);

        boolean controle = false;
        System.out.println(controle);
        System.out.println(!controle);

        int a, b;
        a = 6;
        b = 5;

        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        String nomeUm = "SEVERINO";
        String nomeDois = "SEVERINO";
        String nomeTres = new String("SEVERINO");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeTres);
        // Preferencialmente utilizar equal para comparar objetos
        System.out.println(nomeUm.equals(nomeTres));

        if (nomeUm.equals(nomeTres) && numero > 5) {
            System.out.println("As duas expressões são verdadeiras.");
        }

        if (nomeUm.equals(nomeTres) || numero < 5) {
            System.out.println("Umas das expressões é verdadeira.");
        }

        System.out.println("Fim.");
    }
}