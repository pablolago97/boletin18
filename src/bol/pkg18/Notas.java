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
public class Notas {
    
    private final int notas[] = new int[valores()];
    private final String nombres[] = new String[notas.length];

    public int valores() {
        return Integer.parseInt(JOptionPane.showInputDialog("Cuántos alumnos hay?"));
    }

    public void darNotas() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce nota:"));
            while (notas[i] < 0 || notas[i] > 10) {
                notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota correcta:"));
            }
        }
    }

    public void Aprobados() {
        int aprobados = 0;
        int suspensos = 0;
        String texto = "";
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados = aprobados + 1;
                texto += nombres[i] + "\n";
            } else {
                suspensos = suspensos + 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Aprobados: " + aprobados + "\n" + texto + "Suspensos: " + suspensos);
    }

    public void notaMedia() {
        int sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas = sumaNotas + notas[i];
        }
        int media = sumaNotas / notas.length;
        JOptionPane.showMessageDialog(null, "la nota media de la clase es: " + media);
    }

    public void notaAlta() {
        int aux = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > aux) {
                aux = notas[i];
            }
        }
        JOptionPane.showMessageDialog(null, "la nota más alta es: " + aux);
    }

    public void darNombres() {
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Introduce nombre:");
        }
    }

    public void verNota() {
        String respuesta = "";
        do {
            switch (Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:\n1.por posición\n2.por nombre"))) {
                case 1:
                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Elige la posición del alumno: "));
                    JOptionPane.showMessageDialog(null, "la nota del alumno es: " + notas[valor - 1]);
                    respuesta = JOptionPane.showInputDialog("Quieres ver otro alumno?");
                    break;
                case 2:
                    int numero = 0;
                    String nombre =JOptionPane.showInputDialog("Introduce el nombre:");
                    for(int i=0;i<nombres.length;i++){
                        if(nombres[i].equalsIgnoreCase(nombre))
                        numero= i;
                    }
                    JOptionPane.showMessageDialog(null,"la nota de "+nombres[numero]+" es "+notas[numero]);
                    respuesta = JOptionPane.showInputDialog("Quieres ver otro alumno?");
                    break;
            }
        }while (respuesta.equalsIgnoreCase("si"));
    }

    public void listaOrd() {
        String texto = "";
        for (int i = 0; i < notas.length; i++) {
            for(int j = i+1;j<notas.length;j++){
                if(notas[i]>notas[j]){
                    int aux=notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
                }
            }
            texto += notas[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
}