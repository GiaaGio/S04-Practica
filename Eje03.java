package S04;

import java.util.Scanner;

public class Eje03 {

    public static void main(String[] args) {
        float num1, num2, num3, mayor;
        num1 = leeNumero();
        num2 = leeNumero();
        num3 = leeNumero();
        mayor = hallarMayor(num1, num2, num3);
        imprimir(mayor);
    }

    static float leeNumero() {
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese número: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }

    static float hallarMayor(float num1, float num2, float num3) {
        float mayor;
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else {
            if (num2 > num1 && num2 > num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }
        }
        return mayor;
    }

    static void imprimir(float mayor) {
        System.out.println("El número mayor es: " + mayor);
    }
}
