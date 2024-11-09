
public class movie implements Cloneable {
	int movieId;
	String movieName;
	String moiveDirector;
	
	public movie(int movieId, String movieName, String moiveDirector) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.moiveDirector = moiveDirector;
	}
	@Override
	public String toString() {
		return "movie [movieId=" + movieId + ", movieName=" + movieName + ", moiveDirector=" + moiveDirector + "]";
	}
	//we want hashcode address own 
//	@Override//hashcode  can overirde
//	public int hashCode(){
//		return movieId;
//	}
//	
	@Override
    public Object clone() throws CloneNotSupportedException{
		return super.clone();

}

}