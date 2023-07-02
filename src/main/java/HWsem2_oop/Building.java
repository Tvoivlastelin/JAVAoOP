package HWsem2_oop;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Building implements Health {

    private int maxHealth; // максимально количество здоровья
    private int currentHealth; // текущее количество здоровья
    private String name = "Здание";

    public Building(int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        if (currentHealth>=0 && currentHealth <=maxHealth){
            this.currentHealth = currentHealth;
        }
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }
    @Override
    public int getMaxHealth() {
        return maxHealth;
    }
}


