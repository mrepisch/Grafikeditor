package gra.main;
/**
 * TODO:Classdiscription
 * @author TODO: name eintragen
 * @version 1.0
 */
public class Figure {
	
	public final static int S_CIRCLE = 1;
	public final static int S_LINE = 2;
	public final static int S_RECTANGLE = 3;
	
    /** TODO: Memberdiscription **/
    private Vector2D position;

    /** TODO: Memberdiscription **/
    private int type;

    /** TODO: Memberdiscription **/
    public FigureModel figureModel;

    
    public Figure( Vector2D t_position, int TYPE) {
    	type = TYPE;
    	position = t_position;
    }
    
    
    int getType() {
        return this.type;
    }

    Vector2D getPosition() {
        return this.position;
    }

    void setPosition(Vector2D value) {
        this.position = value;
    }

   /**
    * TODO: Functiondiscription
    * @author TODO: nameeintragen
    * @param TODO: Parameter
    * @return TODO:return
    */
    public void paint() {
    }

}
