import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rectangle {
    private int topLeftX;
    private int topLeftY;
    private int topRightX;
    private int topRightY;
    private int botLeftX;
    private int botLeftY;
    private int botRightX;
    private int botRightY;
    private int width;
    private int height;
    private int[] xRange;
    private int[] yRange;

    public Rectangle(int topLeftX, int topLeftY, int width, int height) {
        this.width = width;
        this.height = height;
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
        topRightX = topLeftX + width;
        topRightY = topLeftY;
        botLeftX = topLeftX;
        botLeftY = topLeftY - height;
        botRightX = topLeftX + width;
        botRightY = topLeftY - width;

        xRange = (topLeftX, topRightX);
        yRange = (botLeftY, topLeftY);

    }

    public int getTopLeftX() {
        return topLeftX;
    }

    public int getTopLeftY() {
        return topLeftY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public int getArea() {
        return width * height;
    }

    public boolean checkOverlap(Rectangle otherRect) {
        return true;
    }

    public String toString() {
        return "Rectangle{" +
                "topLeftX=" + topLeftX +
                ", topLeftY=" + topLeftY +
                ", topRightX=" + topRightX +
                ", topRightY=" + topRightY +
                ", botLeftX=" + botLeftX +
                ", botLeftY=" + botLeftY +
                ", botRightX=" + botRightX +
                ", botRightY=" + botRightY +
                ", width=" + width +
                ", height=" + height +
                ", xRange=" + Arrays.toString(xRange) +
                ", yRange=" + Arrays.toString(yRange) +
                '}';
    }
}