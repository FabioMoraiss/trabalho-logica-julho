import java.util.Scanner;

public class main {
    // CORES
    public static final String rst = "\u001B[0m"; // resetar cores
    public static final String gre = "\u001B[32m"; // verde para as respostas
    public static final String yll = "\u001B[33m"; // amarelo para perguntas
    public static final String red = "\u001B[31m"; // vermelho para valores invalidos
    public static final String cyn = "\u001B[36m"; // ciano para iniciando problema
    public static final String neg = "\u001B[1m"; // negrito
    // SCANNER
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        int problema;
        int tentativas = 0;
        apresentacao();

        while (continuar) {
            if (tentativas == 1) {
                Digitando("**************************************************");
                BemVindoDeVoltaMenuPrincipal();

            }

            Meunu_Problemas();
            problema = input.nextInt();
            Digitando("");

            switch (problema) {
                case 1:
                    Bora();
                    Menu_PrimosNoIntervalo();
                    break;

                case 2:
                    Bora();
                    Menu_Ordenados();
                    break;

                case 3:
                    Bora();
                    Menu_Perfeitos();
                    break;

                case 4:
                    Bora();
                    Menu_Piramede();
                    break;
                case 5:
                    Bora();
                    Menu_PrimosPerfeitos();
                    break;

                case 0:
                    Digitando("Quer dizer que vc me usa e discarta assim ? #chateado");
                    Digitando("");
                    continuar = false;
                    break;

                default:
                    Digitando(red + "vc digitou um numero invaldo!" + rst);
                    Digitando("");
            }

            if (tentativas == 0) {
                tentativas++;
            }

        }

    }

    // frufru, purpurida, coisas pra ficar bonitinho

    public static void apresentacao() {
        Digitando("********************");
        Digitando("");
        Digitando("BEM VINDO AO TRABALHO DE RARINALDO FABIO MORAIS DE OLIVEIRA JUNIOR");
        Digitando("");
        Digitando("********************");
    }

    public static void Meunu_Problemas() {
        Digitando("");
        Digitando(yll + "qual problema você quer resolver ? digite o numeor dele" + rst);
        Digitando("1: primos no intervao");
        Digitando("2: ordenados");
        Digitando("3: perfeitos");
        Digitando("4: piramede");
        Digitando("5: primos perfeitos");
        Digitando("0: encerra o programa");
        Digitando("");

    }

    public static void Bora() {
        Digitando("claro, vamos resolver esse problema ai!");
    }

    public static void BemVindoDeVoltaMenuPrincipal() {
        Digitando("Bem vindo de volta ao menu principal :3");

    }

    public static void Digitando(String x) {
        for (int i = 0; i < x.length(); i++) {
            System.out.print(x.charAt(i));
            Esperar();
        }
        System.out.println();
    }

    public static void Esperar() {
        try {
            Thread.sleep(20); // poem 40 na hora de apresentar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void LinhaVazia() {
        System.out.println();
    }

    public static boolean DesejaReptiroProblema() {
        boolean continuar = true;
        int tentativas = 0;

        while (continuar) {
            if (tentativas == 1) {
                asteriscos();
                Digitando(red + "EU FALEI PRA VC DIGITAR OU 0 OU 1" + rst);
            }

            Digitando(yll + "Gostaria de repitir esse exercicio ? digite 0 ou 1" + rst);
            int resposta = input.nextInt();

            if (resposta == 0) {
                return false;

            } else if (resposta == 1) {
                return true;

            } else {
                tentativas++;
                continue;
            }

        }

        return false; // gambiarra pra função funcionar

    }

    public static void IniciandoOProblema() {
        LinhaVazia();
        asteriscos();
        Digitando(cyn + "iniciando o problema....." + rst);
    }

    public static void asteriscos() {
        Digitando("**************************************************");
        LinhaVazia();
    }

    // meus dos problemas

    public static void Menu_PrimosNoIntervalo() {
        IniciandoOProblema();

        boolean continuar = true;
        int tentativas = 0;

        while (continuar) {
            if (tentativas == 1) {
                asteriscos();
                Digitando("vamos tentar 'primos no intervalo' de novo !");
                LinhaVazia();
            }

            Digitando(yll + "preciso de 2 numeros inteiros e positivos, pode digitar" + rst);
            int numero1 = input.nextInt();
            int numero2 = input.nextInt();
            boolean numerosRespeitamRegras = verificase2numerosPositivos(numero1, numero2);

            if (numerosRespeitamRegras) {

                PrimosNoIntervalo(numero1, numero2);

                if (DesejaReptiroProblema()) {
                    // vazio
                } else {
                    continuar = false;
                }

            } else {
                Digitando(red + "você digitou valores inválidos" + rst);
                LinhaVazia();

            }

            if (tentativas == 0) {
                tentativas++;
            }
        }

    }

    public static void Menu_Ordenados() {
        IniciandoOProblema();

        boolean continuar = true;
        int tentativas = 0;

        while (continuar) {
            if (tentativas == 1) {
                asteriscos();
                Digitando("vamos tentar 'Ordenados ' de novo !");
                LinhaVazia();
            }

            Digitando(
                    yll + "preciso do numero de entradas, lembrando que tem que ser pelo menos 3, pode digitar" + rst);
            int numeroEntradas = input.nextInt();
            Ordenados(numeroEntradas);

            if (DesejaReptiroProblema()) {
                // vazio
            } else {
                continuar = false;
            }

        }

    }

    public static void Menu_Perfeitos() {
        IniciandoOProblema();

        boolean continuar = true;
        int tentativas = 0;

        while (continuar) {
            if (tentativas == 1) {
                asteriscos();
                Digitando("vamos tentar 'Perfeitos' de novo !");
                LinhaVazia();
            }

            Digitando(yll + "preciso de 2 numeros inteiros e positivos, pode digitar" + rst);
            int numero1 = input.nextInt();
            int numero2 = input.nextInt();
            boolean numerosRespeitamRegras = verificase2numerosPositivos(numero1, numero2);

            if (numerosRespeitamRegras) {

                Perfeitos(numero1, numero2);

                if (DesejaReptiroProblema()) {
                    // vazio
                } else {
                    continuar = false;
                }

            } else {
                Digitando(red + "você digitou valores inválidos" + rst);
                LinhaVazia();

            }

            if (tentativas == 0) {
                tentativas++;
            }
        }
    }

    public static void Menu_Piramede() {
        IniciandoOProblema();

        boolean continuar = true;
        int tentativas = 0;

        while (continuar) {
            if (tentativas == 1) {
                asteriscos();
                Digitando("vamos tentar 'piramede' de novo !");
                LinhaVazia();

            }

            Digitando(yll + neg + "Digite 1 numero positivo" + rst);
            int numero = input.nextInt();
            boolean numeroRespeitaRegra = confereSeoNumeroEhPostivo(numero);

            if (numeroRespeitaRegra) {
                LinhaVazia();
                Piramede(numero);
                LinhaVazia();
                

                if (DesejaReptiroProblema()) {
                    // vazio
                } else {
                    continuar = false;
                }
            } else {
                Digitando(red + "você digitou um valor inválido" + rst);
                LinhaVazia();

            }

            if (tentativas == 0) {
                tentativas++;
            }

        }
    }

    public static void Menu_PrimosPerfeitos() {
        IniciandoOProblema();

        boolean continuar = true;
        int tentativas = 0;

        while (continuar) {

            if (tentativas == 1) {
                asteriscos();
                Digitando("vamos tentar 'Perfeitos' de novo !");
                LinhaVazia();
            }

            Digitando(
                    yll + neg + "preciso de 1 numero primo positivo, lembrando que 1 não é primo, pode digitar" + rst);
            int numero = input.nextInt();
            boolean numeroRespeitaRegras = verificarRegrasPrimosPerfeitos(numero);

            if (numeroRespeitaRegras) {

                PrimoPerfeito(numero);

                if (DesejaReptiroProblema()) {
                    // vazio
                } else {
                    continuar = false;
                }

            }

            if (tentativas == 0) {
                tentativas++;
            }

        }
    }

    // problemas de fato
    // ********************************************************************************

    public static void PrimosNoIntervalo(int numero1, int numero2) {
        int copiatemporaria;
        int quantidadeDePrimos = 0;
        // ordenar os numeros
        if (numero1 > numero2) {
            copiatemporaria = numero1;
            numero1 = numero2;
            numero2 = copiatemporaria;
        }
        // fim da ordenação

        for (int i = numero1; i <= numero2; i++) {
            if (confereSeoNumeroEhPrimo(i)) {
                quantidadeDePrimos++;
            }
        }

        respostaPrimosNoIntervalo(quantidadeDePrimos, numero1, numero2);
        LinhaVazia();

    }

    public static void Ordenados(int numeroEntradas) {

        boolean sequenciaCrescente = true;
        boolean sequenciaDescrescente = true;
        boolean sequenciaIgual = true;

        Digitando("Digite a entrada 1");
        int numeroAnterior = input.nextInt();
        int numeroAtual;

        for (int i = 2; i <= numeroEntradas; i++) {
            Digitando("digite a entrada " + i);
            numeroAtual = input.nextInt();

            if (numeroAtual < numeroAnterior) {
                sequenciaCrescente = false;
            } else if (numeroAtual > numeroAnterior) {
                sequenciaDescrescente = false;
            }

            if (numeroAtual != numeroAnterior) {
                sequenciaIgual = false;
            }

            numeroAnterior = numeroAtual;
        }

        respostaOrdenados(sequenciaIgual, sequenciaCrescente, sequenciaDescrescente);
    }

    public static void Perfeitos(int numero1, int numero2) { // função para verficiar a quantidade de numeros perfeitos
                                                             // no intervalo
        int copiatemporaria;
        int quantidadeDePerfeitos = 0;
        // ordenar os numeros
        if (numero1 > numero2) {
            copiatemporaria = numero1;
            numero1 = numero2;
            numero2 = copiatemporaria;
        }
        // fim da ordenação

        for (int i = numero1; i <= numero2; i++) {

            if (confeseSeEhPerfeito(i)) {
                quantidadeDePerfeitos++;
            }
        }

        respostaPerfeitos(quantidadeDePerfeitos, numero1, numero2);

    }

    public static void Piramede(int x) {
        for (int i = 0; i <= x; i++) {
            String enfeite = "+_";
            enfeite += fazerUnderlines(x - i);

            if (i == 0) {
                Digitando(gre + neg + enfeite + "_" + stringInvertida(enfeite) + rst);
            } else {
                Digitando(gre + neg + enfeite + fazernumeros(i) + stringInvertida(enfeite) + rst);
            }

        }
    }

    public static void PrimoPerfeito(int x) {
        boolean ehPerfeito = false;
        int somaDosPrimos = 0;

        for (int i = 2; i < x; i++) {
            if (confereSeoNumeroEhPrimo(i)) {
                somaDosPrimos += i;
            }

            if (somaDosPrimos == x) {
                ehPerfeito = true;
                break;
            }

        }

        if (x == 2) {
            ehPerfeito = true;
        }

        respostaPrimosPerfeitos(ehPerfeito, x);
    }

    // fim problemas de fato
    // *******************************************************************************

    // funcoes escondidas
    // **************************************************************************
    public static boolean confereSeoNumeroEhPostivo(int numero) {
        if (numero > 0) {
            return true;
        }
        return false;
    }

    public static boolean verificase2numerosPositivos(int x, int y) {
        boolean primeironumeroOK = confereSeoNumeroEhPostivo(x);
        boolean segundonumeroOK = confereSeoNumeroEhPostivo(y);

        if (primeironumeroOK && segundonumeroOK) {
            return true;
        }
        return false;

    }

    public static boolean confereSeoNumeroEhPrimo(int x) {

        if (x == 1) {
            return false;
        }

        for (int i = 2; i < x; i++) {

            if (x % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static boolean confeseSeEhPerfeito(int x) {
        int SomaDeDivisores = 0;

        for (int i = 1; i < x; i++) {

            if (ehdivisor(x, i)) {
                SomaDeDivisores += i;
            }
        }

        if (SomaDeDivisores == x) {
            return true;
        }
        return false;
    }

    public static boolean ehdivisor(int dividendo, int divisor) { // divisor é o numero que está dividindo, dividendo é
                                                                  // o numero que está sendo divido
        if (dividendo % divisor == 0) {
            return true;
        }
        return false;

    }

    public static boolean verificarRegrasPrimosPerfeitos(int x) {
        if (x < 0) {
            Digitando(red + "o numero não pode ser  negativo!" + rst);
            return false;
        } else if (x == 1) {
            Digitando(red + "O numero não pode ser 1!" + rst);
            return false;

        } else if (!confereSeoNumeroEhPrimo(x)) {
            Digitando(red + "o numero tem que ser primo !" + rst);
            return false;
        } else if (x == 0) {
            Digitando(red + "o numero não pode ser nulo !" + rst);
            return false;
        } else {
            return true;
        }

    }

    public static void mostarPerfeitos(int x, int y) {
        for (int i = x; i <= y; i++) {

            if (confeseSeEhPerfeito(i)) {
                System.out.println(i);
            }
        }
    }

    public static void mostrarPrimosPerfeitos(int x) {

        if (x == 2) {
            Digitando("2");
        }
        int somaDosPrimos = 0;
        for (int i = 2; i < x; i++) {
            if (confereSeoNumeroEhPrimo(i)) {
                System.out.println(i);
                Esperar();
                somaDosPrimos += i;
            }

            if (somaDosPrimos == x) {
                break;
            }

        }
    }

    public static String fazerUnderlines(int u) {
        String underline = "_";
        String retorno = "";

        for (int i = 0; i < u; i++) {
            retorno += underline;
        }

        return retorno;

    }

    public static String stringInvertida(String k) {
        String retorno = "";
        for (int i = k.length() - 1; i >= 0; i--) {
            retorno += k.charAt(i);
        }

        return retorno;

    }

     public static String fazernumeros(int y) {
        String retorno = "";
        for (int i = 0; i <= y; i++) {
            if (i == 0) {
                retorno += "\s"; // caractere de espaço
            } else {
                retorno += i + "\s";
            }
        }

        return retorno;
    }

    // fim funcoes escondidas
    // **************************************************************************

    // respostas
    // ***********************************************************************************************

    public static void respostaPrimosNoIntervalo(int quantidade, int numero1, int numero2) {
        Digitando(gre + neg + "no intervalo [ " + numero1 + ", " + numero2 + " ] há " + quantidade + " primos" + rst);
    }

    public static void respostaOrdenados(boolean igual, boolean cres, boolean descres) {
        if (igual) {
            Digitando(gre + neg + "Todos os valores são iguais." + rst);
        } else if (cres) {
            Digitando(gre + neg + "Os valores estão ordenados de maneira CRESscente." + rst);
        } else if (descres) {
            Digitando(gre + neg + "Os valores estão ordenados de maneira DEcrescente." + rst);
        } else {
            Digitando(gre + neg + "Os valores estão desordenados." + rst);
        }
    }

    public static void respostaPerfeitos(int quantidade, int num1, int num2) {
        Digitando(gre + neg + "no intervalo [ " + num1 + ", " + num2 + " ] há " + quantidade + " numeros perfeitos"
                + rst);
        Digitando(gre + neg + "eles são: " + rst);

        mostarPerfeitos(num1, num2);
    }

    public static void respostaPrimosPerfeitos(boolean ehPerfeito, int primo) {

        if (ehPerfeito) {
            Digitando(gre + neg + "O numero " + primo + " é um primo perfeito ! igual a você :)" + rst);
            Digitando(gre + neg + "é o resultado da soma de:" + rst);

            mostrarPrimosPerfeitos(primo);

        } else {
            Digitando(gre + neg + "o numero " + primo + " não é  primo pefeito :(" + rst);
        }
    }
}
