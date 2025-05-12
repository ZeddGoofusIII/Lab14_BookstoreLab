package com.example.lab14;

import java.util.InputMismatchException;

/**
 * This class
 *
 * @author Alexis L'Esperance
 */

public class OrderManager {
    private static final int[] orderList = new int[3];
    private static int count = 0;
    public static String placeOrder(String title, String priceStr, String quantityStr, String discountStr) {
        try {
            int total = Integer.parseInt(priceStr) * Integer.parseInt(quantityStr) * (1 - Integer.parseInt(discountStr) / 100);
            orderList[count] = total;
            count++;
            return "Order " + title + " successfully placed.";
        }
        catch (NullPointerException e) {
            return "Could not place order: at least one field is empty or null.";
        }
        catch (NumberFormatException e) {
            return "Could not place order: at least one numeric field contains a non-numeric input.";
        }
        catch (ArithmeticException e) {
            return "Could not place order: given values cannot be used in calculations.";
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return "Could not place order: you have already submitted 3 orders.";
        }
        catch (InputMismatchException e) {
            return "Could not place order: input format is incorrect.";
        }
    }// place order method
}// order manager class
