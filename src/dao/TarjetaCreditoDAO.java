package dao;

import domain.TarjetaCredito;

import java.util.List;

public interface TarjetaCreditoDAO {
    TarjetaCredito getTarjetaCreditoById(int id);
    List<TarjetaCredito> getAllTarjetasCredito();
}
