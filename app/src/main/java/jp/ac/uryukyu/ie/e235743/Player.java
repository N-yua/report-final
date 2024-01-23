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
/*コンストラクタ 
 * @param name プレイヤーの名前
 * @param hp　プレイヤーの体力
 * @param food　モンスターに与える食べ物の名前
*/
    public Player(String name,int hp,String food){
        this.name = name;
        this.hp = hp;
        this.food = food;
    }
/*nameのgetterメソッド */
    public String getName(){
        return name;
    }
/*foodのgetterメソッド
 */
    public String getFood(){
        return food;
    }
/*hpのgetterメソッド */
    public int getHp(){
        return hp;
    }
/*プレイヤーが受けたダメージを計算するメソッド 
 * ＠param damage プレイヤーがうけた攻撃力をint型で受け取る
*/
    void damage(int damage){
        hp -= damage;
    }
/*ご飯を与えた時のメッセージ */
    void food(){
        System.out.println(this.name + "は" + getFood() +"を与えた！");
    }
}
