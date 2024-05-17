package S04;

import java.util.Scanner;

public class Eje07 {

    public static void main(String[] args) {
        int HT, SH, HE = 0, pagoHorasExtras;
        HT = leehora();
        SH = leesueldo();
        HE = HorasExtra(SH, HT, HE);
        pagoHorasExtras = calcularPagoHorasExtras(SH, HE);
        imprimir(pagoHorasExtras);
    }

    static int leehora() {
        Scanner teclado = new Scanner(System.in);
        int HT;
        System.out.print("Ingrese las horas trabajadas: ");
        HT = Integer.parseInt(teclado.next());
        return HT;
    }

    static int leesueldo() {
        Scanner teclado = new Scanner(System.in);
        int SH;
        System.out.print("Ingrese el sueldo por hora es: S/.");
        SH = Integer.parseInt(teclado.next());
        return SH;
    }

    static int HorasExtra(int SH, int HT, int HE) {
        if (HT > 40) {
            HE = HT - 40;
        }
        return HE;
    }

    static int calcularPagoHorasExtras(int SH, int HE) {
        int pagoHorasExtras = 0;
        if (HE > 0) {
            if (HE <= 8) {
                pagoHorasExtras = HE * SH * 2;
            } else {
                int horasExtrasNormales = 8;
                int horasExtrasDobles = HE - horasExtrasNormales;
                pagoHorasExtras = (horasExtrasNormales * SH * 2) + (horasExtrasDobles * SH * 3);
            }
        }
        return pagoHorasExtras;
    }

    static void imprimir(int pagoHorasExtras) {
        System.out.println("El total del pago de horas extras es S/. " + pagoHorasExtras);
    }
}
