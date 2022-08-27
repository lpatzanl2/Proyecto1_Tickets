package Ticket_Request;
import java.util.LinkedList;
import java.util.Queue;

public class Mesa_Ayuda extends Cola_Servicio {


    /**
     *
     * @param posicion
     */
    @Override
    public void extraccion(int posicion) {

    }

    /**
     * Cola
     */
    Queue<Tickets> colaMesaAyuda = new LinkedList<>();


    /**
     * Imprimimos cola
     */
    public void dameMesaApoyo(){
        for(Tickets e: colaMesaAyuda){
            System.out.print(e);
        };
    }

}


