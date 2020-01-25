package boletin17;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xavier
 */
public class Papagayo implements IPuedeCaminar{
    private int pasos;
    @Override
    public void caminar(){
        pasos++;
        System.out.println("Numero de pasos: " +pasos);
    }
    
}
