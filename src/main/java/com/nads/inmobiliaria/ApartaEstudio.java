package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Representa un apartaestudio (un solo cuarto).
 * Es un tipo específico de departamento con habitaciones y baños fijos.
 */
public class ApartaEstudio extends Departamento {

    /*
     * Constructor parametrizado para apartaestudio.
     * @param id - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param valorAdministracion - Valor mensual de administración.
     */
    public ApartaEstudio(int id, int area, String direccion, double valorAdministracion) {
        // Llama al constructor de la clase padre Departamento
        // Un apartaestudio siempre tiene 1 habitación y 1 baño
        super(id, area, direccion, 1, 1, valorAdministracion);
        // Calcula el valor de compra usando 200 como valor por metro cuadrado
        calcularValorCompra(200);
    }

    /*
     * Método para imprimir información específica del apartaestudio.
     */
    @Override
    public void imprimirInfo() {
        // Imprime el encabezado específico para apartaestudio
        System.out.println("=== Apartaestudio ===");
        // Llama al método imprimirInfo de la clase padre Departamento
        super.imprimirInfo();
    }
}