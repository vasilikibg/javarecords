import java.util.Scanner;
import java.util.ArrayList;

public class Artist extends Person {
	static Scanner sc = new Scanner(System.in);
	ArrayList<String> wannabeAlbum = new ArrayList<String>();
	private double rating;
	private double relevancyIndex;
	private Timeline timeline;
	private String genre;
	private double payPercentage;
	
	public Artist(String username, String password, double rating, double relevancyIndex, Album[] albums,
			Timeline timeline, String genre, double payPercentage) {
		super(username,password);
		this.username = username;
		this.password = password;
		this.rating = rating;
		this.relevancyIndex = relevancyIndex;
		this.albums = albums;
		this.timeline = timeline;
		this.genre = genre;
		this.payPercentage = payPercentage;
	}

	@Override
	public String toString() {
		return "Artist [username=" + username + ", password=" + password + ", rating=" + rating + ", relevancyIndex="
				+ relevancyIndex + ", genre=" + genre + ", payPercentage=" + payPercentage + "]";
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getRelevancyIndex() {
		return relevancyIndex;
	}

	public void setRelevancyIndex(double relevancyIndex) {
		this.relevancyIndex = relevancyIndex;
	}

	public Timeline getTimeline() {
		return timeline;
	}

	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPayPercentage() {
		return payPercentage;
	}

	public void setPayPercentage(double payPercentage) {
		this.payPercentage = payPercentage;
	}
	
	
	public int calculateRating() {
		
	} 
	
	//Artist creates list of songs/wannabe album that he has in mind to create//
	public String registerAlbum () {
		System.out.println("Insert album name: ");
		String name = sc.nextLine();
		wannabeAlbum.add(name);       //first line of list is the album name//
		String answer  = "no"; 
		do {
			System.out.println("Insert song name: ");
			name = sc.nextLine();
			wannabeAlbum.add(name);
			System.out.println("Insert another song name, yes or no;");
		    answer = sc.nextLine();
		} while (answer == "yes");		
	}
	
	public void showRatings() {
		for (int p = 0; p < Album.size(); p++) {
			System.out.println("The popularity of each song by artist " + username + "is: " + Song.Popularity(p)); //p η σειρα του καθε τραγουδιου//
			}
		for (int l =0; l < numberOfAlbums; l++) {
			System.out.println("The popularity of each album by artist " + username + "is: " +  Album.getPopularity);
		}
	}
	
	public double popularityOfAlbums() {
		double allAlbumsPopularity = 0;
		for(int i = 1;i <= numberOfAlbums;i++) {
			allAlbumsPopularity += Album.getPopularity;
		}
		for (int o = 0; o < Album.size(); o++) {
			
		}
		
		
		double pop = albumPopularity/numberOfAlbums; //χρηση του σταθμισμενου μεσου ορου//
		return pop;
	}
	
	ArrayList<String> artistsPerformances = new ArrayList<String>();
	public ArrayList<String> myPerfomances() {
		//με βαση την κλαση performance παιρνω το ημερολογιο//
		return artistsPerformances.contains();
	}
}

