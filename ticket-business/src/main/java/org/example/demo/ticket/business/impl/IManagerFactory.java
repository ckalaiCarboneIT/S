package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.business.contract.manager.IProjetManager;
import org.example.demo.ticket.business.contract.manager.ITicketManager;

public interface IManagerFactory {

    public IProjetManager getProjectManager();
    public ITicketManager getTicketManager();
    public void setTicketManager(ITicketManager ticketManager);
    public void setProjetManager(IProjetManager projetManager);

}
