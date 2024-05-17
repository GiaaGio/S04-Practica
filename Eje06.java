package S04;

import java.util.Scanner;

public class Eje06 {

    public static void main(String[] args) {
        int kmR, tarifa, montoT, recorrido;
        String auto;
        kmR = leeNumero();
        auto = leeAuto();
        tarifa = TarifaAlquiler(auto);
        recorrido = TarifaRecorrido(auto, kmR);
        montoT = MontoTotal(kmR, tarifa);
        imprimir(montoT, recorrido);
    }

    static int leeNumero() {
        Scanner teclado = new Scanner(System.in);
        int kmR;
        System.out.print("Ingrese kilometros recorridos: ");
        kmR = Integer.parseInt(teclado.next());
        return kmR;
    }

    static String leeAuto() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese tipo de auto (pequeno, mediano, grande): ");
        String auto = teclado.next().toLowerCase();
        return auto;
    }

    static int TarifaAlquiler(String auto) {
        int tarifa;
        switch (auto) {
            case "pequeno":
                tarifa = 15;
                break;
            case "mediano":
                tarifa = 20;
                break;
            case "grande":
                tarifa = 30;
                break;
            default:
                tarifa = 0;
                break;
        }
        return tarifa;
    }

    static int TarifaRecorrido(String auto, int kmR) {
        int recorrido;
        recorrido = (int) (switch (auto) {
            case "pequeno" ->
                0.20 * kmR;
            case "mediano" ->
                0.30 * kmR;
            case "grande" ->
                0.40 * kmR;
            default ->
                0;
        });
        return recorrido;
    }

    static int MontoTotal(int kmR, int tarifaAlquiler) {
        int montoT = tarifaAlquiler;
        if (kmR > 10) {
            montoT += (tarifaAlquiler * kmR * 25) / 1000;
        }
        return montoT;
    }

    static void imprimir(int montoT, int recorrido) {
        System.out.println("El monto total es de S/. " + (montoT + recorrido));
    }
}
