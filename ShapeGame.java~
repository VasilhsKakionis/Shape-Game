import java.util.Scanner;
class ShapeGame{
	public static void main(String []args){
		System.out.print("Give me the size of the stack : ");
		Scanner scanner1 = new Scanner(System.in);
		int size1 = scanner1.nextInt();
		Player player = new Player(size1);
		System.out.println();
		System.out.print("Give me the number of shapes: ");
		int size2 = scanner1.nextInt();
		ShapeGenerator generator = new ShapeGenerator(size2);
		for (int i= 0 ; i < size2; i++)
		{
			Shape shape1 = generator.nextShape();
			player.Play(shape1);
			if (player.isStackFull()){
				break;
			}
		}
		System.out.println("The Game Is Ended!");
	}
}
