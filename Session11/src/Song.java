
public class Song {

	String track;
	String artists;
	float duration;
	
	//Reference variables
	Song nextSong;
	Song previousSong;
	
	
	Song(){
		
	}
	
	Song(String track, String artists, float duration) {
		this.track = track;
		this.artists = artists;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [name=" + track + ", artists=" + artists + ", duration=" + duration + "]";
	}
	
	void showSong() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(track+"\t"+artists+"\t"+duration+"\t");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
		
	}
	
	
	
	
}
