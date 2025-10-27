package com.nads.inmobiliaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Author: Pablo Aguilar
 * Fecha: 26/10/2025
 * Descripción:
 * Clase principal que contiene el menú para gestionar los diferentes tipos de inmuebles.
 * Permite crear, listar y gestionar propiedades inmobiliarias.
 */
public class Main {
    // Lista para almacenar todos los inmuebles creados
    private static List<Inmueble> inmuebles = new ArrayList<>();
    // Scanner para leer la entrada del usuario
    private static Scanner scanner = new Scanner(System.in);

    /*
     * Método principal que ejecuta el programa.
     * @param args - Argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        // Variable para controlar la salida del programa
        boolean salir = false;

        // Bucle principal del menú
        while (!salir) {
            // Muestra el menú principal
            mostrarMenu();
            // Lee la opción seleccionada por el usuario
            int opcion = leerEntero("Seleccione una opción: ");

            // Procesa la opción seleccionada
            switch (opcion) {
                case 1:
                    // Opción para crear un nuevo inmueble
                    crearInmueble();
                    break;
                case 2:
                    // Opción para listar todos los inmuebles
                    listarInmuebles();
                    break;
                case 3:
                    // Opción para buscar inmueble por ID
                    buscarInmueblePorId();
                    break;
                case 4:
                    // Opción para salir del programa
                    salir = true;
                    System.out.println("¡Gracias por usar el sistema inmobiliario!");
                    break;
                default:
                    // Opción inválida
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        // Cierra el scanner para liberar recursos
        scanner.close();
    }

    /*
     * Método para mostrar el menú principal del sistema.
     */
    private static void mostrarMenu() {
        System.out.println("\n=== SISTEMA INMOBILIARIO ===");
        System.out.println("1. Crear nuevo inmueble");
        System.out.println("2. Listar todos los inmuebles");
        System.out.println("3. Buscar inmueble por ID");
        System.out.println("4. Salir");
        System.out.println("============================");
    }

    /*
     * Método para crear un nuevo inmueble según el tipo seleccionado.
     */
    private static void crearInmueble() {
        System.out.println("\n=== CREAR NUEVO INMUEBLE ===");
        System.out.println("Seleccione el tipo de inmueble:");
        System.out.println("1. Casa Independiente");
        System.out.println("2. Casa Conjunto Cerrado");
        System.out.println("3. Casa Rural");
        System.out.println("4. Departamento Familiar");
        System.out.println("5. Apartaestudio");
        System.out.println("6. Local Comercial");
        System.out.println("7. Oficina");

        // Lee el tipo de inmueble seleccionado
        int tipo = leerEntero("Tipo de inmueble: ");

        // Procesa la creación según el tipo seleccionado
        switch (tipo) {
            case 1:
                crearCasaIndependiente();
                break;
            case 2:
                crearCasaConjuntoCerrado();
                break;
            case 3:
                crearCasaRural();
                break;
            case 4:
                crearDepartamentoFamiliar();
                break;
            case 5:
                crearApartaEstudio();
                break;
            case 6:
                crearLocalComercial();
                break;
            case 7:
                crearOficina();
                break;
            default:
                System.out.println("Tipo de inmueble no válido.");
        }
    }

    /*
     * Método para crear una Casa Independiente.
     */
    private static void crearCasaIndependiente() {
        System.out.println("\n--- Creando Casa Independiente ---");
        // Lee los datos comunes de la casa
        int id = leerEntero("ID Inmobiliario: ");
        int area = leerEntero("Área (m²): ");
        scanner.nextLine(); // Limpiar buffer
        String direccion = leerString("Dirección: ");
        int habitaciones = leerEntero("Número de habitaciones: ");
        int banos = leerEntero("Número de baños: ");
        int pisos = leerEntero("Número de pisos: ");

        // Crea la casa independiente y la agrega a la lista
        CasaIndependiente casa = new CasaIndependiente(id, area, direccion, habitaciones, banos, pisos);
        inmuebles.add(casa);
        System.out.println("✓ Casa Independiente creada exitosamente!");
    }

