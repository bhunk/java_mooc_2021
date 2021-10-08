/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zord
 */
public class Fitbyte {
    private int age;
    private int restHeart;
    
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restHeart = restingHeartRate;
        
    }
    
    
    
    public double targetHeartRate(double percentageOfMaximum){
        
      double max = 206.3 - (0.711 * age);
      return (max - restHeart) * percentageOfMaximum + restHeart;
       
       
    }
  // public String toString(){
   //     return 206.3 - (0.711 * age);
   // }
    
}
