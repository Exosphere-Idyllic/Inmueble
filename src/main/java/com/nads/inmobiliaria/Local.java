package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Clase abstracta que representa un local.
 * Puede ser comercial o una oficina.
 */
public abstract class Local extends Inmueble {
    // Indica si el local está interno o da a la calle
    protected String tipoLocalizacion;

    /*
     * Constructor parametrizado para locales.
     * @param id - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param tipoLocalizacion - Tipo de localización (interno o a la calle).
     */
    public Local(int id, int area, String direccion, String tipoLocalizacion) {
        // Llama al constructor de la clase padre Inmueble
        super(id, area, direccion);
        // Inicializa el tipo de localización
        this.tipoLocalizacion = tipoLocalizacion;
    }

    /*
     * Método para imprimir información del local.
     * Incluye información básica más detalles específicos del local.
     */
    @Override
    public void imprimirInfo() {
        // Llama al método imprimirInfo de la clase padre Inmueble
        super.imprimirInfo();
        // Imprime el tipo de localización
        System.out.println("Localización: " + tipoLocalizacion);
    }
}