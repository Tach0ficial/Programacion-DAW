package POO_tanda1;
/**
 * 1. Crea la clase Tiempo. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:

 * t = Tiempo(1, 20, 30)
 * 
 * donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. 
 * 
 * Crea métodos para:
 * 
 * Sumar y restar otro objeto de la clase Tiempo (el resultado es otro objeto).
 * Sumar y restar segundos, minutos y/o horas (se cambia el objeto actual).
 * Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) la cadena sea 10h 35m 5s.
 * Realiza un programa de prueba para comprobar que la clase funciona bien.
 */
public class Tiempo {

    // atributos
    private int segundos;
    private int minutos;
    private int horas;

    
    // constructor (se utiliza para inicializar los atributos)
    Tiempo(int h, int m, int s) {
        //pasa todo a segundos para comprobar que el formato es correcto.

        s += h * 3600;
        s += m * 60;

        this.horas = s / 3600;
        this.segundos = s % 3600;
        this.minutos = segundos / 60;
        this.segundos =  this.segundos % 60;
    }

    // getter de los segundos.
    public int getSegundos() {
        return this.segundos;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getHoras() {
        return this.horas;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    // métodos ///////////////////////////////

    public int getAllSegundos() {
        int seg = this.segundos;
        seg += this.horas * 3600;
        seg += this.minutos * 60;
        return seg;
    }

    public void ordenar(){
        int s = this.getAllSegundos();
        this.horas = s / 3600;
        this.segundos = s % 3600;
        this.minutos = segundos / 60;
        this.segundos =  this.segundos % 60;
    }

   

    //metodos que pide el ejercicio

    /**
     * Sumar y restar otro objeto de la clase Tiempo (el resultado es otro objeto).
     */
    public Tiempo suma(Tiempo objeto) {
        int suma = objeto.getAllSegundos() + this.getAllSegundos();

        Tiempo result = new Tiempo(0,0,suma);
        return result;
    }

    public Tiempo resta(Tiempo objeto) {
        int resta = objeto.getAllSegundos() - this.getAllSegundos();

        Tiempo result = new Tiempo(0,0,resta);
        return result;
    }

    /**
     * Sumar y restar segundos, minutos y/o horas (se cambia el objeto actual).
     */

    //suma
    public void suma(int h, int m, int s){
        this.segundos += s;
        this.minutos += m;
        this.horas += h;
        ordenar();
    }

    //resta
    public void resta(int h, int m, int s){
        this.segundos -= s;
        this.minutos -= m;
        this.horas -= h;
        ordenar();
    } 

    /**
     * Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es
     * (10 35 5) la cadena sea 10h 35m 5s.
     */
    @Override
    public String toString() {
        return  horas + "h " + minutos + "m " + segundos + "s";
    }

    

    

    
}
