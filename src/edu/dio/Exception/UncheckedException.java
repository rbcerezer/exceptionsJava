package edu.dio.Exception;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Escolha um número: ");
            String b = JOptionPane.showInputDialog("Dividido por?: ");

            try{
                Double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ops! Digite um número!  " + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Por zero não vale! Digite outro número! ");
            }
            finally {
                System.out.println("Ufa! Chegamos no finally!");
            }
        } while(continueLooping);



        System.out.println("O código está rodando...");
    }

    public static Double dividir(double a, double b) {
        return a / b;

    }
}
