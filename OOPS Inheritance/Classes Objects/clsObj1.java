class Box
{
	int width;
	int height;
	int depth;
	Box(int w,int h,int d)
	{
		width=w;
		height=h;
		depth=d;
	}
	public void getVolume()
	{
		int vol=width*height*depth;
		System.out.println("volume is" + vol);	
	}
}
	
class clsObj1
{   
	public static void main(String[] args)
	{
		Box b=new Box(10,10,10);
		b.getVolume();
	}
}