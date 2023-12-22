package dao;

import domain.TarjetaDebito;

import java.util.List;

public interface TarjetaDebitoDAO {
    TarjetaDebito getTarjetaDebitoById(int id);
    List<TarjetaDebito> getAllTarjetasDebito();

}
