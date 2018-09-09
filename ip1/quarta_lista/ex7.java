import java.util.Scanner;

public class ex7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int tempo = 0;
        double salario = 0, gratifica = 0;
        
        System.out.println("Pf, informar:"); 
        System.out.print("Qual o seu tempo de servico, em anos? ");
        tempo = input.nextInt();
        System.out.print("Qual o seu salario? ");
        salario = input.nextDouble();
        System.out.println();
        
        if(tempo >= 10)
            gratifica = salario * 0.2;
        else
            gratifica = salario * 0.1;
            
        System.out.printf("A gratificacao que vc ira receber sera de R$%.2f\n", gratifica);
    }
}