
public class Wildflowers extends Plants
{

	String habitat;
	
	public Wildflowers()
	{
		System.out.println("Wildflowers grow out in nature.");
		species = "columbine";
		habitat = "forest";
	}
	
	public void stormyWeather()
	{
		System.out.println("Wildflowers adapt to survive stormy weather.");
		species = "indian paintbrush";
		habitat = "snowy mountains";
	}
	
	public void getClimate()
	{
		System.out.println("This "+species+" is growing in the "+habitat);
	}
 
    public void beEaten()
    {
	    System.out.println("Chomp, chomp, chomp! A chipmunk is chewing on this flower!");
    }
    
    public void test()
    {
    	System.out.println(super.beEaten());
    
    }
 
 
}
