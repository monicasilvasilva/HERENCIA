package com.mycompany.herencia;

public class Herencia {

    public static void main(String[] args) {
        System.out.println("--- Demostración de Herencia ---");

        Profesor[] registroProfesores = new Profesor[50];

        Profesor profesor1 = new Profesor(
                "Juan", "Pérez", new java.util.Date(), "Masculino", 1.75, 75.0,
                "Programación Orientada a Objetos", 3500.0, "Tiempo Completo"
        );

        registroProfesores[0] = profesor1;

        System.out.println("Profesor registrado con éxito:");
        System.out.println("Nombre: " + registroProfesores[0].getNombre() + " " + registroProfesores[0].getApellido());
        System.out.println("Especialidad: " + registroProfesores[0].getEspecialidad());
        System.out.println("Capacidad total del arreglo de profesores: " + registroProfesores.length + " registros.");
    }
}
