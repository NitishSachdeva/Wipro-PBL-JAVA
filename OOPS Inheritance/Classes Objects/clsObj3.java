class patient
{
	private String patientName;
	private double width;
	private double height;
	public patient(String patientName,double width,double height)
	{
		this.patientName=patientName;
		this.width=width;
		this.height=height;
	}
	public double computeBMI()
	{	
		double bmi=width/(height*height);
		return bmi;
	}
	
}

class clsObj3
{   
	public static void main(String[] args)
	{
		patient p=new patient("xyz",62,54.5);
		System.out.println(p.patientName+"\t" + p.computeBMI());
	}
}