package service;

import dao.TarjetaCreditoDAO;
import dao.TarjetaDebitoDAO;
import dao.impl.TarjetaCreditoDAOImpl;
import dao.impl.TarjetaDebitoDAOImpl;
import domain.TarjetaCredito;
import domain.TarjetaDebito;

import java.util.List;

public class TarjetaService {
    private final TarjetaCreditoDAO tarjetaCreditoDAO;
    private final TarjetaDebitoDAO tarjetaDebitoDAO;

    public TarjetaService(){
        tarjetaCreditoDAO = new TarjetaCreditoDAOImpl();
        tarjetaDebitoDAO = new TarjetaDebitoDAOImpl();
    }

    public TarjetaCredito getTarjetaCreditoById(int id) {
        return tarjetaCreditoDAO.getTarjetaCreditoById(id);
    }

    public List<TarjetaCredito> getAllTarjetasCredito() {
        return tarjetaCreditoDAO.getAllTarjetasCredito();
    }

    public TarjetaDebito getTarjetaDebitoById(int id) {
        return tarjetaDebitoDAO.getTarjetaDebitoById(id);
    }

    public List<TarjetaDebito> getAllTarjetasDebito() {
        return tarjetaDebitoDAO.getAllTarjetasDebito();
    }
}
