package exam3;

public class Example2 {
	public static void main(String[] args) {
		ChildTwo two = new ChildTwo();
		two.method1();
		two.method2();
	}
}

interface Parent{
	void method1();
	void method2();
}

abstract class ChildOne implements Parent{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}

class ChildTwo extends ChildOne{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}