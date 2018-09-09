import java.util.Scanner;

public class ex6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double raio = 0; // Tem que ser double, ja que, por emxemplo, uma divisao envolvendo pelo menos um double, ela ja ira retornar no formato double
        double XCoordSupEsq = 0, YCoordSupEsq = 0;
        double XCoordInfDir = 0, YCoordInfDir = 0;
        double XCentral = 0, YCentral = 0;
        
        System.out.println("Lembrando que eh um circulo envolvido por um quadrado");
        System.out.println("Informar a coordenada superior esquerda");
        System.out.print("x = ");
        XCoordSupEsq = input.nextDouble();
        System.out.print("y = ");
        YCoordSupEsq = input.nextDouble();
        System.out.println("Informar a coordenada inferior direita");
        System.out.print("x = ");
        XCoordInfDir = input.nextDouble();
        System.out.print("y = ");
        YCoordInfDir = input.nextDouble();
        System.out.printf("Temos que: coordenada superior esquerda (%.1f, %.1f) e coordenada inferior direita (%.1f, %.1f)\n", XCoordSupEsq, YCoordSupEsq, XCoordInfDir, YCoordInfDir);
        
        XCentral = ((XCoordInfDir - XCoordSupEsq)/2) + XCoordSupEsq;
        YCentral = ((YCoordSupEsq - YCoordInfDir)/2) + YCoordInfDir;
        raio = (XCoordInfDir - XCoordSupEsq)/2;
        
        System.out.println();
        System.out.printf("Coordenada central (%.1f, %.1f) e raio = %.0f\n", XCentral, YCentral, raio);
    }
}
