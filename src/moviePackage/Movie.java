package moviePackage;

public class Movie {
	
	private String title;
	private String category;
	
	public Movie(String x, String y){
		title = x;
		category = y;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void printTitle()
	{
		System.out.println(getTitle());	
	}
}
