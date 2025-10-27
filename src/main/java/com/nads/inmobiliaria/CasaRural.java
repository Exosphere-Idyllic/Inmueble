package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Representa una casa rural.
 * Incluye atributos de distancia a la capital y altitud sobre el nivel del mar.
 */
public class CasaRural extends Casa {
    // Distancia a la capital en kilómetros
    private int distanciaCapital;
    // Altitud sobre el nivel del mar en metros
    private int altitud;

    /*
     * Constructor parametrizado para casa rural.
     * @param id - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param habitaciones - Número de habitaciones.
     * @param banos - Número de baños.
     * @param pisos - Número de pisos.
     * @param distanciaCapital - Distancia a la capital en km.
     * @param altitud - Altitud sobre el nivel del mar en metros.
     */
    public CasaRural(int id, int area, String direccion, int habitaciones, int banos, int pisos, int distanciaCapital, int altitud) {
        // Llama al constructor de la clase padre Casa
        super(id, area, direccion, habitaciones, banos, pisos);
        // Inicializa la distancia a la capital
        this.distanciaCapital = distanciaCapital;
        // Inicializa la altitud
        this.altitud = altitud;
        // Calcula el valor de compra usando 200 como valor por metro cuadrado
        calcularValorCompra(200);
    }

    /*
     * Método para imprimir información específica de casa rural.
     */
    @Override
    public void imprimirInfo() {
        // Imprime el encabezado específico para casa rural
        System.out.println("=== Casa Rural ===");
        // Llama al método imprimirInfo de la clase padre Casa
        super.imprimirInfo();
        // Imprime la distancia a la capital
        System.out.println("Distancia a la capital: " + distanciaCapital + " km");
        // Imprime la altitud sobre el nivel del mar
        System.out.println("Altitud: " + altitud + " m");
    }
}