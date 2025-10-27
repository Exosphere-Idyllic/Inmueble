package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Clase abstracta que representa un departamento.
 * Hereda de InmuebleVivienda y añade el concepto de valor de administración.
 */
public abstract class Departamento extends InmuebleVivienda {
    // Valor de administración mensual del departamento
    protected double valorAdministracion;

    /*
     * Constructor parametrizado que inicializa un departamento.
     * @param id - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param habitaciones - Número de habitaciones.
     * @param banos - Número de baños.
     * @param valorAdministracion - Valor mensual de administración.
     */
    public Departamento(int id, int area, String direccion, int habitaciones, int banos, double valorAdministracion) {
        // Llama al constructor de la clase padre InmuebleVivienda
        super(id, area, direccion, habitaciones, banos);
        // Inicializa el atributo específico de Departamento
        this.valorAdministracion = valorAdministracion;
    }

    /*
     * Método para imprimir la información completa del departamento.
     * Incluye información básica del inmueble y detalles específicos.
     */
    @Override
    public void imprimirInfo() {
        // Llama al método imprimirInfo de la clase padre
        super.imprimirInfo();
        // Agrega información específica del departamento
        System.out.println("Valor administración: $" + valorAdministracion);
    }
}