interface X
{
	int a=100;
	void add();
	void sub();
}
interface  Y 
{
	int b=200;
	void mul();
	void div();
	
}
interface Z extends X,Y
{

}
class Cal implements Z
{
	public void sub(){ System.out.println(X.a - Y.b);}
	public void add(){  System.out.println(X.a + Y.b);}
	public void div(){  System.out.println(X.a / Y.b);}
	public void mul(){  System.out.println(X.a * Y.b);}
}
class DemoINterface
{
	public static void main(String args[])
	{
		Cal c1=new Cal();
		//c1.add();c1.sub();c1.mul();c1.div();
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		X x1=c1;
		x1.add();
		x1.sub();
		//x1.mul();
		//x1.div();
		System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYy");
		Y y1=c1;
		//y1.add();
		//y1.sub();
		y1.mul();
		y1.div();
			System.out.println("ZZZZZZZZZZZZZZZZZZZZZZz");
		Z z1=c1;
		z1.add();
		z1.sub();
		z1.mul();
		z1.div();
	}
}