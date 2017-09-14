import java.awt.*;
import java.util.Random;

public class BouncingRectangle extends AbstractRectangle {

    private int X;
    private int Y;

    private Random r = new Random();

    /**
     * Constructs a FallingRectangle
     * @param inX x coordinate
     * @param inY y coordinate
     * @param inW width
     * @param inH height
     * @param inFillColor fill color
     */
    public BouncingRectangle(int inX, int inY, int inW, int inH, Color inFillColor){
        super(inX, inY, inW, inH, inFillColor);

        X = r.nextInt(3) - 1;
        Y = r.nextInt(3) - 1;

    }

    /**
     * The FallingRectangle moves down the screen.
     * @param drawAreaWidth the width of the drawing area
     * @param drawAreaHeight the height of the drawing area
     */
    @Override
    public void act(int drawAreaWidth, int drawAreaHeight){

        if (this.getMinY() == 0){
            Y = 1;
        }
        if (this.getMaxY() == drawAreaHeight){
            Y = -1;
        }
        if (this.getMinX() == 0){
            X = 1;
        }
        if (this.getMaxX() == drawAreaWidth){
            X = -1;
        }

        this.translate(X,Y);
    }

}
