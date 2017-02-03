package gra.main;
class Circle extends Figure {
    /** TODO: Memberdiscription **/
    protected int radius;

    public Circle( Vector2D pos, int radius) {
    	super(pos, S_CIRCLE);
    	this.radius = radius;
    	
   }
    
    int getRadius() {
        return this.radius;
    }

    void setRadius(int value) {
        this.radius = value;
    }

}
