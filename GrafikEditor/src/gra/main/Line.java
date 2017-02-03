package gra.main;
/**
 * TODO:Classdiscription
 * @author TODO: name eintragen
 * @version 1.0
 */
public class Line extends Figure {
    /** TODO: Memberdiscription **/
    protected Vector2D endPoint;
    
    public Line( Vector2D t_start, Vector2D end) {
    	super(t_start, S_LINE);
    }
    
    public Vector2D getEndPoint() {
    	return endPoint;
    }

}
