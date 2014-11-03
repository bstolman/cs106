public class Track {
	//Defining each value in relation to its function (int or String).
	public static int values;
	int number;
	int time;
	String artist;
	String song;
	//Creating a class for the variables - using 'this' so I can use the same name for everything
	public Track(int number, int time, String artist, String song) {
		this.number = number;
		this.time = time;
		this.artist = artist;
		this.song = song;
	}
	//Return String
	public String toString() {
		return this.number + "\t" + this.time + "\t" + this.artist + "\t"
				+ this.song + "\t";
	}
}