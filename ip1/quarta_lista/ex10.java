import java.util.Scanner;

public class ex10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int HorasExtras = 0, HorasFaltou = 0, premio = 0;
        double total = 0; // Nao se podia colocar o total no formato int, ver revisao.txt...
        
        System.out.println("Pf, informar:"); 
        System.out.print("Qual o numero de horas que vc trabalhou ");
        HorasExtras = input.nextInt();
        System.out.print("Qual o numero de horas que vc fatlou ao trabalho? ");
        HorasFaltou = input.nextInt();
        System.out.println();
        
        total = HorasExtras - (2.0/3.0 * HorasFaltou); // 2/3 = (int) 0 <=> 2.0/3.0 = (double) 0.666
                
        if(total > 40)
            premio = 200;
        else if(total > 30)
            premio = 175;
        else if(total > 20)
            premio = 150;
        else if(total > 10)
            premio = 125;
        else
            premio = 100;
            
        System.out.printf("O funcionario recebera R$%d de gratificacao de Natal\n", premio);
    }
}
