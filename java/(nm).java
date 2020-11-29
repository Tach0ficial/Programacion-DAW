/**
* (nm)=n!/m!*(n-m)!
*
* @author Carlos Hidalgo Risco
*/
import java.util.Scanner; 

public class pepe {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int m;
        do{
            System.out.println("(n) tiene que ser mayor que (m)");
            System.out.println("-------------------------------");
            System.out.print("dime n: ");
            n = Integer.parseInt(s.nextLine());

            System.out.print("dime m: ");
            m = Integer.parseInt(s.nextLine());
        }while(n<m);

        long conbinatorio = factorial(n) / (factorial(m)* factorial(n-m));

        System.out.println("El numero combinatorio es: "+conbinatorio);

    }
    /**
     * 
     * @param num
     * @return factorial
     */
    static public long factorial(int num) {
        long f = 1;
        for (int i = num; i > 1; i--) {
            f *= i;
        }
        return f;
    }
}
    