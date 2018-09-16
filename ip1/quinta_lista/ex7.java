import java.util.Scanner;

public class ex7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double lado1 = 0, lado2 = 0, lado3 = 0, elevado = 2, pol = 0, LadoMaior = 0, LadoMenor1 = 0, LadoMenor2 = 0;
        
        System.out.println("Pf, informe...");
        System.out.print("Segmento de reta 1: ");
        lado1 = input.nextDouble();
        System.out.print("Segmento de reta 2: ");
        lado2 = input.nextDouble();
        System.out.print("Segmento de reta 3: ");
        lado3 = input.nextDouble();
        System.out.println();
        
        if((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2)
        {
            if(lado1 > lado2 && lado1 > lado3) // Lado1 o maior
            {
                LadoMaior = lado1;
                LadoMenor1 = lado2;
                LadoMenor2 = lado3;
                
            }
            else if(lado2 > lado1 && lado2 > lado3) // Lado2 o maior
            {
                LadoMaior = lado2;
                LadoMenor1 = lado1;
                LadoMenor2 = lado3;
            }
            else // Lado3 o maior
            {
                LadoMaior = lado3;
                LadoMenor1 = lado1;
                LadoMenor2 = lado2;
            }
            
            pol = Math.sqrt(Math.pow(LadoMenor1,elevado) + Math.pow(LadoMenor2,elevado));
            
            System.out.print("Estes valores formam um ");
            
            if(LadoMaior > pol)
                System.out.println("trinagulo obtusangulo");
            else if(LadoMaior < pol)
                System.out.println("trinagulo acutangulo");
            else // if(LadoMaior == pol)
                System.out.println("trinagulo retangulo");
        }
        else
            System.out.println("Estes valores não formam um triângulo");
    }
}
