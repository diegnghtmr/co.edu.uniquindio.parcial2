package co.edu.uniquindio.parcial2.parcial2.model;

import java.time.LocalDate;

public class Prestamo {
    private PrestamoUq ownedByPrestamoUq;
    private String numeroPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private String descripcion;
    private Cliente clienteAsociado;
    private Empleado empleadoAsociado;
    private Objeto listaObjetosAsociados;
}
