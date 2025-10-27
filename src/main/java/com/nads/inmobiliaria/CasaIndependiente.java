package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Representa una casa urbana independiente.
 */
public class CasaIndependiente extends CasaUrbana {

    /*
     * Constructor parametrizado para casa independiente.
     * @param id - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param habitaciones - Número de habitaciones.
     * @param banos - Número de baños.
     * @param pisos - Número de pisos.
     */
    public CasaIndependiente(int id, int area, String direccion, int habitaciones, int banos, int pisos) {
        // Llama al constructor de la clase padre CasaUrbana
        super(id, area, direccion, habitaciones, banos, pisos);
        // Calcula el valor de compra usando 400 como valor por metro cuadrado
        calcularValorCompra(400);
    }

    /*
     * Método para imprimir información específica de casa independiente.
     */
    @Override
    public void imprimirInfo() {
        // Imprime el encabezado específico para casa independiente
        System.out.println("=== Casa Independiente ===");
        // Llama al método imprimirInfo de la clase padre CasaUrbana
        super.imprimirInfo();
    }
}