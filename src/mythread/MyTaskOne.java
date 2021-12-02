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
public class MyTaskOne extends Thread {

    @Override
    public void run()
    {
        for(int x=1; x<=5;x++){
            System.out.println("Java");
        }
    }

}
