import java.util.Scanner;

public class ex2

{
    public static void main(String[] args)

    {
        Scanner input = new Scanner (System.in);
        double diametro = 0, altura = 0, area = 0, volume = 0, elevado = 2.0;

        System.out.println("Informe o diametro e a altura, nessa ordem");
        diametro = input.nextDouble();
        altura = input.nextDouble();
        area = ( Math.PI * Math.pow(diametro, elevado) ) / 4;
        volume = (((area * altura) * 1000) * 1000);
        System.out.printf("volume: %.2f ml\n", volume);
    }
}
