package HWsem2_oop;


public class Render {

    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    public void showIndicator(Object object) {
        if (object instanceof Health health) {
            int currentHealth = health.getCurrentHealth();
            int maxHealth = health.getMaxHealth();
            int percentage = (int) Math.ceil((double) currentHealth / maxHealth * 100);
            if (currentHealth<=0){
                System.out.println("Уничтожен");
            }
            StringBuilder indicatorBuilder = new StringBuilder("[");
            for (int i = 0; i < 10; i++) {
                if (i < percentage / 10) {
                    indicatorBuilder.append("*");
                } else {
                    indicatorBuilder.append(" ");
                }
            }
            indicatorBuilder.append("]");
            if (percentage < 30) {
                System.out.println("\u001B[31m" + indicatorBuilder.toString() + "\u001B[0m");
            } else if (percentage < 70) {
                System.out.println("\u001B[33m" + indicatorBuilder.toString() + "\u001B[0m");
            } else {
                System.out.println("\u001B[32m" + indicatorBuilder.toString() + "\u001B[0m");
            }
            System.out.println("Текущий уровень здоровья: " + currentHealth + ", Максимальный уровень здоровья:" + maxHealth);
        }
        if (object instanceof Mana mana) {
            int currentEnergy = mana.getCurrentEnergy();
            System.out.println("Текущий уровень энергии: " + currentEnergy);
        }
    }
}

