
import java.util.ArrayList;
import java.util.List;

import jp.ac.uryukyu.ie.e235743.Monster;
import jp.ac.uryukyu.ie.e235743.Player;
/*Mainクラス
 * 機能を主に実装するクラス
 */
public class Main {
/*mainメソッド<br>
 * ここでモンスターにご飯を与えるか、捕まえるか、逃げるかの選択をする
 */
    public static void main(String[] args){
    /*インスタンス */
        Monster dog = new Monster("いぬ", 5,0);
        Player player = new Player("ゆあ", 20,"ジャーキー");
        List<String> list = new ArrayList<String>();
        
        /*モンスターが現れた */
        dog.appearance();
        /*ご飯をあげる、ゲットする、逃げるから選択するメソッド<br>
         * プレイヤーのHPが０を下回るまでループする<br>
         */
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
                while (player.getHp() > 0) {
                    /*モンスターのステータスを表示する<br>
                     * ご飯を与え続けると2ずつカウントされる
                     */
                    dog.status();
                    final String[] Types = {"1.ご飯をあげる","2.ゲットする","3.逃げる"};
                    /*配列の中身を全て表示する */
                    for(int i = 0; i<3; i++){
                        System.out.println(Types[i]);
                    }
                    /*プレイヤーの入力を受け取る */
                    int choice = sc.nextInt();
                    /*選択肢１の場合、モンスターにご飯を与える<br>
                     * ご飯を与えるとモンスターは好感度が２ずつ上昇する
                     */
                    if (choice == 1) {
                        System.out.println(player.getFood() +"をあげた！");
                        dog.eat();
                    /* 選択肢２の場合、モンスターをゲットすることができる<br>
                     * ただし、好感度が10以下の場合攻撃される<br>
                     * ゲットできた時は強制終了する
                    */
                    } else if (choice == 2) {
                        System.out.println("ゲットする！");
                        if (dog.getGet() <= 10) {
                            System.out.println("捕まえられなかった！");
                            dog.attack(dog,player);
                        }else{
                            dog.lovepoint();
                            System.out.println(dog.getName()+"を仲間にした！");
                            /*捕まえた場合、空のリストに犬を入れる<br>*/
                            list.add("いぬ");
                            break;
                        }
                    /*選択肢３の場合、ループ処理を強制終了する */
                    } else if (choice == 3) {
                        System.out.println("逃げ出した！");
                        break;
                    /*その他の入力があった場合、もう一度初めからやり直す */
                    } else {
                        System.out.println("無効な選択です。もう一度選んでください。");
                    }
                }
            }
        /*あなたの捕まえたモンスターを表示します。*/
        for(int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }
    }
}