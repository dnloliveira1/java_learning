import java.util.Scanner;

public class ex5
{
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        int largura = 0, altura = 0;
        double XCoordSupEsq = 0, YCoordSupEsq = 0;
        double x1 = 0, y1 = 0; // Vertice superior direito
        double x2 = 0, y2 = 0; // Vertice inferior esquerdo
        double x3 = 0, y3 = 0; // Vertice infeiror direito
                
        System.out.println("Informar a coordenada superior esquerda");
        System.out.print("x = ");
        XCoordSupEsq = input.nextDouble();
        System.out.print("y = ");
        YCoordSupEsq = input.nextDouble();
        System.out.print("Informar a largura ");
        largura = input.nextInt();
        System.out.print("Informar a altura ");
        altura = input.nextInt();
        System.out.printf("Temos que: coordenada superior esquerda (%.1f, %.1f), largura = %d, altura = %d\n", XCoordSupEsq, YCoordSupEsq, largura, altura);
                
        x1 = XCoordSupEsq + largura;
        y1 = YCoordSupEsq;
        x2 = XCoordSupEsq;
        y2 = YCoordSupEsq - altura;
        x3 = XCoordSupEsq + largura;
        y3 = YCoordSupEsq - altura;
        
        System.out.println();
        System.out.printf("Coordenada dos vértices superior direito (%.1f, %.1f), e inferior esquerdo (%.1f, %.1f) e direito (%.1f, %.1f)\n", x1, y1, x2, y2, x3, y3);
    }
}
