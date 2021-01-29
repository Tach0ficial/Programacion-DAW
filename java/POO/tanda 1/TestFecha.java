package POO_tanda1;

public class TestFecha {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(1, 3, 2020);
        fecha1.restar(1);
        System.out.println(fecha1.toString());
        fecha1.sumar(1000);
        System.out.println(fecha1.toString());
        
        
        
        //comparo 2 fechas
        Fecha fecha2 = new Fecha(13, 10, 2020);
        Fecha fecha3 = new Fecha(2, 10, 2020);
        System.out.println(fecha2.compararCon(fecha3));
        
        //compruebo si es bisiesto
        Fecha fecha4 = new Fecha(2, 10, 2096);
        fecha4.esBisiesto();
        
        //creo una nueva fecha mal y intento sumarle dias
        Fecha fecha5 = new Fecha(11, 40, 2030);
        fecha5.sumar(1);
    }
}
