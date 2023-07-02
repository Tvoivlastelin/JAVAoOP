package HWsem2_oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hero implements Mana, Health {
    private int maxHealth; // максимально количество здоровья
    private int currentHealth; // текущее количество здоровья
    private String name = "Герой";

    public int maxMana; // максимально количество магический энергии
    private int currentMana; // текущее количество магический энергии

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealth = maxHealthPoint;
        this.maxMana = maxManaPoint;

        this.currentHealth = maxHealthPoint;
        this.currentMana = maxManaPoint;
    }

    public void setCurrentHealth(int currentHealth) {

        if (currentHealth >= 0 && currentHealth <= maxHealth) {
            this.currentHealth = currentHealth;
        }
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }

    @Override
    public int getCurrentEnergy() {
        return currentMana;
    }
}

