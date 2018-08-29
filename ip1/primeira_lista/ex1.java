import java.util.Scanner;

public class ex1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        double cateto1 = 0, cateto2 = 0, hipotenusa = 0, elevado = 2.0;

        System.out.println("Informe o cateto1 e o cateto2?");
        cateto1 = input.nextDouble();
        cateto2 = input.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(cateto1,elevado) + Math.pow(cateto2,elevado));
        System.out.printf("hipotenusa: %.2f\n", hipotenusa);
    }
}
