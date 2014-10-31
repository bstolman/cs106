
public class Track {
	int number;
	String time;
	String artist;
	String song;

	public Track(int number,String time, String artist, String song) {
		this.number = number;
		this.time = time;
		this.artist = artist;
		this.song = song;
	}


	public String toString() {
		return this.number + "\t" + this.time + "\t" + this.artist + "\t" + this.song + "\t";
	}
}
