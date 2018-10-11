class Add{
	int add(int a,int b) {
		b=a+b;
		return b;
	}
	public static void main(String args[]) {
		Add a=new Add();
		int x;
		x=a.add(2,7);
		System.out.println(x);
		
	}
}
