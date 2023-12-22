package dao.impl;

import config.ConexionDB;
import dao.TarjetaDebitoDAO;
import domain.TarjetaDebito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TarjetaDebitoDAOImpl implements TarjetaDebitoDAO {

    @Override
    public TarjetaDebito getTarjetaDebitoById(int id) {
        //Realiza la consulta SQL para obtener una tarjeta de debito por ID
        //Crea un objeto TarjetaDebito y lo devuelve
        try (Connection connection = ConexionDB.getConnection()){ //<-- Configura la conexion a la base de datos H2 (jdbcUrl, user, password)
            String sql = "SELECT numero, titular FROM TarjetasDebito WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                String numero = resultSet.getString("numero");
                String titular = resultSet.getString("titular");
                return new TarjetaDebito(numero, titular);
        }
    } catch(SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<TarjetaDebito> getAllTarjetasDebito() {
        List<TarjetaDebito> tarjetas = new ArrayList<>();

        try (Connection connection = ConexionDB.getConnection()){
            String sql = "SELECT numero, titular FROM TarjetasDebito";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
                String numero = resultSet.getString("numero");
                String titular = resultSet.getString("titular");
                tarjetas.add(new TarjetaDebito(numero, titular));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tarjetas;
    }
}


