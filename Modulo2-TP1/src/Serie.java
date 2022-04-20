
public class Serie {
//	attributes
	private String title;
	private int seasons;
	private String gender;
	private String creator;
	
	
//	methods
	public Serie() {
		// TODO Auto-generated constructor stub
	}
	
	public Serie(String title, int seasons, String gender, String creator) {
		
		this.title     = title;
		this.seasons = seasons;
		this.gender     = gender;
		this.creator    = creator;
	}

// 	setters	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
// 	getters
	public String getTitle() {
		return title;
	}
	
	public int getSeasons() {
		return seasons;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getCreator() {
		return creator;
	}
	
	public void show() {
		System.out.println("Título: " + this.title);
		System.out.println("Temporadas: " + this.seasons);
		System.out.println("Género: " + this.gender);
		System.out.println("Creador: " + this.creator);
	}
	
}
