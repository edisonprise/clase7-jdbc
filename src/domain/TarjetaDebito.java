package domain;

public class TarjetaDebito {
    private String numero;
    private String titular;

    public TarjetaDebito() {
    }

    public TarjetaDebito(String numero, String titular) {
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
        return "TarjetaDebito{" +
                "numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                '}';
    }
}
