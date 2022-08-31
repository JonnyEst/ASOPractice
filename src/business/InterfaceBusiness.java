package business;

import business.dto.DatosEntrada;
import business.dto.DatosSalida;

public interface InterfaceBusiness {
    DatosSalida datosSalida(DatosEntrada datosEntrada);
}
