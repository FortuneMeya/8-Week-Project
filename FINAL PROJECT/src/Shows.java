
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
   
    	Shows show1 = new Shows("The Wire", "David Simon", "Drama", 57.48 );
    	Shows show2 = new Shows("The Sopranos", "David Simon", "Drama", 57.48 );
    	Shows show3 = new Shows("Breaking Bad", "David Simon", "Drama", 57.48 );
    	Shows show4 = new Shows("Snowfall", "David Simon", "Drama", 57.48 );
    	Shows show5 = new Shows("The Boondocks", "David Simon", "Drama", 57.48 );
    	Shows show6 = new Shows("Avatar:Last Airbender", "David Simon", "Drama", 57.48 );
    	Shows show7 = new Shows("Miami Vice", "David Simon", "Drama", 57.48 );
    	Shows show8 = new Shows("Survivor", "David Simon", "Drama", 57.48 );
    	Shows show9 = new Shows("Big Brother", "David Simon", "Drama", 57.48 );
    	Shows show10 = new Shows("Planet Earth", "David Simon", "Drama", 57.48 );
    	Shows show11= new Shows("Chenobyl", "David Simon", "Drama", 57.48 );
    	Shows show12= new Shows("Stranger Things", "David Simon", "Drama", 57.48 );
    	Shows show13= new Shows("Dark", "David Simon", "Drama", 57.48 );
    	Shows show14= new Shows("Lost", "David Simon", "Drama", 57.48 );
    	Shows show15= new Shows("The Twilight Zone", "David Simon", "Drama", 57.48 );
    	Shows show116= new Shows("Suits", "David Simon", "Drama", 57.48 );
    }
   }
}

    


