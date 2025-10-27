package com.nads.inmobiliaria;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Clase base que representa un inmueble genérico.
 * Contiene atributos comunes a todos los tipos de propiedades.
 */
public class Inmueble {
    // Identificador único del inmueble
    protected int idInmobiliario;
    // Área total del inmueble en metros cuadrados
    protected int area;
    // Dirección o ubicación del inmueble
    protected String direccion;
    // Valor de compra calculado según el tipo de inmueble y su área
    protected double valorCompra;

    /*
     * Constructor parametrizado que inicializa los datos básicos del inmueble.
     * @param idInmobiliario - Identificador único del inmueble.
     * @param area - Área en metros cuadrados.
     * @param direccion - Dirección del inmueble.
     */
    public Inmueble(int idInmobiliario, int area, String direccion) {
        // Inicializa el identificador del inmueble
        this.idInmobiliario = idInmobiliario;
        // Inicializa el área en metros cuadrados
        this.area = area;
        // Inicializa la dirección del inmueble
        this.direccion = direccion;
    }

    /*
     * Método para calcular el valor del inmueble.
     * Cada subclase implementará su propio cálculo según el valor por metro cuadrado.
     * @param valorMetroCuadrado - Costo del metro cuadrado para este tipo de inmueble.
     */
    public void calcularValorCompra(double valorMetroCuadrado) {
        // Calcula el valor de compra multiplicando área por valor por metro cuadrado
        valorCompra = area * valorMetroCuadrado;
    }

    /*
     * Método para imprimir la información básica del inmueble.
     */
    public void imprimirInfo() {
        // Imprime el identificador del inmueble
        System.out.println("ID Inmobiliario: " + idInmobiliario);
        // Imprime el área del inmueble
        System.out.println("Área: " + area + " m²");
        // Imprime la dirección del inmueble
        System.out.println("Dirección: " + direccion);
        // Imprime el valor de compra calculado
        System.out.println("Valor de compra: $" + valorCompra);
    }
}