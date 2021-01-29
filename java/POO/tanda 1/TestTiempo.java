package POO_tanda1;


public class TestTiempo {
    public static void main(String[] args) {
        //Sumar y restar otro objeto de la clase Tiempo (el resultado es otro objeto).
        Tiempo tiempo1 = new Tiempo(1,1,1);
        //suma
        Tiempo tiempo2 = new Tiempo(1,12,1);
        System.out.println("La suma de "+ tiempo1.toString() +" y "+tiempo2.toString()+" es: "+tiempo1.suma(tiempo2));

        // //resta
        System.out.println("La resta de "+ tiempo1.toString() +" y "+tiempo2.toString()+" es: "+tiempo1.resta(tiempo2));

        //Sumar y restar segundos, minutos y/o horas (se cambia el objeto actual).

        //suma
        
        System.out.println("La suma de "+tiempo1+" + 60 segundos y 1 hora es : ");
        tiempo1.suma(1,0,60);
        System.out.println(tiempo1.toString());
        
        //resta
        
        System.out.println("La resta de "+tiempo1+" - 60 segundos y 1 minuto es : ");
        tiempo1.resta(0,1,60);
        System.out.println(tiempo1.toString());

        //Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) la cadena sea 10h 35m 5s.
        Tiempo tiempo3 = new Tiempo(10,35,5);
        System.out.print("\n10,35,5 (formateado)--> ");
        System.out.println(tiempo3.toString());

    }
}