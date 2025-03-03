import java.util.ArrayList;
public class RectangleRunner {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        int x;
        int y;
        int height;
        int width;
        Rectangle rect;
        Rectangle target = new Rectangle(10, 15, 20, 10);

        for (int k = 0; k < 1000000; k ++) {
            x = (int) (Math.random() * 51);
            y = (int) (Math.random() * 51);
            height = (int) (Math.random() * 41) + 10;
            width = (int) (Math.random() * 6) + 5 ;
            rect = new Rectangle(x, y, width, height);
            rectangles.add(rect);
        }
    }
}
