package S04;
import java.util.Scanner;
public class Eje02 {
    public static void main(String[] args) {
        float num1, num2, num3, mayor;
        num1= leeNumero();
        num2=leeNumero();
        num3=leeNumero();
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
    static float hallarMayor(float num1, float num2, float num3){
        float mayor;
        mayor = Float.MIN_VALUE;
        if (mayor<num1) {
            mayor = num1;
        }
        if (mayor<num2) {
            mayor = num2;
        }
        if (mayor<num3) {
            mayor = num3;
        }
        return mayor;
    }
    static void imprimir(float mayor){
        System.out.println("El número mayor es: " + mayor);
    }
}