import java.util.Scanner;

public class ex9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double consumo = 0, conta = 0, minima = 7, PorConsumo = 1.4 , IluPublic = 3.5;
        
        System.out.println("Pf, informar:"); 
        System.out.print("Qual foi seu consumo em quilowatts mensal? ");
        consumo = input.nextDouble();
        System.out.println();
        
        if(consumo < 10) // Todos pagam taxa de IluPublic, independente de seu consumo
            conta = minima + IluPublic;
        else
            conta = (consumo * PorConsumo) + IluPublic;
            
        System.out.printf("A sua conta de energia sera R$%.2f\n", conta);
        
    }
}