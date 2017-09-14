import java.awt.*;
import java.util.Random;

public class PersonalRectangle extends AbstractRectangle {

    private Color color = new Color(0,0,0);

    private int X;
    private int Y;

    private Random r = new Random();

    private boolean brighterColor = false;


    /**
     * Constructs a FallingRectangle
     * @param inX x coordinate
     * @param inY y coordinate
     * @param inW width
     * @param inH height
     */
    public PersonalRectangle(int inX, int inY, int inW, int inH){
        super(inX, inY, inW, inH, new Color(0,0,0));

        // Sets Random Starting Direction for Rectangle
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

        // Changes Color of Rectangle
        try {
            if (!brighterColor) {
                this.color = new Color(color.getRed() - 1, color.getGreen() - 1, color.getBlue() - 1);
            }
            if (brighterColor){
                this.color = new Color(color.getRed() + 1, color.getGreen() + 1, color.getBlue() + 1);
            }
        }
        catch(Exception e){
            brighterColor = !brighterColor;
        }

        // Changes Movement Direction of Rectangle
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

        // Sets Color and Position of Rectangle
        this.setFillColor(color);
        this.translate(X,Y);

    }

}
