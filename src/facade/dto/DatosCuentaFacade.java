package facade.dto;

import java.util.Date;

public class DatosCuentaFacade {

    private String usuario;
    private Integer numeroCuenta;
    private Date fechaCracion;

    public DatosCuentaFacade() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFechaCracion() {
        return fechaCracion;
    }

    public void setFechaCracion(Date fechaCracion) {
        this.fechaCracion = fechaCracion;
    }

    @Override
    public String toString() {
        return "DatosCuenta{" +
                "usuario='" + usuario + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", fechaCracion=" + fechaCracion +
                '}';
    }
}
