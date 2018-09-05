import java.util.Scanner;

public class ex4
{
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        int horas = 0, minutos = 0, segundos = 0, tempo = 0;
        double distancia = 0, metros = 0, VelocidadeMedia = 0;
        
        System.out.print("Informar a distancia (em km): ");
        distancia = input.nextDouble();
        System.out.println("Informe o tempo gasto para recorre-la");
        System.out.print("Horas: ");
        horas = input.nextInt();
        System.out.print("Minutos: ");
        minutos = input.nextInt();
        System.out.print("Segundos: ");
        segundos = input.nextInt();
        metros = distancia * 1000;
        tempo = (horas * 3600) + (minutos * 60) + segundos;
        VelocidadeMedia = metros/tempo;
        
        System.out.println();
        System.out.printf("Velocoidade media eh: %.4f m/s\n", VelocidadeMedia);
    }
}
