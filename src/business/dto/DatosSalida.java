package business.dto;

public class DatosSalida {

    private String banco;
    private DatosCuenta datosCuenta;

    public DatosSalida() {
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public DatosCuenta getDatosCuenta() {
        return datosCuenta;
    }

    public void setDatosCuenta(DatosCuenta datosCuenta) {
        this.datosCuenta = datosCuenta;
    }

    @Override
    public String toString() {
        return "DatosSalida{" +
                "banco='" + banco + '\'' +
                ", datosCuenta=" + datosCuenta +
                '}';
    }
}
