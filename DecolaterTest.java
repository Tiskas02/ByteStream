package ByteStream2;

public class DecolaterTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle R = new Rectangle();
        RedShapeDecolator redCircle = new RedShapeDecolator (c);
        RedShapeDecolator redRectangle = new RedShapeDecolator (R);
        redCircle.draw();
        redRectangle.draw();
        }
}
