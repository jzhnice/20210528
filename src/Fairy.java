import java.util.SplittableRandom;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-28 11:07
 */
public class Fairy {
    Incarmation incarmation;    //  表示神仙的分身

    public void fight(Incarmation incarmation) {
       if(incarmation instanceof SparrowIncarnation) {
           this.incarmation = new EageleIncarnation();  // 变成老鹰
       } else if (incarmation instanceof FishIncarnstion) {
           this.incarmation = new FishEageleIncarnation();// 变成鱼鹰
       } else if (incarmation instanceof SnakeInacrnation) {
           this.incarmation = new Cranelncarnation();  // 变成灰鹤
       }
    }
}
