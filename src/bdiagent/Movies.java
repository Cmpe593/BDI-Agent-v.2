package bdiagent;

public class Movies extends Event {
	private int movieID;
	public Movies(int id) {
		this.movieID=id;
	}
	
	public int getMovieID() {
		return this.movieID;
	}
	public void setMovieID(int value) {
		this.movieID=value;
		
	}
}
