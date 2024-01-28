package org.example.demo.ticket.webapp.rest.resource.ticket;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/tickets")
@Produces(MediaType.APPLICATION_JSON)
public class TicketResource extends AbstractResource {

    @GET
    @Path("{numero}")
    public Ticket get(@PathParam("numero") Long pNumero) throws NotFoundException {
        return getManagerFactory().getTicketManager().getTicket(pNumero);
    }

    @GET
    @Path("search")
    public List<Ticket> search(@QueryParam("projetId") Integer pProjetId) {
        return getManagerFactory().getTicketManager().getListTicket(new RechercheTicket().setProjetId(pProjetId));
    }
}
