import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		/* Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
		* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		* começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		Scanner sc = new Scanner(System.in);
		
		int hInicio = sc.nextInt();
		int hFinal = sc.nextInt();
		
		int duracao;
		if (hInicio < hFinal) {
			duracao = hFinal - hInicio;
		}
		else {
			duracao = 24 - hInicio + hFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
