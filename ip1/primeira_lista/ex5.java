import java.util.Scanner;

public class ex5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        double vel = 0, dist = 0, tideal = 0, treal = 0, pontuacao = 0;

        System.out.print("Qual a distancia a ser percorrida em km? ");
        dist = input.nextDouble();
        System.out.print("Qual a distancia a ser percorrida em km/h? ");
        vel = input.nextDouble();

        tideal = (dist / vel) * 3600;

        System.out.printf("O tempo ideal em segundos eh: %.2f\n", tideal);
        System.out.println();

        System.out.print("Agr insira o tempo feito por vc, na prova, em horas ");
        treal = input.nextDouble();

        treal = treal * 3600;

        System.out.printf("O seu tempo real em segundo foi: %.2f\n", treal);
        System.out.println();

        System.out.println("Hora de informar a sua pontuacao!");
        if(treal > tideal) // Se Adiantar
        {
            pontuacao = tideal - treal;
            pontuacao = pontuacao * 2;
            System.out.printf("Parabens, sua pontuacao foi %.0f\n", pontuacao);
        }
        else if(treal < tideal) // Se Atrasar
        {
            pontuacao = treal - tideal;
            pontuacao = pontuacao * 1;
            System.out.printf("Parabens, sua pontuacao foi %.0f", pontuacao);
  
        }
        else // Pontuacao zerada
        {    
            pontuacao = 0;
            System.out.println("Parabens, vc eh o ganhador");
        }
    }
}
