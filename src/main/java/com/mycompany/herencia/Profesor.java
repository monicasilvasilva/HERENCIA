package com.mycompany.herencia;

import java.util.Date;
public class Profesor extends Persona {
    private String especialidad;
    private double salario;
    private String tipoContrato;

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellido, Date fechaNacimiento, String genero, double estatura, double peso,
                    String especialidad, double salario, String tipoContrato) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        
        this.especialidad = especialidad;
        this.salario = salario;
        this.tipoContrato = tipoContrato;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
