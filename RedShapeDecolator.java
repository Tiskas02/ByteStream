package ByteStream2;

public class RedShapeDecolator extends ShapeDecoretor {

    public RedShapeDecolator(Shape shape) {
        super(shape);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void draw(){
        shape.draw();
        System.out.println("Border Color: Red");
    }
    
}
