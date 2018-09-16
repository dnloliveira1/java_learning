import java.util.Scanner;

public class ex8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dia = 0, mes = 0, ano = 0;
        
        System.out.println("Pf, informe...");
        System.out.print("um dia: ");
        dia = input.nextInt();
        System.out.print("um mes: ");
        mes = input.nextInt();
        System.out.print("um ano, em d.C: ");
        ano = input.nextInt();
        System.out.println();
        
        if(ano < 0 || ano > 250000) // acredito que a humanidade, na terra, ira durar no maximo mais 250 mil anos, quem sabe mais anos fora dela...
            System.out.println("Nao eh uma data valida");
        else if((ano % 4 == 0) && !(ano % 100 == 0)) // if((ano % 400) == 0) - Anos bissextos
        {
            if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 0 && dia <= 31))
                System.out.println("Eh uma data valida");
            else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia <= 30))
                System.out.println("Eh uma data valida");
            else if(mes == 2 && (dia > 0 && dia <= 29))
                System.out.println("Eh uma data valida");
            else
                System.out.println("Nao eh uma data valida");
        }
        else // Anos normais
        {
            if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 0 && dia <= 31))
                System.out.println("Eh uma data valida");
            else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia <= 30))
                System.out.println("Eh uma data valida");
            else if(mes == 2 && (dia > 0 && dia <= 28))
                System.out.println("Eh uma data valida");
            else
                System.out.println("Nao eh uma data valida");
        }
    }
}