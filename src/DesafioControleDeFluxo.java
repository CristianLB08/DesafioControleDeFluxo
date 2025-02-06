
import java.util.Scanner;

public class DesafioControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();
        try {
            contar (parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }finally{
            scanner.close();
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws Exception {
        if (parametroDois <= parametroUm)
            throw new Exception("O segundo parametro deve ser maior que o primeiro!");
        int contagem = parametroDois - parametroUm;
        for (int contador = 1; contador <= contagem; contador++ ){
            System.out.println("Imprimindo o número "+contador);
        }
    }
}
