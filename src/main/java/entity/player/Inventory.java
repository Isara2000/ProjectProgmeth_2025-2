package entity.player;

import entity.base.Entity;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Entity> inventory;

    public void addItem(Entity entity){
        inventory.add(entity);
    }

    public boolean dropItem(Entity entity){
        if(inventory.contains(entity)){
            inventory.remove(entity);
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Entity> getInventory() {
        return inventory;
    }
}
