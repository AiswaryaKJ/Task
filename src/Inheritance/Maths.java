package Inheritance;

class Number {
	int a=90;
	int b=80;

}
class add extends Number{
	void adding() {
		System.out.println(a+b);
	}
}
class sub extends Number{
	void subtract() {
		System.out.println(a-b);
	}
}
public class Maths{
	public static void main(String[] args) {
		add g=new add();
		sub s=new sub();
		g.adding();
		s.subtract();
	}
}