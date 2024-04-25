package co.edu.uniquindio.parcial2.parcial2.model;

import java.util.List;

public class Empleado extends Persona{
    private PrestamoUq ownedByPrestamoUq;
    private List<Prestamo> listaPrestamosAsociados;
}
