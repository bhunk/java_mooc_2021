/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zord
 */
public class Gauge {
    private int value;
    
    public Gauge(){
        this.value = 0;
    }
    public void increase(){
        if (full()){
        this.value = 5;
        }else{
            this.value = this.value + 1;
        }
    }
    public void decrease(){
        if(this.value > 0){
        this.value = this.value - 1;
        }else{
            this.value = 0;
        }
    }
    public int value(){
        return this.value;
    }
    public boolean full(){
       return this.value >= 5; 
    }
}
