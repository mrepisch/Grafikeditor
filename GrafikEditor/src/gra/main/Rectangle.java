package gra.main;
/**
 * TODO:Classdiscription
 * @author TODO: name eintragen
 * @version 1.0
 */
public class Rectangle extends Figure {
    /** TODO: Memberdiscription **/
    protected Vector2D m_dimensions;

    public Rectangle(Vector2D t_position, Vector2D t_dim, int TYPE) {
    	super(t_position, S_RECTANGLE);
    	m_dimensions = t_dim;
    }
    
    void setDimensins(Vector2D value) {
        // Automatically generated method. Please delete this comment before entering specific code.
    	m_dimensions = value;
    }

    Vector2D getDimensins() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return m_dimensions;
    }

}
