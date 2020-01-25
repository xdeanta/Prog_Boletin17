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
public abstract class Ave implements IPuedeCaminar{
    protected int metros;
    @Override
    public void caminar(){
        System.out.println("Metros Caminados: " + metros);
    }
}
