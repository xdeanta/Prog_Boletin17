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
public abstract class Mamifero implements IPuedeCaminar {

    protected int pasos;
    
    @Override
    public void caminar(){
        pasos++;
        System.out.println("Numero de pasos: " + pasos);
    }
}
