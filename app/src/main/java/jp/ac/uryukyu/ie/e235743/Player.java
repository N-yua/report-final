package jp.ac.uryukyu.ie.e235743;
/*
 * Playerクラス<br>
 * プレイヤーの情報についてまとめたクラス
 */
public class Player {
/*プレイヤーの名前 */
    String name;
/*モンスターに与えるご飯の名前 */
    String food;
/*プレイヤーのHP */
    int hp;
/*コンストラクタ */
    public Player(String name,int hp,String food){
        this.name = name;
        this.hp = hp;
        this.food = food;
    }
/*getterメソッド */
    public String getName(){
        return name;
    }
    public String getFood(){
        return food;
    }
    public int getHp(){
        return hp;
    }
/*プレイヤーが受けたダメージを計算するメソッド */
    void damage(int damage){
        hp -= damage;
    }
/*ご飯を与えた時のメッセージ */
    void food(){
        System.out.println(this.name + "は" + getFood() +"を与えた！");
    }
}
