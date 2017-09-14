import java.awt.*;

public class ColoringRectangle extends AbstractRectangle {

    private Color color = new Color(255,255,255);

    /**
     * Constructs a FallingRectangle
     * @param inX x coordinate
     * @param inY y coordinate
     * @param inW width
     * @param inH height
     */
    public ColoringRectangle(int inX, int inY, int inW, int inH){
        super(inX, inY, inW, inH, new Color(255,255,255));
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
            this.color = new Color(color.getRed() - 1, color.getGreen() - 1, color.getBlue() - 1);
        }
        catch(Exception e){

        }

        // Sets Color of Rectangle
        this.setFillColor(color);

    }

}