    /*
     * Método para crear una Casa en Conjunto Cerrado.
     */
    private static void crearCasaConjuntoCerrado() {
        System.out.println("\n--- Creando Casa en Conjunto Cerrado ---");
        // Lee los datos comunes de la casa
        int id = leerEntero("ID Inmobiliario: ");
        int area = leerEntero("Área (m²): ");
        scanner.nextLine(); // Limpiar buffer
        String direccion = leerString("Dirección: ");
        int habitaciones = leerEntero("Número de habitaciones: ");
        int banos = leerEntero("Número de baños: ");
        int pisos = leerEntero("Número de pisos: ");
        double valorAdministracion = leerDouble("Valor de administración: ");
        boolean tieneAreasComunes = leerBoolean("¿Tiene áreas comunes? (s/n): ");

        // Crea la casa en conjunto cerrado y la agrega a la lista
        CasaConjuntoCerrado casa = new CasaConjuntoCerrado(id, area, direccion, habitaciones, banos, pisos, valorAdministracion, tieneAreasComunes);
        inmuebles.add(casa);
        System.out.println("✓ Casa en Conjunto Cerrado creada exitosamente!");
    }

    /*
     * Método para crear una Casa Rural.
     */
    private static void crearCasaRural() {
        System.out.println("\n--- Creando Casa Rural ---");
        // Lee los datos comunes de la casa
        int id = leerEntero("ID Inmobiliario: ");
        int area = leerEntero("Área (m²): ");
        scanner.nextLine(); // Limpiar buffer
        String direccion = leerString("Dirección: ");
        int habitaciones = leerEntero("Número de habitaciones: ");
        int banos = leerEntero("Número de baños: ");
        int pisos = leerEntero("Número de pisos: ");
        int distanciaCapital = leerEntero("Distancia a la capital (km): ");
        int altitud = leerEntero("Altitud (metros): ");

        // Crea la casa rural y la agrega a la lista
        CasaRural casa = new CasaRural(id, area, direccion, habitaciones, banos, pisos, distanciaCapital, altitud);
        inmuebles.add(casa);
        System.out.println("✓ Casa Rural creada exitosamente!");
    }

    /*
     * Método para crear un Departamento Familiar.
     */
    private static void crearDepartamentoFamiliar() {
        System.out.println("\n--- Creando Departamento Familiar ---");
        // Lee los datos del departamento
        int id = leerEntero("ID Inmobiliario: ");
        int area = leerEntero("Área (m²): ");
        scanner.nextLine(); // Limpiar buffer
        String direccion = leerString("Dirección: ");
        int habitaciones = leerEntero("Número de habitaciones: ");
        int banos = leerEntero("Número de baños: ");
        double valorAdministracion = leerDouble("Valor de administración: ");

        // Crea el departamento familiar y lo agrega a la lista
        DepartamentoFamiliar depto = new DepartamentoFamiliar(id, area, direccion, habitaciones, banos, valorAdministracion);
        inmuebles.add(depto);
        System.out.println("✓ Departamento Familiar creado exitosamente!");
    }

    /*
     * Método para crear un Apartaestudio.
     */
    private static void crearApartaEstudio() {
        System.out.println("\n--- Creando Apartaestudio ---");
        // Lee los datos del apartaestudio
        int id = leerEntero("ID Inmobiliario: ");
        int area = leerEntero("Área (m²): ");
        scanner.nextLine(); // Limpiar buffer
        String direccion = leerString("Dirección: ");
        double valorAdministracion = leerDouble("Valor de administración: ");

        // Crea el apartaestudio y lo agrega a la lista
        ApartaEstudio aparta = new ApartaEstudio(id, area, direccion, valorAdministracion);
        inmuebles.add(aparta);
        System.out.println("✓ Apartaestudio creado exitosamente!");
    }

