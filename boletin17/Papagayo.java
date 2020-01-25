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
public class Papagayo extends Ave implements IPuedeVolar{
    private int metrosv;
    @Override
    public void volar(){
        System.out.println("Metros volados: " + metrosv);
    }
}
