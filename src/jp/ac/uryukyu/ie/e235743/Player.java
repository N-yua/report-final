package jp.ac.uryukyu.ie.e235743;
public class Player {
    String name;
    String food;
    int love;
    int hp;

    Player(String name,int hp,String food){
        this.name = name;
        this.hp = hp;
        this.food = food;
    }
    public String getName(){
        return name;
    }
    public String getFood(){
        return food;
    }
    public int getHp(){
        return hp;
    }
}
