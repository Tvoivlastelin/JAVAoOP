package HWsem2_oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Neutral implements Health {

    private int maxHealth; // максимально количество здоровья
    private int currentHealth; // текущее количество здоровья
    private String name = "Мирный житель";

    public Neutral(int maxHealth) {
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
}


