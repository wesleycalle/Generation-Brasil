//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
//Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 

package LogicaProgramacao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		int nota1, nota2, nota3, media;
		
		Scanner calc= new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1=calc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2=calc.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3=calc.nextInt();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		System.out.printf("\nA m�dia final do aluno foi nota: %d", media);
	}

}
