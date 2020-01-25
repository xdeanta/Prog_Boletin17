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
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Felino f1, f2;
        Ave av, a1;
        /*Papagayo av;
        Avestruz a1;*/
        Papagayo p;
        f1=new Gato();
        System.out.println(f1.toString());
        f1.caminar();
        f1.nadar();
        
        f2=new Tigre();
        System.out.println(f2.toString());
        f2.caminar();
        f2.nadar();
        
        av=new Papagayo();
        a1=new Avestruz();
        System.out.println(a1.toString());
        a1.caminar();
        System.out.println(av.toString());
        ((Papagayo)av).volar();
        av.caminar();
    }
    
}
