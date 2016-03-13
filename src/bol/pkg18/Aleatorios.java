/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol.pkg18;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Aleatorios {
    private final int numeros[] = new int[valores()];

    public int valores() {
        return Integer.parseInt(JOptionPane.showInputDialog("Cuántos elementos quieres generar?"));
    }

    public void generar() {
        for (int i = 0; i < numeros.length; i++) {
            int entero = (int) Math.floor(Math.random() * 50 + 1);
            numeros[i] = entero;
        }
    }

    public void visualizar() {
        String texto = "";
        for (int i = 0; i < numeros.length; i++) {
            texto += numeros[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void ordenar() {
        String text = "";
        for (int i = numeros.length-1; i >= 0; i = i - 1) {
            text += numeros[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, text);
    }
}