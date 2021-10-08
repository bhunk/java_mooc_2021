/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zord
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hunseconds;
    
    public Timer(){
        this.seconds = new ClockHand(60); 
        this.hunseconds = new ClockHand(100);
    }
    public void advance() {
        this.hunseconds.advance();

        if (this.hunseconds.value() == 0) {
            this.seconds.advance();

            
            }
        }
    

    public String toString() {
        return seconds + ":" + hunseconds;
    }

   

    }   

