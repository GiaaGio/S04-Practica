package S04;
import java.util.Scanner;
public class Eje01 {
    public static void main(String[] args) {
        float num;
        num = leernumero();
        valorAbsoluto(num);
    }
    static float leernumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese número: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static void valorAbsoluto(float num){
        if (num<0) {
            num = num*-1;
        }
        System.out.print("El valor absoluto es: " + num);
    }
}
