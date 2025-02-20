
public class TameFlowers extends Plants
{
	protected int flowerTotal = 0;
	
	public TameFlowers()
	{
		System.out.println("Tame flowers grow in everyday gardens.");
	}

	public void plantFlower()
	  {
		System.out.println("You planted a tulip!");
		species = "tulip";
		flowerTotal++;
	  }
	
	public void getFlowerTotal()
	{
		System.out.println("You have planted "+flowerTotal+" flowers!");
	}
	
	public void beEaten()
	{
		System.out.println("Tippie-toe! A ladybug is climbing up your stem!");
	}
}
