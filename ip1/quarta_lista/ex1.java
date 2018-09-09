import java.util.Scanner;

public class ex1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int idade = 0, MaiorIdade = 18;
        
        System.out.println("Qual a sua idade?");
        idade = input.nextInt();
        
        System.out.printf("Esta pessoa tem %d e ", idade);
        if(idade >= MaiorIdade)
            System.out.print("eh ");
        else
            System.out.print("nao eh ");

        System.out.println("maior de idade.");
    }
}
