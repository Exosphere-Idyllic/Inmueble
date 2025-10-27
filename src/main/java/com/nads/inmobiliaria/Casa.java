package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Clase abstracta que representa una Casa.
 * Hereda de InmuebleVivienda y agrega el número de pisos.
 */
public abstract class Casa extends InmuebleVivienda {
    // Cantidad de pisos que tiene la casa
    protected int numPisos;

    /*
     * Constructor parametrizado para casas.
     * @param idInmobiliario - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param numHabitaciones - Número de habitaciones.
     * @param numBanos - Número de baños.
     * @param numPisos - Número de pisos de la casa.
     */
    public Casa(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBanos, int numPisos) {
        // Llama al constructor de la clase padre InmuebleVivienda
        super(idInmobiliario, area, direccion, numHabitaciones, numBanos);
        // Inicializa el número de pisos
        this.numPisos = numPisos;
    }

    /*
     * Método para imprimir información de la casa.
     * Incluye información de vivienda más detalles específicos de la casa.
     */
    @Override
    public void imprimirInfo() {
        // Llama al método imprimirInfo de la clase padre InmuebleVivienda
        super.imprimirInfo();
        // Imprime el número de pisos de la casa
        System.out.println("Pisos: " + numPisos);
    }
}