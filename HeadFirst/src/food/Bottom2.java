package food;

class Top
{
	/*
	public Top()
	{
		
	}
	*/
	public Top(String s)
	{
		System.out.println("B");
	}
	
}

public class Bottom2 extends Top{
	
	public Bottom2(String name)
	{
		super("H");
		System.out.println("D");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*new Bottom2("C");
    System.out.println(" ");
    
    byte a=2;
    byte b=3;
    byte c=(byte) (a+b);
    
    
    float f=100.001f;
    int h=(int) f;
    
    double d=100.001;
    int h1=(int) d;
    
    double d1=100L;
    
    
    Long l=(long) 100.00;
    int i=(int) 10.99f;
    
    float f1=3.2F;
    */
    byte b1=12;
    b1+=5;
    System.out.println(b1);
	}

}
