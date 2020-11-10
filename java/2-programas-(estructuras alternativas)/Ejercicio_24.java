/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 *  
 *  •Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
 *  de proyecto), los días que ha estado de viaje visitando clientes durante el
 *  mes y su estado civil (1 - Soltero, 2 - Casado).
 *  
 *  •El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 *  si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 *  respectivamente.
 *  
 *  •Por cada día de viaje visitando clientes se pagan 30 euros extra en
 *  concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
 *  un 25% en caso de estar soltero y un 20% en caso de estar casado.
 *
 * @author Carlos Hidalgo Risco
 */
public class Ejercicio_24 { // Clase principal
    public static void main(String[] args) {
        
        System.out.println("1 - Prog. junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        String cargo = System.console().readLine();

        System.out.print("¿Cuantos dias ha estado de viaje visitando clientes? ");
        int days = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int civilEstate = Integer.parseInt(System.console().readLine());

        double sueldoBase = 0;

        switch (cargo) {
            case "1":
                sueldoBase= 950;
                break;
            case "2":
                sueldoBase= 1200;
                break;
            case "3":
                sueldoBase= 1600;
                break;
        
            default:
                System.out.println("Se a equivocado al introducir el cargo.");
                break;
        }

        double sueldoExtra = days * 30;
        double sueldoBruto = sueldoBase + sueldoExtra;
        double sueldoNeto = 0;
        double porcentajeMin =  0;
        String porcentaje = "";
        if (civilEstate == 1) {
            sueldoNeto = sueldoBruto - sueldoBruto * 0.25;
            porcentajeMin = sueldoBruto * 0.25;
            porcentaje = "25%";
        }else if (civilEstate == 1){
            sueldoNeto = sueldoBruto - sueldoBruto * 0.20;
            porcentaje = "20%";
            porcentajeMin = sueldoBruto * 0.20;
            
        }else{
            System.out.println("Se a equivocado al introducir el estado civil.");
        }
    
                System.out.println("\n---------------------------------");
                System.out.printf("| Sueldo base           %7.2f |\n",sueldoBase);
                System.out.printf("| Dietas ( %2d viajes)   %7.2f |\n",days, sueldoExtra);
                System.out.println("|-------------------------------|");
                System.out.printf("| Sueldo bruto          %.2f |\n",sueldoBruto);
                System.out.printf("| Retencion IRPF (%s)  %7.2f |\n",porcentaje, porcentajeMin);
                System.out.println("|-------------------------------|");
                System.out.printf("| Sueldo neto           %7.2f |\n",sueldoNeto);
                System.out.println("---------------------------------");
    }

}

