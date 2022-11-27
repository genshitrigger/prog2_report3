package jp.ac.uryukyu.ie.e225716;

public class WarriorTest {
    public static void main(String[] args) {
        Warrior warrior_Lv1 = new Warrior("戦士Lv1", 7, 8);
        Warrior warrior_Lv10 = new Warrior("戦士Lv10", 23, 28);
        Warrior warrior_Lv50 = new Warrior("戦士Lv50", 85, 100);
        Enemy enemy = new Enemy("スライム", 6, 3);
        
        warrior_Lv1.attackWithWeponSkill(enemy);
        warrior_Lv10.attackWithWeponSkill(enemy);
        warrior_Lv50.attackWithWeponSkill(enemy);

        
    }
}
