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
        System.out.printf("O aluno obteve uma media %.2f e ", media); 
        
        if(media >= 7)
            System.out.println("esta aprovado por media");
        else if(media < 3)
            System.out.println("esta reprovado por media");
        else
        {
            nota3 = 10 - media;
            System.out.printf("fara o exame final, ");
            System.out.printf("na final precisa tirar %.2f para ser aprovado\n", nota3);
        }
    }
}
