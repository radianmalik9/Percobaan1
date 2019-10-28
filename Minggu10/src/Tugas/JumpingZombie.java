/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author WINDOWS 10
 */
public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch(level){
            case 1:
                health = health + (this.health) * 30/100;
                break;
            case 2:
                health = health + (this.health) * 40/100;
                break;
            case 3:
                health = health + (this.health) * 50/100;
                break;
        }  
    }

    @Override
    public void destroyed() {
        health = health - (this.health * 1/100);
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo() + "\n";
        info+= "Jumping Zombie Data = \n" + "Health = " + health + "\n" + "Level = " + level;
        return info;
    }  
}
