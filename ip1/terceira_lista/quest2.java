import java.util.Scanner;

public class quest2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        double raio = 0, comprimento = 0, area = 0, volume = 0, pi = 3.14;

        System.out.println("Qual o valor do raio?");
        raio = input.nextDouble();

        comprimento = 2 * pi * raio;
        area = pi * raio * raio;
        volume = (3 * pi * raio * raio)/4;

        System.out.printf("Saca, tu tens...\npara o comprimento: %.2f,\npara area: %.2f,\npara volume %.2f\n", comprimento, area, volume);  
    }
}
