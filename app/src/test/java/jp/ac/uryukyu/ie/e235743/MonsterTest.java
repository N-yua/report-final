package jp.ac.uryukyu.ie.e235743;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;



public class MonsterTest {
    @Test public void attack(){
        Monster monstereatTest = new Monster("いぬ", 10, 0);
        Player playerTest = new Player("ゆあ", 10, null);
        monstereatTest.attack(monstereatTest, playerTest);
        assertNotEquals(playerTest.getHp(), 10);
    }
}
