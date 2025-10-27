package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Representa un local comercial dentro o fuera de un centro comercial.
 */
public class LocalComercial extends Local {
    // Nombre del centro comercial donde está ubicado el local
    private String nombreCentroComercial;

    /*
     * Constructor parametrizado para local comercial.
     * @param id - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param tipoLocalizacion - Tipo de localización (interno o a la calle).
     * @param nombreCentroComercial - Nombre del centro comercial.
     */
    public LocalComercial(int id, int area, String direccion, String tipoLocalizacion, String nombreCentroComercial) {
        // Llama al constructor de la clase padre Local
        super(id, area, direccion, tipoLocalizacion);
        // Inicializa el nombre del centro comercial
        this.nombreCentroComercial = nombreCentroComercial;
        // Calcula el valor de compra usando 400 como valor por metro cuadrado
        calcularValorCompra(400);
    }

    /*
     * Método para imprimir información específica del local comercial.
     */
    @Override
    public void imprimirInfo() {
        // Imprime el encabezado específico para local comercial
        System.out.println("=== Local Comercial ===");
        // Llama al método imprimirInfo de la clase padre Local
        super.imprimirInfo();
        // Imprime el nombre del centro comercial
        System.out.println("Centro Comercial: " + nombreCentroComercial);
    }
}