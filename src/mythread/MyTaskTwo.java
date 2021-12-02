/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythread;

/**
 *
 * @author Kaushalya
 */
public class MyTaskTwo implements Runnable {

    @Override
    public void run() {
          for(int y=1; y<=5;y++){
            System.out.println("Java");
        }
    }
    
}
