public class Pepe {
    
    public static void main(String[] args) {
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        String tarjeta = System.console().readLine();
        
        boolean tieneTarjeta = true;
        int precio;

       
        if ((tarjeta == "s") ||(tarjeta ==  "S")){
            tieneTarjeta = true;
            System.out.print("el pepe");
        }else if ((tarjeta == "n") || (tarjeta ==  "N")){
            tieneTarjeta = false;
            System.out.print("el pepe");
        }else{
            System.out.print("Se a equivocado al escribir si tiene tarjeta o no.");
            
        }

}
}
