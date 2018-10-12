class Add{
	int add(int a,int b) {
		b=a+b;
		System.out.println("End of function");
		return b;
		
	}
	public static void main(String args[]) {
		Add a=new Add();
		int x;
		x=a.add(2,7);
		System.out.println(x);
		System.out.println("End of program add.java function");
		System.out.println("testing");
		
 	}
}
