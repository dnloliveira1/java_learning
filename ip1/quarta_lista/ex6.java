import java.util.Scanner;

public class ex6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double A = 0, B = 0, C = 0, delta = 0, x1 = 0, x2 = 0, elevado = 2; // quando declaro a variavel elevado, o valor 2 passa a ser do tipo doublo, logo 2.0
        
        System.out.println("Calculadora de equacao do segundo grau! Ax^2 + Bx + C = 0");
        System.out.print("Qual o valor do coeficiente A? ");
        A = input.nextDouble();
        System.out.print("Qual o valor do coeficiente B? ");
        B = input.nextDouble();
        System.out.print("Qual o valor do coeficiente C? ");
        C = input.nextDouble();
        System.out.println();
        
        delta = Math.pow(B, elevado) - 4 * A * C;
        
        if(delta > 0)
        {
            x1 = (-B + Math.sqrt(delta)) / (2*A);
            x2 = (-B - Math.sqrt(delta)) / (2*A);
            System.out.printf("Suas respostas sao x1 = %.2f e x2 = %.2f\n", x1, x2);
        }
        else if(delta < 0)
            System.out.println("Nao existe raiz real");
        else
        {
            x1 = -B / (2*A);
            x2 = x1;
            System.out.printf("Suas respostas sao igauis para x1 e x2, no caso x1 = x2 = %.2f\n", x2);
        }
    }
}