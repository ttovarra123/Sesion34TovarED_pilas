/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion34tovared_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author LISUACM
 */
public class Sesion34TovarED_pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de Pila
       Stack<Integer>  pilaTovar = new Stack<>();
       
       pilaTovar.push(100);
       pilaTovar.push(150);
       pilaTovar.push(230);
       pilaTovar.push(10);
       pilaTovar.push(160);
       
        JOptionPane.showMessageDialog(null, "Datos en pila ordenada es :\n"+pilaTovar);
       
       
    }
    
}
