/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Clases;

public class SesionActual {
    private static String numeroMesa;
    private static String nombrePersona;

    public static String getNumeroMesa() {
        return numeroMesa;
    }

    public static void setNumeroMesa(String numeroMesa) {
        SesionActual.numeroMesa = numeroMesa;
    }

    public static String getNombrePersona() {
        return nombrePersona;
    }

    public static void setNombrePersona(String nombrePersona) {
        SesionActual.nombrePersona = nombrePersona;
    }
}