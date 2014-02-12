
public class Bulb
{
	public static final int DEFAULT_POWER = 100;
	private final int power;
	private boolean isLit;
	
	public Bulb()
	{
		this.power = DEFAULT_POWER;
		this.isLit = false;
	}
	public Bulb(int givenPower)
	{
		this.power = givenPower;
		this.isLit = false;
	}
	
	public void switchOn()
	{
		this.isLit = true;
	}
	public void switchOff()
	{
		this.isLit = false;
	}
	public int getPower()
	{
		return this.power;
	}
	public boolean isLit()
	{
		return this.isLit;
	}
}
