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
        public Monster(String name,int attack,int get){
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
/*モンスターが出現した時のメッセージ */
    void appearance(){
        System.err.println(this.name + "が現れた！" + "\n 警戒力：" + this.get +  "\n 攻撃力：" + this.attack);
    }
/*モンスターのステータス 
 * 好感度＝捕まえやすさ　高ければ高いほど捕まえやすい
*/
    void sttatus(){
        System.err.println( "名前：" + this.name + "\n 好感度：" + this.get);
    }
/*モンスターにご飯をあげた時におこること<br>
 * ご飯を食べると、捕まえやすさが上がる
*/
    void eat(){
        System.out.println(this.name +"はご飯を食べた！");
        get += 2;
        System.out.println("好感度が"+getGet()+"上がった！");
    }
/*好感度が１０以上になり、捕まえた時のメッセージ */
    void lovepoint(){
        if (get >= 10) {
            System.out.println("なついた！");
        }
    }
/*モンスターの好感度が低い時に捕まえようとすると攻撃してくるメソッド */
    public void attack(Monster executer,Player target){
        if (target.getHp() > 0) {
            System.out.println(executer.getName()+"は怒った！");
            System.out.print(target.getName()+ "に" + executer.getAttack() + "ポイント攻撃した！ \n");
            target.damage(executer.getAttack());
            System.out.println("\n" + target.getName() + "の残りHP:" + target.getHp()); 
        }
    }

    
}
