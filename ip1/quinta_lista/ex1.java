import java.util.Scanner;

public class ex1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double numero = 0;
        
        System.out.print("Informe um número real que esteja na faixa entre 1 e 9 ");
        numero = input.nextDouble();
        System.out.println();
        
        if(numero >= 1 && numero <= 9)
            System.out.println("O valor está dentro da faixa permitida.");
        else
            System.out.println("O valor não está dentro da faixa permitida.");
    }
}