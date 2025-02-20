
public class Wildflowers extends Plants
{
	String habitat;
	
	public Wildflowers()
	{
		System.out.println("Wildflowers grow out in nature.");
		species = "columbine";
		habitat = "forest";
	}
	
	//abstracted method
	public void getHabitat()
	{
		System.out.println("This "+species+" is growing in the "+habitat+".");
	}
 
    public void beEaten()
    {
	    System.out.println("Chomp, chomp, chomp! A chipmunk is chewing on this flower!");
    }
    
    //calls the superclass version of the overridden method
    public void callSuper()
    {
    	super.beEaten();
    }
 
}
