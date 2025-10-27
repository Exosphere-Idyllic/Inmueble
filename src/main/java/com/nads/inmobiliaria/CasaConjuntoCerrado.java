package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Representa una casa ubicada en un conjunto cerrado.
 * Incluye valor de administración y si tiene zonas comunes.
 */
public class CasaConjuntoCerrado extends CasaUrbana {
    // Valor de administración mensual del conjunto cerrado
    private double valorAdministracion;
    // Indica si el conjunto tiene áreas comunes
    private boolean tieneAreasComunes;

    /*
     * Constructor parametrizado para casa en conjunto cerrado.
     * @param id - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param habitaciones - Número de habitaciones.
     * @param banos - Número de baños.
     * @param pisos - Número de pisos.
     * @param valorAdministracion - Valor mensual de administración.
     * @param tieneAreasComunes - Indica si tiene áreas comunes.
     */
    public CasaConjuntoCerrado(int id, int area, String direccion, int habitaciones, int banos, int pisos, double valorAdministracion, boolean tieneAreasComunes) {
        // Llama al constructor de la clase padre CasaUrbana
        super(id, area, direccion, habitaciones, banos, pisos);
        // Inicializa el valor de administración
        this.valorAdministracion = valorAdministracion;
        // Inicializa el indicador de áreas comunes
        this.tieneAreasComunes = tieneAreasComunes;
        // Calcula el valor de compra usando 350 como valor por metro cuadrado
        calcularValorCompra(350);
    }

    /*
     * Método para imprimir información específica de casa en conjunto cerrado.
     */
    @Override
    public void imprimirInfo() {
        // Imprime el encabezado específico para casa en conjunto cerrado
        System.out.println("=== Casa Conjunto Cerrado ===");
        // Llama al método imprimirInfo de la clase padre CasaUrbana
        super.imprimirInfo();
        // Imprime el valor de administración
        System.out.println("Valor administración: $" + valorAdministracion);
        // Imprime si tiene áreas comunes (convertido a "Sí" o "No")
        System.out.println("Áreas comunes: " + (tieneAreasComunes ? "Sí" : "No"));
    }
}