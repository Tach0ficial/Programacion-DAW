package POO_tanda1;
 /**
  * 
  * Crea una clase Fraccion de forma que podamos hacer las siguientes operaciones:
  * 
  * Contruir un objeto Fraccion pasándole el numerador y el denominador.
  * Obtener la fracción como cadena de caracteres.
  * Obtener y modificar numerador y denominador. No se puede dividir por cero.
  * Obtener resultado de la fracción (número real).
  * Multiplicar la fracción por un número entero (el resultado es otro objeto fracción).
  * Multiplicar, sumar y restar fracciones (el resultado es otro objeto fracción).
  * Simplificar la fracción (cambia el objeto actual).
  * 
  * @author Carlos Hidalgo Risco
  *
  */

interface Cloneable {
  public Fraccion clone();
}

public class Fraccion implements Comparable<Fraccion> , Cloneable{
  
    // atributos
    private int numerador;
    private int denominador;
       
    
    //interfaces
    
    //contructor
    /**
     * @param nuerador
     * @param denominador
     */
    public Fraccion(int nuerador, int denominador) {
      this.numerador = nuerador;
      this.setDenominador(denominador);
    }

    // geters y seters
    public final int getNuerador() {
      return numerador;
    }


    public final void setNuerador(int nuerador) {
      this.numerador = nuerador;
    }


    public final int getDenominador() {
      return denominador;
    }


    public final void setDenominador(int denominador) {
      this.denominador = denominador;
      
      //deberiamos mostrar una exepcion pero aun no la hemos visto
      if (denominador == 0) {
        System.out.println("El estado del obeto es incorrecto al ser el denominador 0.");
      }
    }

    
    
    // metodo toString()
    @Override
    public String toString() {
      return this.numerador + "/" + this.denominador;
    }
    
    
    public double resultado() {
      return (double) this.numerador / this.denominador;
    }
    
    public Fraccion multiplicar(int n) {
      return new Fraccion(this.numerador * n , this.denominador) ; 
    }
    
    //Multiplicar, sumar y restar fracciones
    
    public Fraccion multiplicar(Fraccion fraccion) {
      return new Fraccion(this.numerador * fraccion.numerador , this.denominador * fraccion.denominador) ; 
    }
    
    public Fraccion sumar(Fraccion fraccion) {
      return new Fraccion((this.numerador * fraccion.denominador) + (fraccion.numerador * this.denominador) , this.denominador * fraccion.denominador) ; 
    }
    
    public Fraccion restar(Fraccion fraccion) {
      return this.sumar(fraccion.multiplicar(-1)) ; //reutilizamos el codigo del metodo sumar.v
    }
    
    //simplificar
    private int mcd(){
      int num=Math.abs(this.numerador);
      int den=Math.abs(this.denominador);
      if(den==0){
           return num;
      }
      int resto;
      while(den!=0){
        resto=num%den;
           num=den;
           den=resto;
      }
      return num;
   }
   public Fraccion simplificar(){
      int dividir=mcd();
      this.numerador/=dividir;
      this.denominador/=dividir;
      return this;
   }
   
   //Implementacion de interfaces
   
     //comparable
  @Override
  public int compareTo(Fraccion o) {
    return this.numerador*o.denominador - o.numerador*this.denominador;
  }
  
    //cloneable
  @Override
  public Fraccion clone()   {

    return new Fraccion(this.numerador,this.denominador);

 }


  
}
