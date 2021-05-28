/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-28 11:08
 */
public class Incarmation {
    @Override
    public String toString(){
        if(this instanceof SparrowIncarnation) {
            return "麻雀";
        } else if (this instanceof FishIncarnstion) {
            return "小鱼";
        } else if (this instanceof SnakeInacrnation) {
            return "水蛇";
        } else if (this instanceof EageleIncarnation) {
            return "老鹰";
        } else if (this instanceof FishEageleIncarnation) {
            return "鱼鹰";
        } else if (this instanceof Cranelncarnation ) {
            return "灰鹤";
        } else {
            return super.toString();
        }
    }
}

class SparrowIncarnation extends Incarmation{}
class FishIncarnstion extends Incarmation{}
class SnakeInacrnation extends Incarmation{}

class EageleIncarnation extends Incarmation{}
class FishEageleIncarnation extends Incarmation{}
class Cranelncarnation extends Incarmation{}
