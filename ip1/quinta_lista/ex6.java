import java.util.Scanner;

public class ex6
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
        {
            System.out.print("Estes valores formam um ");
            
            if(lado1 == lado2 && lado2 == lado3 && lado1 == lado3)
                System.out.println("trinagulo equilatero");
            else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3)
                System.out.println("trinagulo escaleno");
            else // if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
                System.out.println("trinagulo isoceles");
        }
        else
            System.out.println("Estes valores não formam um triângulo");
    }
}