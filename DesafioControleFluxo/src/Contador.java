import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        int contador = 0 ;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();

        scanner.close();

        try {
            contador = formatarNumeros(n1, n2);   
        } catch (ParamentrosInvalidosException e) {
            System.out.println("Números invalidos, o segundo número precisa ser maior que o primeiro.");
        }

        for(int i = contador; i > 0; i --){
            System.out.printf("Essa mensagem irá aparecer por mais %s vez(es) %n", i-1);
        }
    }

    static int formatarNumeros(int numero1, int numero2)throws ParamentrosInvalidosException{
        if(numero1 > numero2){
            throw new ParamentrosInvalidosException();
        } else {
            return numero2 - numero1;
        }
    }
    


}
