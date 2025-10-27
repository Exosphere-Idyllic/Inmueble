package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Clase abstracta que hereda de Inmueble y representa una vivienda.
 * Añade atributos comunes a casas y departamentos.
 */
public abstract class InmuebleVivienda extends Inmueble {
    // Número de habitaciones del inmueble
    protected int numHabitaciones;
    // Número de baños
    protected int numBanos;

    /*
     * Constructor parametrizado.
     * @param idInmobiliario - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param numHabitaciones - Número de habitaciones.
     * @param numBanos - Número de baños.
     */
    public InmuebleVivienda(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBanos) {
        // Llama al constructor de la clase padre Inmueble
        super(idInmobiliario, area, direccion);
        // Inicializa el número de habitaciones
        this.numHabitaciones = numHabitaciones;
        // Inicializa el número de baños
        this.numBanos = numBanos;
    }

    /*
     * Método para imprimir información común a las viviendas.
     * Incluye información básica del inmueble más detalles de la vivienda.
     */
    @Override
    public void imprimirInfo() {
        // Llama al método imprimirInfo de la clase padre Inmueble
        super.imprimirInfo();
        // Imprime el número de habitaciones
        System.out.println("Habitaciones: " + numHabitaciones);
        // Imprime el número de baños
        System.out.println("Baños: " + numBanos);
    }
}