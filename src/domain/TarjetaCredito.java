package domain;

public class TarjetaCredito {
    private String numero;
    private String titular;

    public TarjetaCredito() {
    }

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                '}';
    }
}