    /*
     * Método para crear un Local Comercial.
     */
    private static void crearLocalComercial() {
        System.out.println("\n--- Creando Local Comercial ---");
        // Lee los datos del local comercial
        int id = leerEntero("ID Inmobiliario: ");
        int area = leerEntero("Área (m²): ");
        scanner.nextLine(); // Limpiar buffer
        String direccion = leerString("Dirección: ");
        String tipoLocalizacion = leerString("Tipo de localización (interno/calle): ");
        String nombreCentroComercial = leerString("Nombre del centro comercial: ");

        // Crea el local comercial y lo agrega a la lista
        LocalComercial local = new LocalComercial(id, area, direccion, tipoLocalizacion, nombreCentroComercial);
        inmuebles.add(local);
        System.out.println("✓ Local Comercial creado exitosamente!");
    }

    /*
     * Método para crear una Oficina.
     */
    private static void crearOficina() {
        System.out.println("\n--- Creando Oficina ---");
        // Lee los datos de la oficina
        int id = leerEntero("ID Inmobiliario: ");
        int area = leerEntero("Área (m²): ");
        scanner.nextLine(); // Limpiar buffer
        String direccion = leerString("Dirección: ");
        String tipoLocalizacion = leerString("Tipo de localización (interno/calle): ");
        boolean esGobierno = leerBoolean("¿Es oficina gubernamental? (s/n): ");

        // Crea la oficina y la agrega a la lista
        Oficina oficina = new Oficina(id, area, direccion, tipoLocalizacion, esGobierno);
        inmuebles.add(oficina);
        System.out.println("✓ Oficina creada exitosamente!");
    }

    /*
     * Método para listar todos los inmuebles registrados.
     */
    private static void listarInmuebles() {
        System.out.println("\n=== LISTA DE INMUEBLES ===");

        // Verifica si hay inmuebles registrados
        if (inmuebles.isEmpty()) {
            System.out.println("No hay inmuebles registrados.");
            return;
        }

        // Recorre y muestra cada inmueble
        for (int i = 0; i < inmuebles.size(); i++) {
            System.out.println("\n--- Inmueble " + (i + 1) + " ---");
            inmuebles.get(i).imprimirInfo();
        }

        // Muestra el total de inmuebles
        System.out.println("\nTotal de inmuebles: " + inmuebles.size());
    }

    /*
     * Método para buscar un inmueble por su ID.
     */
    private static void buscarInmueblePorId() {
        System.out.println("\n=== BUSCAR INMUEBLE POR ID ===");
        int idBuscado = leerEntero("Ingrese el ID a buscar: ");

        // Busca el inmueble en la lista
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.idInmobiliario == idBuscado) {
                System.out.println("\n✓ Inmueble encontrado:");
                inmueble.imprimirInfo();
                return;
            }
        }

        // Si no encuentra el inmueble
        System.out.println("✗ No se encontró ningún inmueble con ID: " + idBuscado);
    }

    /*
     * Método auxiliar para leer un entero desde la consola.
     * @param mensaje - Mensaje a mostrar al usuario
     * @return El número entero leído
     */
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /*
     * Método auxiliar para leer un double desde la consola.
     * @param mensaje - Mensaje a mostrar al usuario
     * @return El número double leído
     */
    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.print("Por favor, ingrese un número válido: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    /*
     * Método auxiliar para leer un string desde la consola.
     * @param mensaje - Mensaje a mostrar al usuario
     * @return El string leído
     */
    private static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    /*
     * Método auxiliar para leer un booleano desde la consola.
     * @param mensaje - Mensaje a mostrar al usuario
     * @return true si se ingresa 's' o 'S', false en caso contrario
     */
    private static boolean leerBoolean(String mensaje) {
        System.out.print(mensaje);
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("s");
    }
}