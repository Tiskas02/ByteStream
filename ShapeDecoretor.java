package ByteStream2;

public abstract class ShapeDecoretor implements Shape{
    protected Shape shape;
    public ShapeDecoretor(Shape shape){
        this.shape = shape;
    }
    @Override
    public void draw(){

    }
}
