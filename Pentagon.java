class Pentagon extends Shape{
	private int B;

	public Pentagon(int B){
		super("Pentagon",B);
	}

	public double computeArea(){
		return ((double)3*super.getEmvadon()/4);
	}
	public String toString(){
		return super.toString();
	}
}
