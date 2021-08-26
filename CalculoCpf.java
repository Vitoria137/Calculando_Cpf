import java.util.Scanner;
public class CalculoCpf{
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int vcpf [] = new int[11];
        
        //Pegando o cpf
        
        for(int contador = 0; contador <11 ;contador++){
            System.out.println("Digite o "+(contador+1)+"º dígito do seu Cpf");
            vcpf[contador] = read.nextInt();
        }
        
        //Primeira conta
        
        int multiplicadorUm = 10;
        int somaUm = 0;
        for(int c1 = 0; multiplicadorUm >= 2; multiplicadorUm--){
            somaUm = somaUm + (vcpf[c1] * multiplicadorUm);
            c1++;
        }
        
        
        //Primeiro dígito
        
        int restoUm = somaUm % 11;
        int digitoUm = 11 - restoUm;
        if(digitoUm >= 10){
            digitoUm = 0;
        }
        
        //Segunda conta
        
        int multiplicadorDois = 11;
        int somaDois = 0;
        for(int c2 = 0; multiplicadorDois >= 2; multiplicadorDois--){
            somaDois = somaDois + (vcpf[c2] * multiplicadorDois);
            c2++;
        }
        
        //Segundo dígito
        
        int restoDois = somaDois % 11;
        int digitoDois = 11 - restoDois;
        if(digitoDois >= 10){
            digitoDois = 0;
        }
        
        //Fim de todas as contas
        
        if(digitoUm == vcpf[9] & digitoDois == vcpf[10]){
            System.out.println("Cpf válido");
        } else {
            System.out.println("Cpf inválido");
        }
        
        
        }
    }
    

