
public class Main
{
	public static void main(String[] args)
	{
		Bulb bulbizarre = new Bulb();
		System.out.println(bulbizarre.getPower());
		System.out.println(bulbizarre.isLit());
		bulbizarre.switchOn();
		System.out.println(bulbizarre.isLit());
		
		Bulb bulbop = new Bulb(65);
		System.out.println(bulbop.getPower());
		System.out.println(bulbop.isLit());
		bulbop.switchOn();
		System.out.println(bulbop.isLit());
		bulbop.switchOff();
		System.out.println(bulbop.isLit());
	}
}
