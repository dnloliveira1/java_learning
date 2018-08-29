import java.util.Scanner;

public class ex4
{
    public static void main(String[] args)
    {
	    Scanner input = new Scanner (System.in);
	    double tempo = 0, vel = 0, dist = 0, litros = 0, faz = 15;

	    System.out.println("Informe o tempo pecorrido em horas e a velocidade media percorida em km/h, nessa ordem");
	    tempo = input.nextDouble();
        vel = input.nextDouble();
        dist = tempo * vel;
        litros = dist * faz;
        System.out.printf("litros de combustivel gastos: %.1f\n", litros);
    }
}
