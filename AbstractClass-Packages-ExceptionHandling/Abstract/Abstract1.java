abstract class GeneralBank
{
	public abstract double getSavingsInterestRate(); 
	public abstract double getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank
{
	public double getSavingsInterestRate()
	{
		return 0.04;
	}
	public double getFixedDepositInterestRate()
	{
		return 0.085;
	}
}
class KotMBank extends GeneralBank
{
	public double getSavingsInterestRate()
	{
		return 0.06;
	}
	public double getFixedDepositInterestRate()
	{
		return 0.09;
	}
}
class Abstract1
{	
public static void main(String[] args)
{
	ICICIBank i=new ICICIBank();
	KotMBank k=new KotMBank();
	
	 System.out.println(i.getSavingsInterestRate()*100 + "%");
     System.out.println(i.getFixedDepositInterestRate()*100 + "%");
     System.out.println(k.getSavingsInterestRate()*100 + "%");
     System.out.println(k.getFixedDepositInterestRate()*100 + "%");
	 System.out.println();
	 
	 GeneralBank g1=new ICICIBank();
	 System.out.println(g1.getSavingsInterestRate()*100 + "%");
     System.out.println(g1.getFixedDepositInterestRate()*100 + "%");
     System.out.println();
	 GeneralBank g2=new KotMBank();
	 System.out.println(g2.getSavingsInterestRate()*100 + "%");
     System.out.println(g2.getFixedDepositInterestRate()*100 + "%");



}
}