package designPatterns.prototypePattern;

/**
 * @auther heer
 * @create 2022/4/15
 */

/*创建一个实现了 Cloneable 接口的抽象类。*/
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
