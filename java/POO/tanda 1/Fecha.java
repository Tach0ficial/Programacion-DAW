package POO_tanda1;
/**
 * Crea una clase Fecha. Los objetos de la clase Fecha son fechas de tiempo y se crean de la forma:

Fecha f = Fecha(1, 10, 2020);

donde los parámetros que se le pasan al constructor son el día, el mes y el año respectivamente. Si la fecha creada es incorrecta mostraremos un mensaje de error en la salida estándar de errores (lo ideal sería lanzar una excepción, ya lo haremos cuando se vea en clase).

Crea métodos para:

Saber si la fecha almacenada es correcta.
Sumar y restar días a la fecha. 
Comparar la fecha almacenada con otra, el método devolverá un valor negativo si la fecha almacenada es ANTERIOR a la otra, 0 si son IGUALES y un valor positivo si es POSTERIOR.
Saber si el año de la fecha almacenada es bisiesto.
El método toString() devuelve una cadena con el formato "<día del mes> de <nombre del mes> de <año>".
Las opciones a partir de la segunda, solo se realizarán si la fecha almacenada es correcta, en caso de no serlo, se dará un aviso, por la salida estándar de errores, de que la operación no se puede realizar.

Puedes usar una variable de clase para almacenar el número de días de cada mes del año (que no sea bisiesto).
@author Carlos Hidalgo Risco
 */


public class Fecha {
  //atributos
  public static final int[] DIAS_MES_BISIESTO = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public static final int[] DIAS_MES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  private int dia; 
  private int mes; 
  private int anio; 

  //contructor

  public Fecha(int dia,int mes,int anio) {
    this.dia = dia; 
    this.mes = mes;
    this.anio = anio;
    if (!validar()){
      System.err.println("La fecha es incorrectamente.");
    }
  }

  //toString()
  
  //metodos//////////////////////

  /**
   * Saber si la fecha almacenada es correcta.
   */
  public boolean validar(){
    
    if ( this.mes < 1 || this.mes > 12 )
        return false;
    // Para febrero y bisiesto el limite es 29
    if ( this.mes == 2 && this.anio % 4 == 0 ){
      return this.dia >= 1 && this.dia <= 29;
    }
    if(this.anio % 4 == 0) {
      return this.dia > 0 && this.dia <= DIAS_MES_BISIESTO[this.mes-1];
    }else {
      return this.dia > 0 && this.dia <= DIAS_MES[this.mes-1];
    }
    
  }
  

  /**
   * Sumar y restar días a la fecha.  
   */
  //sumar
  public void sumar(int dias){
    if (this.validar()) {
      for (int i = 0; i < dias; i++) {
        this.dia++;
        if(this.anio % 4 == 0) {
          if(this.dia>DIAS_MES_BISIESTO[this.mes-1]) {
            this.mes++;
            this.dia=1;
            if (this.mes>12) {
              this.mes=1;
              this.anio++;
            }
          }
        }else {
          if(this.dia>DIAS_MES[this.mes-1]) {
            this.mes++;
            this.dia=1;
            if (this.mes>12) {
              this.mes=1;
              this.anio++;
            }
          }
        }
      }
    } else {
      System.err.println("La operaci�n que se puede realizar porque no se creo correctamente.");
    }
  }

  //restar
  public void restar(int dias){
    if (this.validar()) {
      if(this.anio % 4 == 0) {
        for (int i = 0; i < dias; i++) {
          this.dia--;
          if(this.dia<=0) {
            this.mes--;
            this.dia=DIAS_MES_BISIESTO[this.mes-1];
            if (this.mes<=0) {
              this.mes=1;
              this.anio--;
            }
          }
        }
      }else {
        for (int i = 0; i < dias; i++) {
          this.dia--;
          if(this.dia<=0) {
            this.mes--;
            this.dia=DIAS_MES[this.mes-1];
            if (this.mes<=0) {
              this.mes=1;
              this.anio--;
            }
          }
        }
      }
    }else {
      System.err.println("La operaci�n que se puede realizar porque no se creo correctamente.");
    }
   
    
  }
  /**
   * Comparar la fecha almacenada con otra, el método devolverá un valor negativo
   *  si la fecha almacenada es ANTERIOR a la otra
   * , 0 si son IGUALES y un valor positivo si es POSTERIOR.
   * @return 
   * @return 
   */
 public int compararCon(Fecha fecha) {
   if (this.validar() && fecha.validar()) {
     if (this.anio<fecha.anio) {
       return -1;
     }else if(this.anio>fecha.anio) {
       return 1;
     }else {
       if (this.mes<fecha.mes) {
         return -1;
       }else if(this.mes>fecha.mes) {
         return 1;
       }else {
         if (this.dia<fecha.dia) {
           return -1;
         }else if(this.dia>fecha.dia) {
           return 1;
         }else {
           return 0;
         }
       }
     } 
   }else {
     System.err.println("La operaci�n que se puede realizar porque no se creo correctamente.");
     return 400;
   }
 }
  

  /**
   * Saber si el año de la fecha almacenada es bisiesto.
   */
  public void esBisiesto(){
    if( this.anio % 4 == 0) {
      System.out.println("El a�o "+this.anio+" es bisiesto");
    }else {
      System.out.println("El a�o "+this.anio+" no es bisiesto");
    }
  }
  
  /**
   * El método toString() devuelve una cadena con el formato
   *  "<día del mes> de <nombre del mes> de <año>".
   */
  @Override
  public String toString() {
    return  dia+ "/" +  mes+ "/" +  anio ;
  }

}
