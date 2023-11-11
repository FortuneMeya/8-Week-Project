import java.util.ArrayList;

public class Shows extends Guide {


		private String producer;	
		
	
    public Shows(String title, String producer, String genre, double price)
    {
    	super(title, genre,price);
    	this.producer = producer;
    	
}
    public String getProducer() {
    	return producer;
    }
    
    public void setProducer(String producer) {
    	this.producer= producer;
    }
   
    
   public class Mainm{
    public static void main(String[] args) {
    	Cart carts = new Cart();
    	ArrayList<Shows> ShowsList = new ArrayList<>();
    	ShowsList.add(new Shows("The Wire", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("The Sopranos", "David Chase", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Breaking Bad", "Vance Gilligan", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Snowfall", "Nicolas Stern", "Drama", 57.48 ));
    	ShowsList.add(new Shows("The Boondocks", "", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Avatar:Last Airbender", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Miami Vice", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Survivor", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Big Brother", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Planet Earth", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Chenobyl", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Stranger Things", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Dark", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Lost", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("The Twilight Zone", "David Simon", "Drama", 57.48 ));
    	ShowsList.add(new Shows("Suits", "David Simon", "Drama", 57.48 ));
    	
    	for (int i =0; i < ShowsList.size(); i++) {
    		Shows show = ShowsList.get(i);
    	
    	carts.addShow(show);
    	carts.removeShows(show);
    }
   }
   }
}

    


