package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Representa una oficina.
 * Puede ser privada o del gobierno.
 */
public class Oficina extends Local {
    // Indica si la oficina es del gobierno
    private boolean esGobierno;

    /*
     * Constructor parametrizado para oficina.
     * @param id - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param tipoLocalizacion - Tipo de localización (interno o a la calle).
     * @param esGobierno - Indica si es oficina gubernamental.
     */
    public Oficina(int id, int area, String direccion, String tipoLocalizacion, boolean esGobierno) {
        // Llama al constructor de la clase padre Local
        super(id, area, direccion, tipoLocalizacion);
        // Inicializa el indicador de oficina gubernamental
        this.esGobierno = esGobierno;
        // Calcula el valor de compra usando 450 como valor por metro cuadrado
        calcularValorCompra(450);
    }

    /*
     * Método para imprimir información específica de la oficina.
     */
    @Override
    public void imprimirInfo() {
        // Imprime el encabezado específico para oficina
        System.out.println("=== Oficina ===");
        // Llama al método imprimirInfo de la clase padre Local
        super.imprimirInfo();
        // Imprime si es oficina gubernamental (convertido a "Sí" o "No")
        System.out.println("Oficina gubernamental: " + (esGobierno ? "Sí" : "No"));
    }
}