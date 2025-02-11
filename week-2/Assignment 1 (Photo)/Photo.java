import java.util.List;

public class Photo
{
	private int lengthInPixels;
	private int widthInPixels;
	private int dpi;
	private String description;
	private List<String> peopleInPicture;
	
	public Photo(int lengthInPixels, int widthInPixels, int dpi, String description, List<String> peopleInPicture)
	{
		this.lengthInPixels = lengthInPixels;
		this.widthInPixels = widthInPixels;
		this.dpi = dpi;
		this.description = description;
		this.peopleInPicture = peopleInPicture;
	}
	
	public boolean canBePrinted()
	{
		return dpi >= 150 && lengthInPixels >= 585 && widthInPixels >= 878;
	}
	
	public int getLengthInPixels()
	{
		return lengthInPixels;
	}
	
	public int getWidthInPixels()
	{
		return widthInPixels;
	}
	
	public int getDpi()
	{
		return dpi;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public List<String> getPeopleInPicture()
	{
		return peopleInPicture;
	}
	
	public boolean isGroupPhoto()
	{
		return peopleInPicture.size() > 2;
	}
	
	
}