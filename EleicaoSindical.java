/** Exercício 2 – EleicaoSindical
    * Aluno: Euro da Cunha Chaves Filho – Matricula: 20220054786 
    * Aluno: Fernando d’Ávila L.B.C. Filho – Matricula: 20220054820
    */

import java.util.Scanner;

public class EleicaoSindical {
    public static void main(String[] args) throws Exception {

        Scanner scannerA = new Scanner(System.in);
        System.out.print("Digite os votos de Adalberto: ");
        float entradaA = scannerA.nextInt();
        System.out.println("Adalberto teve " + entradaA + " votos");

        System.out.print("Digite os votos de Borges: ");
        float entradaB = scannerA.nextInt();
        System.out.println("Borges teve " + entradaB + " votos");

        System.out.print("Digite os votos de Caio: ");
        float entradaC = scannerA.nextInt();
        System.out.println("Caio teve " + entradaC + " votos");

        System.out.print("Digite os votos brancos: ");
        float entradabranco = scannerA.nextInt();
        System.out.println("Brancos tiveram " + entradabranco + " votos");

        System.out.print("Digite os votos nulos: ");
        float entradanulo = scannerA.nextInt();
        System.out.println("Nulo teve " + entradanulo + " votos");
        scannerA.close();

        float eleitores;
        eleitores = entradaA + entradaB + entradaC + entradabranco + entradanulo;

        System.out.println("tiveram " + eleitores + " eleitores");

        float percentA = entradaA / eleitores * 100;
        float percentB = entradaB / eleitores * 100;
        float percentC = entradaC / eleitores * 100;
        float percentbranco = entradabranco / eleitores * 100;
        float percentnulo = entradanulo / eleitores * 100;

        System.out.print("O percentual de eleitores de Adalberto foi de: " + percentA + "\n");
        System.out.print("O percentual de eleitores de Borges foi de: " + percentB + "\n");
        System.out.print("O percentual de eleitores de Caio foi de: " + percentC + "\n");
        System.out.print("O percentual de eleitores de branco foi de: " + percentbranco + "\n");
        System.out.print("O percentual de eleitores de nulo foi de: " + percentnulo + "\n");

    }
}