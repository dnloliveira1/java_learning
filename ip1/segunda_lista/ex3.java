import java.util.Scanner;

public class ex3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int QuantTanq = 0;
        // int QunatLatas = 0;
        // A variavel QuantLatas tem de ser do tipo double, ja que vai receber da funcao Math.ceil (que retorna em double)
        double QuantLatas = 0; // Vamos usar o propio QuantLatas no formato double
        double raio = 0, diametro = 0, altura = 0, AreaExt = 0, AreaTot = 0, custo = 45, CustFinal = 0, contem = 5, pinta = 3, UmaLataFaz = 0;
        
        System.out.println("Favor, informar a altura, o diametro e a quantidade de tanques, nessa ordem");        
        altura = input.nextDouble();
        diametro = input.nextDouble();
        QuantTanq = input.nextInt();
        
        raio = diametro / 2;
        AreaExt = (2 * Math.PI * raio) * (raio + altura);
        AreaTot = AreaExt * QuantTanq;
        UmaLataFaz = contem * pinta;

        QuantLatas = Math.ceil(AreaTot/UmaLataFaz);
        CustFinal = QuantLatas * custo;
        
        System.out.println();
        System.out.printf("Quantidade de latas %.0f\nCusto final R$ %.2f\n", QuantLatas, CustFinal);
    }
}
