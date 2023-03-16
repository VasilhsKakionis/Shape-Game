class Triangle extends Shape{
	private int B;

	public Triangle(int B){
		super("Triangle",B);
	}

	public double computeArea(){
		return ((double)super.getEmvadon()/2);
	}

	public String toString(){
		return super.toString();
	}
}
