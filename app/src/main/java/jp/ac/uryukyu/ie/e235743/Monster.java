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
    /*コンストラクタ
     * @param name モンスターの名前
     * @param attack　モンスターが持つ攻撃力をint型で受け取る
     * @param get　モンスターの好感度をint型で受け取る
     */
        public Monster(String name,int attack,int get){
            this.name = name;
            this.attack = attack;
            this.get = get;
        }
    /*getのgetterメソッド*/
        public int getGet(){
            return get;
        }
    /*nameのgetterメソッド */
        public String getName(){
            return name;
        }
    /*attackのgetterメソッド */
        public int getAttack(){
            return attack;
        }
/*モンスターが出現した時のメッセージ */
    public void appearance(){
        System.err.println(this.name + "が現れた！" + "\n 警戒力：" + this.get +  "\n 攻撃力：" + this.attack);
    }
/*モンスターのステータス 
 * 好感度＝捕まえやすさ　高ければ高いほど捕まえやすい
*/
    public void status(){
        System.err.println( "名前：" + this.name + "\n 好感度：" + this.get);
    }
/*モンスターにご飯をあげた時におこること<br>
 * ご飯を食べると、捕まえやすさが上がる
*/
    public void eat(){
        System.out.println(this.name +"はご飯を食べた！");
        get += 2;
        System.out.println("好感度が"+getGet()+"上がった！");
    }
/*好感度が１０以上になり、捕まえた時のメッセージ */
    public void lovepoint(){
        if (get >= 10) {
            System.out.println("なついた！");
        }
    }
/*モンスターの好感度が低い時に捕まえようとすると攻撃してくるメソッド 
 * @param Monster executer 攻撃をする側
 * @param Player target 攻撃をしたい相手
*/
    public void attack(Monster executer,Player target){
        /*攻撃をしたい相手のHPが０以上の時<br>
         * モンスターはプレイヤーを攻撃できる
         */
        if (target.getHp() > 0) {
            System.out.println(executer.getName()+"は怒った！");
            System.out.print(target.getName()+ "に" + executer.getAttack() + "ポイント攻撃した！ \n");
            /*@param getAttack() プレイヤーのダメージ数はモンスターの攻撃力を受け取る*/
            target.damage(executer.getAttack());
            System.out.println("\n" + target.getName() + "の残りHP:" + target.getHp()); 
        }
    }

    
}
