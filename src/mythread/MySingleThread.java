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
public class MySingleThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //MyTask task = new MyTask();
       //task.executeTask();
       
//       MyTaskOne taskone = new MyTaskOne();
//       taskone.start();

Runnable r = new MyTaskTwo();
Thread t = new Thread(r);
t.start();
       
         for(int x=1; x<=5;x++){
            System.out.println("Hello");
        }
    }
    
}
