package S04;

import java.util.Scanner;

public class Eje04 {

    public static void main(String[] args) {
        float num1, num2, num3, mayor, menor, intermedio;
        num1 = leeNumero();
        num2 = leeNumero();
        num3 = leeNumero();
        mayor = hallarMayor(num1, num2, num3);
        menor = hallarMenor(num1, num2, num3);
        intermedio = hallarIntermedio(num1, num2, num3);
        imprimir(mayor, menor, intermedio);
    }

    static int leeNumero() {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Ingrese número entero: ");
        num = Integer.parseInt(teclado.next());
        return num;
    }

    static float hallarMayor(float num1, float num2, float num3) {
        float mayor;
        mayor = Float.MIN_VALUE;
        if (mayor < num1) {
            mayor = num1;
        }
        if (mayor < num2) {
            mayor = num2;
        }
        if (mayor < num3) {
            mayor = num3;
        }
        return mayor;

    }

    static float hallarMenor(float num1, float num2, float num3) {
        float menor;
        menor = Float.MAX_VALUE;
        if (menor > num1) {
            menor = num1;
        }
        if (menor > num2) {
            menor = num2;
        }
        if (menor > num3) {
            menor = num3;
        }
        return menor;
    }

    static float hallarIntermedio(float num1, float num2, float num3) {
        float intermedio;
        if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)) {
            intermedio = num1;
        } else if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)) {
            intermedio = num2;
        } else {
            intermedio = num3;
        }
        return intermedio;
    }

    static void imprimir(float mayor, float menor, float intermedio) {
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El número intermedio es: " + intermedio);
    }
}
