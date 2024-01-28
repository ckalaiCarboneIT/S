package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.business.contract.manager.IProjetManager;
import org.example.demo.ticket.business.contract.manager.ITicketManager;

public class ManagerFactory {

    private IProjetManager projetManager;
    private ITicketManager ticketManager;

    public IProjetManager getProjectManager() {
        return this.projetManager;
    }

    public ITicketManager getTicketManager() {
        return this.ticketManager;
    }

    public void setTicketManager(ITicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    public void setProjetManager(IProjetManager projetManager) {
        this.projetManager = projetManager;
    }
}
