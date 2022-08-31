package business.impl;

import business.InterfaceBusiness;
import business.dto.DatosEntrada;
import business.dto.DatosSalida;
import dao.impl.ImplementacionDao;

public class ImplementacionBusiness implements InterfaceBusiness {

    ImplementacionDao implementacionDao = new ImplementacionDao();

    @Override
    public DatosSalida datosSalida(DatosEntrada datosEntrada) {
        DatosSalida datosSalida= implementacionDao.datosOut(datosEntrada);
        return datosSalida;
    }
}
