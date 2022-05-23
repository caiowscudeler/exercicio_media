import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        // inicializar scanner
        double n1, n2, n3, n4;
        //inicializar 5 variaveis "double" para que utilize numeros inteiros e decimais
        System.out.print("Informe sua nota da AC1: ");
          // texto que eu quero que apareca
        n1 = ler.nextDouble();
        // associar a variavel ao Scanner e ao texto
        System.out.print("Informe sua nota da AC2: ");
          // texto que eu quero que apareca
        n2 = ler.nextDouble();
        // associar a variavel ao Scanner e ao texto
        System.out.print("Informe sua nota da AG: ");
          // texto que eu quero que apareca
        n3 = ler.nextDouble();
        // associar a variavel ao Scanner e ao texto
        System.out.print("Informe sua nota da AF: ");
          // texto que eu quero que apareca
        n4 = ler.nextDouble();
        // associar a variavel ao Scanner e ao texto
        
        double n5 = ((n1*0.15) + (n2*0.3) + (n3*0.1) + (n4*0.45));
        // fazer com que "n5" seja igual a soma das medias das outras variaveis
        
  
        
        
        if (n5>5){
            System.out.print("Voce foi aprovado: " + n5);
             // usar if para dar uma condicao para que o texto acima seja inserido no codigo e mostre que o aluno foi aprovado por ter media maior que 5
        }
        else {
            System.out.print("Voce foi reprovado: " + n5 );
            // usar else para mostrar que a condicao nao foi comprida e o aluno foi reprovado por media menor que 5
        }
    }
}
