/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-28 11:07
 */
public class Play {
    public static void main(String[] args) {
        Monkey wukong = new Monkey();
        Fairy erlangshen = new Fairy();

        // 第一回和 悟空变麻雀   二郎神变老鹰
        wukong.fight(erlangshen.incarmation);
        erlangshen.fight(wukong.incarmation);
        System.out.println("第一回合：悟空变成："+wukong.incarmation+"二郎神变成:"+erlangshen.incarmation);


//        第二回合  悟空变小鱼，二郎神变鱼鹰
        wukong.fight(erlangshen.incarmation);
        erlangshen.fight(wukong.incarmation);
        System.out.println("第二回合：悟空变成："+wukong.incarmation+"二郎神变成:"+erlangshen.incarmation);


//        第三回合  悟空变水蛇， 二郎神变灰鹤

        wukong.fight(erlangshen.incarmation);
        erlangshen.fight(wukong.incarmation);
        System.out.println("第三回合：悟空变成："+wukong.incarmation+"二郎神变成:"+erlangshen.incarmation);
    }
}
