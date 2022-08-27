/**
 * @author Luis Patzan
 * Este sera nuestro main donde mandaremos los valores a los atributos del ticket
 */

package Ticket_Request;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner pudin = new  Scanner(System.in);


        /**
         * Atributos del main
         */

        String nit_usuario_creador_del_ticket;
        String issue_description;

        /**
         * Metodo abstract que tenemos que mencionar en todas las clases que hagan uso de la clase abstracta
         */
        Cola_Servicio colaSERVI = new Cola_Servicio() {
            @Override
            public void extraccion(int posicion) {
            }
        }; //Objeto pa tener acceso a esa clase


        /**
         * Objetos que nos daran acceso  alas clases
         */
        Mesa_Ayuda c = new Mesa_Ayuda();
        Bitacora b = new Bitacora(); //Objeto pa tener acceso a esa clase

        int opcINICIAL = 0;
        int opc = 0, cycle =0, cycle2 = 0;
        int auxiliar = 0;

        while(cycle2 == 0){

            System.out.println("Bienvenido!\nComo desea ingresar: 1) Usuario 2)Empleado 3)Salir");
            opcINICIAL = pudin.nextInt();


            switch (opcINICIAL){
                case 1:
                    cycle = 0; //Para entrar de nuevo en el ciclo
                    while(cycle == 0) {
                        System.out.println("\n**************************\n1) Crear un ticket\n2) Mostrar Todos Los Tickets\n3)Mostrar Bitacora\n4) Regresar\n\n");
                        opc = pudin.nextInt();

                        switch (opc) {
                            case 1:
                                /**
                                 * Ingreso de datos
                                 */
                                System.out.print("Usted esta creando un ticket de reporte, ingrese su NIT: ");
                                nit_usuario_creador_del_ticket = pudin.nextLine();
                                pudin.nextLine();
                                System.out.print("Ingrese una breve descripcion del problema encontrado: ");
                                issue_description = pudin.nextLine();
                                /**
                                 * Creamos el objeto Ticket
                                 *
                                 */
                                Tickets a1 = new Tickets(nit_usuario_creador_del_ticket, issue_description);
                                colaSERVI.ticketitos.add(a1); //Asigno Ticket al array de ColaServicio
                                c.colaMesaAyuda.add(a1); //Asignamos a la primer mesa de inmediato
                                b.bitacoraCreacion2(); //Bitacora Creacion
                                b.bitacoraAsignacionSoporte(); //Bitacora Asignacion


                                break;
                            case 2:
                                /**
                                 * Lectura del array
                                 */
                                colaSERVI.dameeeee(); //Mostramos los valores en el Array
                                c.dameMesaApoyo();
                                break;
                            case 3:

                                b.dameBITACORA(); //Mostramos bitacora

                                break;
                            case 4:
                                cycle = 1;
                                break;
                        }
                    } //end 2ndo while
                break; //Break Case 1

                case 3:
                    cycle2 = 1;
                    break;
            } //Fin switch general

        } //Fin while



    }
}
