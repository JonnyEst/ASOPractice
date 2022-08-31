package facade.dto;

public class DatosSalidaFacade {

    private String banco;
    private DatosCuentaFacade datosCuenta;

    public DatosSalidaFacade() {
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public DatosCuentaFacade getDatosCuenta() {
        return datosCuenta;
    }

    public void setDatosCuenta(DatosCuentaFacade datosCuenta) {
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
