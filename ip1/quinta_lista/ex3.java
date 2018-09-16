import java.util.Scanner;

public class ex3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num1 = 0, num2 = 0, num3 = 0;
        
        System.out.print("Infome o numero1: ");
        num1 = input.nextDouble();
        System.out.print("Infome o numero2: ");
        num2 = input.nextDouble();
        System.out.print("Infome o numero3: ");
        num3 = input.nextDouble();
        System.out.println();
        
        if(num1 > num2 && num1 > num3)
            System.out.println("O numero1 eh o maior, dentro os tres numeros inseridos");
        else if(num2 > num1 && num2 > num3)
            System.out.println("O numero2 eh o maior, dentro os tres numeros inseridos");
        else
            System.out.println("O numero3 eh o maior, dentro os tres numeros inseridos");
    }
}