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
public class Nif {
    private int resto;
    private final String arrayDic[];
    private final int nums[];

    public Nif() {
        this.arrayDic = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        this.nums = new int[]{3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
                }
    public int dni(){
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del DNI:"));
        return resto = dni%23;
    }
    public void Comparar(){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==resto){
            JOptionPane.showMessageDialog(null,"La letra del DNI es: "+arrayDic[i]);
            
            }
        }
    }
}