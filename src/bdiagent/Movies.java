package bdiagent;

import java.util.Random;

public class Movies extends Event {
	 int movieID;
	 String Type;
	 String filmTypes ;
	public Movies(int id) {
		Random random = new Random();
		
		this.movieID=id;
		this.where = "Amsterdam";
		this.day = random.nextInt(6)+16;
		this.month = 7;
		this.type = "Entertainment";
		this.eventType = "Movies";
		boolean temp =random.nextBoolean();
		if(temp){
			this.period = "Day";
		}else{
			this.period = "Night";
		}
		this.filmTypes = typeMaker(random.nextInt(10));
		this.explanation = "Movie "+movieID+" and type: "+ filmTypes ; 
		
	}
	private static String typeMaker (int key) {
		switch (key) {
		
		case 0:
			return "Horror" ;
			
		case 1:
			return "Comedy" ;
				
		case 2:
			return "Action" ;
			
		case 3:
			return "War" ;
			
		case 4:
			return "Sport" ;
			
		case 5:
			return "Drama" ;
			
		case 6:
			return "Adventure" ;
			
		case 7:
			return "Sci-Fi" ;
			
		case 8:
			return "Animation" ;
			
		case 9:
			return "Documentary" ;
			
		default:
			return "Family" ;
			
		}
	}
	@Override 
	public void filldata(){
		
	}
	public int getMovieID() {
		return this.movieID;
	}
	public void setMovieID(int value) {
		this.movieID=value;
		
	}
	
}
