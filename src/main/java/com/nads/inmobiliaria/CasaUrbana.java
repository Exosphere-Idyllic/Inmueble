package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Clase abstracta para casas urbanas.
 * Sirve como base para diferentes tipos de casas urbanas.
 */
public abstract class CasaUrbana extends Casa {
    /*
     * Constructor parametrizado para casas urbanas.
     * @param id - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param habitaciones - Número de habitaciones.
     * @param banos - Número de baños.
     * @param pisos - Número de pisos.
     */
    public CasaUrbana(int id, int area, String direccion, int habitaciones, int banos, int pisos) {
        // Llama al constructor de la clase padre Casa
        super(id, area, direccion, habitaciones, banos, pisos);
    }
}