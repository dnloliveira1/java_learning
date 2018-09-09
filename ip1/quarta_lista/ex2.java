import java.util.Scanner;

public class ex2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a = 0, b = 0, x = 0;
        
        System.out.println("Calculadora de equacao do primeiro grau! Ax + B = 0");
        System.out.print("Qual o valor do coeficiente A? ");
        a = input.nextInt();
        
        if(a == 0 )
            System.out.println("Nao se pode ser calculado");
        else
        {
            System.out.print("Qual o valor do coeficiente B? ");
            b = input.nextInt();
            System.out.println();
            
            x = - (b / a);
            System.out.printf("O valor de x eh %.1f\n", x);
        }
    }
}
