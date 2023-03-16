import java.util.Random;
import java.lang.Math;
class ShapeGenerator{
	private int arithmos;

	public ShapeGenerator(int arithmos){
		this.arithmos = arithmos;
	}


	public boolean hasNextShape(){
		if (this.arithmos == 0){
			System.out.println("The shape generator hasn't shapes");
			return false;
		}
		System.out.println("The shape generator has shapes");
		return true;
	}

	public Shape nextShape(){
		int[] pinakas = {1, 2, 3, 4, 8, 12, 16};
		String[] shapes = {"Square","Triagle","Pentagon","Circle"};
		String shape = shapes[(int)(Math.random()*shapes.length)];
		Random random1 = new Random();		
		int random =  random1.nextInt(pinakas.length);
		if (this.hasNextShape()==true){
			this.arithmos--;
			if (shape == "Square"){
				Square square = new Square(pinakas[random]);
				return square;
			}else if (shape == "Triagle"){
				Triangle triangle = new Triangle(pinakas[random]);
				return triangle;
			}else if (shape == "Pentagon"){
				Pentagon pentagon = new Pentagon(pinakas[random]);
				return pentagon;
			}else{
				Circle circle = new Circle(pinakas[random]);
				return circle;
			}
		}else{
			return null;
		}
	}
}		
