import java.util.Scanner;

public class ex2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int ano = 0;
        
        System.out.print("Informe um ano d.C., iremos informar se ele eh bissexto ou nao! ");
        ano = input.nextInt();
        System.out.println();
        
        if((ano % 4 == 0) && !(ano % 100 == 0)) // if((ano % 400) == 0)
            System.out.println("Eh um ano bissexto");
        else
            System.out.println("Nao eh um ano bissexto");
    }   
}