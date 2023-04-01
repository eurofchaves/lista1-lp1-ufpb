/** Exercício 1 – Tabuada
    * Aluno: Euro da Cunha Chaves Filho – Matricula: 20220054786 
    * Aluno: Fernando d’Ávila L.B.C. Filho – Matricula: 20220054820
    */
import java.util.Scanner;
 
public class Tabuada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha uma opção de tabuada:");
    System.out.println("1. Soma");
    System.out.println("2. Subtração");
    System.out.println("3. Multiplicação");
    System.out.println("4. Divisão");

    int opcao = scanner.nextInt();

    if (opcao < 1 || opcao > 4) {
      System.out.println("Opção inválida!");
      return;
    }

    System.out.println("Digite o número de 1 a 9 da tabuada:");
    int numero = scanner.nextInt();

    if (numero < 1 || numero > 9) {
      System.out.println("Número inválido!");
      return;
    }

  
    switch (opcao) {
      case 1:
        System.out.println("Tabuada de SOMA do " + numero);
        for (int i = 1; i <= 10; i++) {
          System.out.printf("%02d + %d = %02d\n", i, numero, i + numero);
        }
        break;
      case 2:
        System.out.println("Tabuada de SUBTRAÇÃO do " + numero);
        for (int i = 1; i <= 10; i++) {
          System.out.printf("%02d - %d = %02d\n", i, numero, numero - i);
        }
        break;
      case 3:
        System.out.println("Tabuada de MULTIPLICAÇÃO do " + numero);
        for (int i = 1; i <= 10; i++) {
          System.out.printf("%02d x %d = %02d\n", i, numero, i * numero);
        }
        break;
      case 4:
        System.out.println("Tabuada de DIVISÃO do " + numero);
        for (int i = 1; i <= 10; i++) {
          System.out.printf("%02d / %d = %.2f\n", i, numero, (float) i / numero);
        }
        break;
    }

    scanner.close();
  }
}