package S04;

import java.util.Scanner;

public class Eje05 {

    public static void main(String[] args) {
        float soles, dolar, euros, marco, yen;
        soles = leeNumero();
        dolar = dolares(soles);
        euros = euros(soles);
        marco = marco(soles);
        yen = yen(soles);
        imprimir(dolar, euros, marco, yen);
    }

    static float leeNumero() {
        Scanner teclado = new Scanner(System.in);
        float soles;
        System.out.print("Ingrese cantidad de soles a convertir: ");
        soles = Float.parseFloat(teclado.next());
        return soles;
    }

    static float dolares(float soles) {
        float dolar;
        dolar = soles / 3.3f;
        return dolar;
    }

    static float euros(float soles) {
        float euros;
        euros = soles / 3.57f;
        return euros;
    }

    static float marco(float soles) {
        float marco;
        marco = soles / 1.83f;
        return marco;
    }

    static float yen(float soles) {
        float marco;
        marco = soles / 0.03f;
        return marco;
    }

    static void imprimir(float dolar, float euros, float marco, float yen) {
        System.out.println("Valor de PEN en Dolare: " + dolar);
        System.out.println("Valor de PEN en Euros: " + euros);
        System.out.println("Valor de PEN en Marcos: " + marco);
        System.out.println("Valor de PEN en Yenes: " + yen);
    }
}
