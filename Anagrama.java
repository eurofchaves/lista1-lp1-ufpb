import java.util.Scanner;
import java.util.Arrays;

public class Anagrama{
	/** Exercício 8 – Anagrama
    * Aluno: Euro da Cunha Chaves Filho – Matricula: 20220054786 
    * Aluno: Fernando d’Ávila L.B.C. Filho – Matricula: 20220054820
    */
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual é a primeira string? ");
		String string1 = scanner.next();

		System.out.println("Qual é a segunda string? ");
		String string2 = scanner.next();

        scanner.close();

        String string1_tratada = string1.toLowerCase().replaceAll(" ", "");
        String string2_tratada = string2.toLowerCase().replaceAll(" ", "");

		char[] ArrayDaString1 = string1_tratada.toCharArray();
		char[] ArrayDaString2 = string2_tratada.toCharArray();

        Arrays.sort(ArrayDaString1);
        Arrays.sort(ArrayDaString2);

        if(Arrays.equals(ArrayDaString1, ArrayDaString2) == true){
            System.out.println("São anagramas!");
        }else   
            System.out.println("Não são anagramas!");	
            
	}
}