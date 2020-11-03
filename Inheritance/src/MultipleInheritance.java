class x
{
	int a = 1 ;
	int b = 12 ;
	int add()
	{
		int res =a+b;
		return res ;
	}
}
class y extends x
{
	int c = 13 ;
	int add()
	{
		int resy = a+b + c ;
		return resy ;
	}
}
class z extends y
{
	int  d = 14 ;
	int add()
	{
		int resz = a+b+c+d;
		return resz ;
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		z obj = new z() ;
		int resz = obj.add() ;
		System.out.println(resz);

	}

}
