package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Representa un departamento familiar.
 * Hereda de Departamento y establece un valor específico por metro cuadrado.
 */
public class DepartamentoFamiliar extends Departamento {

    /*
     * Constructor parametrizado para departamento familiar.
     * @param id - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     * @param habitaciones - Número de habitaciones.
     * @param banos - Número de baños.
     * @param valorAdministracion - Valor mensual de administración.
     */
    public DepartamentoFamiliar(int id, int area, String direccion, int habitaciones, int banos, double valorAdministracion) {
        // Llama al constructor de la clase padre Departamento
        super(id, area, direccion, habitaciones, banos, valorAdministracion);
        // Calcula el valor de compra usando 300 como valor por metro cuadrado
        calcularValorCompra(300);
    }

    /*
     * Método para imprimir información específica del departamento familiar.
     */
    @Override
    public void imprimirInfo() {
        // Imprime el encabezado específico para departamento familiar
        System.out.println("=== Departamento Familiar ===");
        // Llama al método imprimirInfo de la clase padre
        super.imprimirInfo();
    }
}