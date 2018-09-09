import java.util.Scanner;

public class ex8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, nota3 = 0, media = 0;
        
        System.out.println("Pf, informar:"); 
        System.out.print("Qual foi sua primeira nota? ");
        nota1 = input.nextDouble();
        System.out.print("Qual foi sua segunda nota? ");
        nota2 = input.nextDouble();
        System.out.println();
        
        media = (nota1 + nota2) / 2;
        
        if(media >= 7)
        {
            System.out.printf("O aluno obteve uma media %.2f e esta ", media); 
            System.out.println("aprovado por media");
        }
        else if(media < 3)
        {
            System.out.printf("O aluno obteve uma media %.2f e esta ", media); 
            System.out.println("reprovado por media");
        }
        else
        {
            System.out.println("Voce fara final");
            System.out.println();
            System.out.print("Qual foi sua nota na final? ");
            nota3 = input.nextDouble();
            
            media = (nota3 + media) / 2;
            
            System.out.printf("O aluno obteve uma media %.2f e esta ", media);
            
            if(media >= 5)
                System.out.println("aprovado");
            else
                System.out.println("reprovado");
        }
    }
}