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
public class Bol18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        switch (Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:\n1º.Núms. aleatorios\n2º.Notas\n3º.Letra NIF"))) {
            case 1:
                Aleatorios ale = new Aleatorios();
                ale.generar();
                ale.visualizar();
                ale.ordenar();
                break;
            case 2:
                Notas notas = new Notas();
                notas.darNombres();
                notas.darNotas();
                notas.listaOrd();
                notas.verNota();
                notas.Aprobados();
                notas.notaMedia();
                notas.notaAlta();
                break;
            case 3:
                Nif dni = new Nif();
                dni.dni();
                dni.Comparar();
                break;
        }
    }

}
    
    


