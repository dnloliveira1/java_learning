import java.util.Scanner;

public class ex5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double lado1 = 0, lado2 = 0, lado3 = 0;
        
        System.out.println("Pf, informe...");
        System.out.print("Segmento de reta 1: ");
        lado1 = input.nextDouble();
        System.out.print("Segmento de reta 2: ");
        lado2 = input.nextDouble();
        System.out.print("Segmento de reta 3: ");
        lado3 = input.nextDouble();
        System.out.println();
        
        if((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2)
            System.out.println("Estes valores formam um triângulo");
        else
            System.out.println("Estes valores não formam um triângulo");
    }
}