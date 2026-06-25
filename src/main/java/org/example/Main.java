package org.example;

import org.example.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        boolean salir = false;
        while (!salir) {
            System.out.println("===== MENU =====");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante por codigo");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar estudiantes");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el codigo");
                    int codigo = scanner.nextInt();

                    scanner.nextLine(); // colocamos este para que no haya problema al asignar el otro tipo de dato
                    System.out.println("ingrese el nombre");
                    String nombre = scanner.nextLine();

                    System.out.println("ingrese el carrera");
                    String carrera = scanner.nextLine();

                    System.out.println("Ingrese su edad");
                    int edad = scanner.nextInt();

                    Estudiante nuevo = new Estudiante(codigo, nombre, edad, carrera);
                    estudiantes.add(nuevo);
                    System.out.println("ha ingresado correctamente los datos");
                    // agregar()3;
                    break;
                case 2:
                    System.out.println("escribe el codigo del estudiante");
                    int codigoBuscar = scanner.nextInt();
                    boolean encontrado = false;
                    for (Estudiante e : estudiantes) {
                        if (e.getCodigo() == codigoBuscar) {
                            System.out.println(e);
                            encontrado = true;
                        }
                        if (!encontrado) {
                            System.out.println("No existe estudiante con este codigo");
                        }
                    }
                    //buscar();
                    break;

                case 3:
                    System.out.println("Escribe el codigo de estudiante a eliminar");
                    int codigoEliminar = scanner.nextInt();
                    boolean eliminado = false;

                    for (int i = 0; i < estudiantes.size(); i++) {
                        if (estudiantes.get(i).getCodigo() == codigoEliminar) {
                            estudiantes.remove(i);
                            System.out.println("estudiante eliminado correctamente");
                            eliminado = true;
                        }

                    }
                    if (!eliminado) {
                        System.out.println("No existe un estudiante con ese código.");
                    }
                    // eliminar();
                    break;


                case 4:
                    System.out.println("=== LISTA DE ESTUDIANTES ===");
                    //utilizamos .isEmpty() para que nos valide si hay o no hay estudiantes registrados
                    if (estudiantes.isEmpty()) {
                        System.out.println("no hay estudiantes registrados");
                    } else {
                        // utilizamos un for each para que muestre los estudiantes insccritos,
                        // los cuales se guardan temporalmente en la variable e
                        for (Estudiante e : estudiantes) {
                            System.out.println(e);
                        }
                    }
                    //mostrar();

                    break;
                case 5:
                    //salir();
                    break;
                default:
                    System.out.println("opcion invalida");

            }
        }

    }}
