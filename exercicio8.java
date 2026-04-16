package Exercicio_lista5;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int b =0;
        int c; double d = 0;
        System.out.println("Digite seu nome.");
        a= sc.nextLine();
        System.out.println("Olá "+a+" Digite as suas 5 notas.");
        while(b<5){
            b = b+1;
            c = sc.nextInt();
            d = c+d;
        }d=d/b;
        System.out.println("Senhor "+a+" a média de suas notas são: "+d);
        sc.close();
    }
}
