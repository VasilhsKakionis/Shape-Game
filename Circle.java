import java.lang.Math;

class Circle extends Shape{
	private int B;

	public Circle(int B){
		super("Circle",B);
	}

	public double computeArea(){
		return ((double)Math.PI*super.getEmvadon()/4);
	}

	public String toString(){
		return super.toString();
	}
}
