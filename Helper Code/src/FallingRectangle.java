import java.awt.Color;

/**
 * Created by rritz on 9/3/2015.
 */

public class FallingRectangle extends AbstractRectangle {

    /**
     * Constructs a FallingRectangle
     * @param inX x coordinate
     * @param inY y coordinate
     * @param inW width
     * @param inH height
     * @param inFillColor fill color
     */
    public FallingRectangle(int inX, int inY, int inW, int inH, Color inFillColor) {
        super(inX, inY, inW, inH, inFillColor);
    }

    /**
     * The FallingRectangle moves down the screen.
     * @param drawAreaWidth the width of the drawing area
     * @param drawAreaHeight the height of the drawing area
     */
    @Override
    public void act(int drawAreaWidth, int drawAreaHeight) {

        // Spreads out Rectangle upon Impact of Screen Edge
        if (this.getMaxY() == drawAreaHeight){
            this.height = this.height-1;
            this.width = this.width+2;
            this.translate(-1,0); // Sets Position of Rectangle
        }

        // Sets Position of Rectangle
        this.translate(0, 1);

    }
}
