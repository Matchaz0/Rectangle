import java.util.ArrayList;
public class RectangleRunner {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        int x;
        int y;
        int height;
        int width;
        Rectangle rect;

        for (int k = 0; k < 1000000; k ++) {
            x = (int) (Math.random() * 50);
            y = (int) (Math.random() * 50);
            height = (int) (Math.random() * 40) + 10;
            width = (int) (Math.random() * 5) + 5 ;
            rect = new Rectangle(x, y, width, height);
            rectangles.add(rect);
        }
    }
}
