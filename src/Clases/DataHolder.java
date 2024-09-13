/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Clases;

import java.util.HashMap;
import java.util.Map;

public class DataHolder {
    // Map para almacenar los productos, sus precios y cantidades
    private static Map<String, Double> cerPrices = new HashMap<>();
    private static Map<String, Integer> cerQuantities = new HashMap<>();

    private static Map<String, Double> vinPrices = new HashMap<>();
    private static Map<String, Integer> vinQuantities = new HashMap<>();

    private static Map<String, Double> cocPrices = new HashMap<>();
    private static Map<String, Integer> cocQuantities = new HashMap<>();

    // Inicializar con precios por defecto
    static {
        cerPrices.put("Cer1", 8.400);
        cerPrices.put("Cer2", 21.000);
        cerPrices.put("Cer3", 15.000);
        cerPrices.put("Cer4", 13.200);
        cerPrices.put("Cer5", 8.100);
        cerPrices.put("Cer6", 21.000);

        vinPrices.put("Vin1", 88.700);
        vinPrices.put("Vin2", 132.800);
        vinPrices.put("Vin3", 190.900);
        vinPrices.put("Vin4", 89.000);
        vinPrices.put("Vin5", 114.300);
        vinPrices.put("Vin6", 59.800);

        cocPrices.put("Coc1", 8.800);
        cocPrices.put("Coc2", 8.800);
        cocPrices.put("Coc3", 8.800);
        cocPrices.put("Coc4", 8.800);
        cocPrices.put("Coc5", 45.000);
        cocPrices.put("Coc6", 78.000);
    }

    // Métodos para agregar productos y manejar cantidades
    public static void addCer(String cerName) {
        cerQuantities.put(cerName, cerQuantities.getOrDefault(cerName, 0) + 1);
    }

    public static void addVin(String vinName) {
        vinQuantities.put(vinName, vinQuantities.getOrDefault(vinName, 0) + 1);
    }

    public static void addCoc(String cocName) {
        cocQuantities.put(cocName, cocQuantities.getOrDefault(cocName, 0) + 1);
    }

    // Métodos para obtener la cantidad de productos
    public static int getCerQuantity(String cerName) {
        return cerQuantities.getOrDefault(cerName, 0);
    }

    public static int getVinQuantity(String vinName) {
        return vinQuantities.getOrDefault(vinName, 0);
    }

    public static int getCocQuantity(String cocName) {
        return cocQuantities.getOrDefault(cocName, 0);
    }

    // Métodos para obtener los precios de los productos
    public static double getCerPrice(String cerName) {
        return cerPrices.getOrDefault(cerName, 0.0);
    }

    public static double getVinPrice(String vinName) {
        return vinPrices.getOrDefault(vinName, 0.0);
    }

    public static double getCocPrice(String cocName) {
        return cocPrices.getOrDefault(cocName, 0.0);
    }
}