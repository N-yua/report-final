package test;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import jp.ac.uryukyu.ie.e235743.Monster;
import jp.ac.uryukyu.ie.e235743.Player;

public class MonsterTest {
    @Test public void attack(){
        Monster monstereatTest = new Monster("いぬ", 10, 0);
        Player playerTest = new Player("ゆあ", 10, null);
        monstereatTest.attack(monstereatTest, playerTest);
        assertNotEquals(playerTest.getHp(), 10);
    }
}
