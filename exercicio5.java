package Exercicio_lista5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para falarmos todos os multiplos de 5 ate este numero.");
        int a = sc.nextInt();
        int b = 0;
        while(b<a){
            b = b+5;
            System.out.println(b);
            sc.close();
        }
    }
}
