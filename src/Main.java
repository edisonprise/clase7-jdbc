import domain.TarjetaCredito;
import domain.TarjetaDebito;
import service.TarjetaService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TarjetaService tarjetaService = new TarjetaService();

        //Ejemplo 1: Obtener una tarjeta de credito por ID
        int idTarjetaCredito = 1;
        TarjetaCredito tarjetaCredito = tarjetaService.getTarjetaCreditoById(idTarjetaCredito);

        if(tarjetaCredito != null) {
            System.out.println("Tarjeta de credito encontrada");
            System.out.println("Numero: " + tarjetaCredito.getNumero());
            System.out.println("Titular: " + tarjetaCredito.getTitular());
        } else {
            System.out.println("Tarjeta de credito no encontrada");
        }

        //Ejemplo 2: Obtener todas las tarjetas de debito
        List<TarjetaDebito> tarjetasDebito = tarjetaService.getAllTarjetasDebito();

        if(!tarjetasDebito.isEmpty()) {
            System.out.println("\nTarjetas de Debito encontradas:");
            for (TarjetaDebito tarjeta : tarjetasDebito) {
                System.out.println("Numero: " + tarjeta.getNumero());
                System.out.println("Titular: " + tarjeta.getTitular());
            }
        } else {
                System.out.println("\nNo se encontraron Tarjetas de Debito");
            }
        }
    }
