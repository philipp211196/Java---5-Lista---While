package Exercicio_lista5;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero.");
        int n = sc.nextInt();
        int a = 0, b = 0, c = 0;
        while (a <= n) {
            System.out.println(a + "+" + c + "=" + b);
            a = a + 1;
            c = b;
            b = b + a;

        }
    }}
