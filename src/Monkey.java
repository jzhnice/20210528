/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-28 11:07
 */
public class Monkey {
    Incarmation incarmation;   //  表示猴子的分身


    public void fight(Incarmation incarmation){
        if(incarmation instanceof EageleIncarnation) {
            this.incarmation = new FishIncarnstion();    // 变成小鱼
        } else if (incarmation instanceof FishEageleIncarnation) {
            this.incarmation = new SnakeInacrnation();   // 变成水蛇
        } else {
            this.incarmation = new SparrowIncarnation();    //变成麻雀
        }
    }
}
