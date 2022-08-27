package Ticket_Request;

/**
 * Clase Tickets
 */

public class Tickets extends Cola_Servicio{
    /**
     * Atributos
     */
    private String nit_usuario_creador_del_ticket;
    private String issue_description;
    private String state = "Created";
    private int correlativo;

    /**
     * Constructor
     * @param nit_usuario_creador_del_ticket
     * @param issue_description
     */
    public Tickets(String nit_usuario_creador_del_ticket, String issue_description) {
        this.nit_usuario_creador_del_ticket = nit_usuario_creador_del_ticket;
        this.issue_description = issue_description;
        this.state = "Creado";
        this.correlativo = next_correlativo;
        next_correlativo++;

    }

    /**
     * Variable Static para que no pierda valor o se reinicie
     */
    private static int next_correlativo = 000001;

    /**
     * Imprimimos los datos de ticket
     * @return
     */
    String show_me_all_data(){
        return "\nNumero De Ticket: " + correlativo + "\nNit del usuario que esta creando el ticket: " + nit_usuario_creador_del_ticket
                + "\nDescripcion del problema: " + issue_description + "\nEstado del ticket: " + state + "\n\n";
    }

    @Override
    public void extraccion(int posicion) {

    }

}
