package dao.impl;

import config.ConexionDB;
import dao.TarjetaCreditoDAO;
import domain.TarjetaCredito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TarjetaCreditoDAOImpl implements TarjetaCreditoDAO {
    public TarjetaCredito getTarjetaCreditoById(int id) {
        //Realiza la consulta SQL para obtener una tarjeta de credito por ID
        //Crea un objeto Tarjetacredito y lo devuelve
        try (Connection connection = ConexionDB.getConnection()) { // <-- Configura la conexion a la base de datos H2 (jdbcUrl, user, password)
            String sql = "SELECT numero, titular FROM TarjetasCredito WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String numero = resultSet.getString("numero");
                String titular = resultSet.getString("titular");
                return new TarjetaCredito(numero, titular);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<TarjetaCredito> getAllTarjetasCredito() {
        //Realiza la consulta SQL para obtenr todas las tarjetas de credito
        //Crea una lista de objetos TarjetaCredito y la devuelve
        List<TarjetaCredito> tarjetas = new ArrayList<>();

        try (Connection connection = ConexionDB.getConnection()){
            String sql = "SELECT numero, titular FROM TarjetasCredito";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
                String numero = resultSet.getString("numero");
                String titular = resultSet.getNString("titular");
                tarjetas.add(new TarjetaCredito(numero, titular));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tarjetas;
    }
}
