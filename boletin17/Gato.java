/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author xavier
 */
public class Gato extends Mamifero implements IPuedeNadar{
    private int metros;
    @Override
    public void nadar(){
        metros++;
        System.out.println("Desplazamiento: " + metros);
    }
}
