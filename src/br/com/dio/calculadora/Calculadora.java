package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        scanner scan = new Scanner(System.in);

        int a, b;

        Sytem.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("sobt: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("div: " + dividir);


}
