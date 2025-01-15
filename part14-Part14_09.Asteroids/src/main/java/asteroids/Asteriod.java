/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

import java.util.Random;

/**
 *
 * @author Niclaus
 */
public class Asteriod extends Character {
    private double rotationalMovement;
    private boolean alive;
    
    public Asteriod(int x, int y){
        super(new PolygonFactory().createPolygon(), x, y);    
        
        Random rnd = new Random();
        
        super.getCharacter().setRotate(rnd.nextInt(360));
        
        int accelerationAmount = 1 + rnd.nextInt(10);
        for(int i = 0; i < accelerationAmount; i++){
            accelerate();
        }
        this.alive = true;
        
        this.rotationalMovement = 0.5 - rnd.nextDouble();
    }
    
    public void move(){
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + this.rotationalMovement);
    }
    
    public boolean isAlive(){
        return alive;
    }
    
    public void setAlive(boolean alive){
        this.alive = alive;
    }
}
