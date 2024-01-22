package jp.ac.uryukyu.ie.e235743;
/**
 * モンスタークラス<br>
 * モンスターが持つ名前、HP、攻撃力
 */
public class Monster {
    /*モンスターの名前 */
        String name;
    /*モンスターのHP */
        int hp;
    /*モンスターの攻撃力 */
        int attack;
    /*モンスターの捕まえやすさ */
        int get;
    
    /*コンストラクタ */
        Monster(String name,int attack,int get){
            this.name = name;
            this.attack = attack;
            this.get = get;
        }
    /*Getterメソッド */
        public int getGet(){
            return get;
        }
        public String getName(){
            return name;
        }
        public int getAttack(){
            return attack;
        }
    
}
