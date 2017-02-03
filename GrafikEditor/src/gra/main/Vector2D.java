package gra.main;
/**
 * TODO:Classdiscription
 * @author TODO: name eintragen
 * @version 1.0
 */
public class Vector2D {
    /** Positionen innerhalb des Vecotrs **/
    private int m_position[] = new int[2];

   /**
    * TODO: Functiondiscription
    * @author TODO: nameeintragen
    * @param TODO: Parameter
    * @return TODO:return
    */
    public Vector2D(int x, int y) {
    	m_position[0] = x;
    	m_position[1] = y;
    }

   /**
    * TODO: Functiondiscription
    * @author TODO: nameeintragen
    * @param TODO: Parameter
    * @return TODO:return
    */
    public Vector2D(Vector2D other) {
    	m_position[0] = other.getX();
    	m_position[1] = other.getY();
    }

   /**
    * TODO: Functiondiscription
    * @author TODO: nameeintragen
    * @param TODO: Parameter
    * @return TODO:return
    */
    public int getX() {
    	return m_position[0];
    }

   /**
    * TODO: Functiondiscription
    * @author TODO: nameeintragen
    * @param TODO: Parameter
    * @return TODO:return
    */
    public int getY() {
    	return m_position[1];
    }

   /**
    * TODO: Functiondiscription
    * @author TODO: nameeintragen
    * @param TODO: Parameter
    * @return TODO:return
    */
    public void setX(int x) {
    	m_position[0] = x;
    }

   /**
    * TODO: Functiondiscription
    * @author TODO: nameeintragen
    * @param TODO: Parameter
    * @return TODO:return
    */
    public void setY(int y) {
    	m_position[1] = y;
    }

   /**
    * TODO: Functiondiscription
    * @author TODO: nameeintragen
    * @param TODO: Parameter
    * @return TODO:return
    */
    public final void addToVector(int x, int y) {
    	m_position[0] = m_position[0] + x;
    	m_position[1] = m_position[1] + y;
    }

}
