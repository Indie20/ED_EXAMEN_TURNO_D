/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analistaed_53259999a;
import java.util.*;
/**
 * Ejercicio práctico examen EVAL 1 ED
 * 
 * @author INDIRA SALCEDO CRISTOBAL DNI 53259999A
 * @version 1.0
 */

public class AnalistaED_53259999a {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    /**
     * Constructor con tres parámetros
     * @param nombreCompleto nombre completo en mayúsculas
     * @param dni documento nacional de identidad con letra y sin espacios
     */
    public AnalistaED_53259999a(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    /**
     * Calcula el salario bruto mensual en función del salario base por hora y las horas extras.
     * El precio por hora de la hora extra se determina con la constante FACTOR_HORA_EXTRA.
     * 
     * @param horasExtra número de horas extra dedicadas redondeando a la baja (entero)
     * @return devuelve el salario bruto mensual en euros con dos decimales
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA        
        AnalistaED_53259999a emp = new AnalistaED_53259999a("INDIRA SALCEDO", "53259999A");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto 
		+ " este mes será de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }

}