import java.util.Scanner;
import java.lang.Math;
class Player{
	private int size;
	private Shape [] stack;
	private double points;
	private int flag = -1;
		
	public Player(int size){
		this.size = size;
		stack = new Shape[size];
	}
	
	public void Play(Shape shape){
		if (stack[0] == null){
			points = Math.round(points * 100.0) / 100.0;
			System.out.println("Your score : "+ points);
		}else{
			System.out.println("The last shape is ");
			System.out.println(stack[flag].toString());
			points = Math.round(points * 100.0) / 100.0;
			System.out.println("Your Score : "+ points);
		}
		System.out.println("The next shape is ");
		System.out.println(shape.toString());
		System.out.println("If you want the shape press y");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.next();
		if (option.equals("y")){
			flag++;
			stack[flag] = shape;
			if (flag == 0){
				points = points + shape.computeArea();
			}else{
				int flag1 = 0;
				int flag2 = 0;
				if (shape.sameArea(stack[flag-1]) && stack[0] != null){
					flag1 = 1;
					points = points + 10*shape.computeArea();
				}
				if (shape.sameType(stack[flag-1]) && stack[0] != null){
					flag2 = 2;
					points = points + shape.computeArea();
					stack[flag-1]= null;
					stack[flag]=null;
					flag = flag -2;
				}
				if (flag1 == 0 && flag2 == 0){
					points = points + shape.computeArea();
				}
			}
		}
		points = Math.round(points * 100.0) / 100.0;
		System.out.println("Your score is : " + points);
				
	}

	public boolean isStackFull(){
		int count = 0;
		for (int i = 0; i < size; i++){
			if (stack[i] != null){
				count++;
			}
		}
		if (count == size){
			System.out.println("The stack is full");
			return true;
		}else{
			System.out.println("The stack isn't full");
			return false;
		}
	}

	public String printInfo(){
		return ("The stack is: " + stack + " and the player's points are: " + points);
	}
}
	
