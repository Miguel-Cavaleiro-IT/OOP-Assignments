public class Book
{
	private long isbnNumber;
	private String title;
	private String author;
	private String publisher;
	private boolean isHardcover;
	private double price;
	private int numberOfPages;
	private int numberOfTimesRead;
	
	public Book(long isbnNumber, String title, String author, String publisher, boolean isHardcover, int numberOfPages)
	{
		this.isbnNumber = isbnNumber;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isHardcover = isHardcover;
		this.numberOfPages = numberOfPages;
		this.numberOfTimesRead = 0;
	}
	
	public double timeToRead()
	{
		return numberOfPages / 0.8;
	}
	
	public String shouldRead()
	{
		double time = timeToRead();
        if (time < 60) {
            return "You can read this.";
        } else if (time <= 240) {
            return "Are you sure you want to read this now?";
        } else {
            return "You should not start reading this right now.";
        }
	}
	
	public void newRead()
	{
		numberOfTimesRead++;
	}
	
	public long getIsbnNumber()
	{
		return isbnNumber;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public boolean getIsHardcover()
	{
		return isHardcover;
	}
	
	public int getNumberOfPages()
	{
		return numberOfPages;
	}
	
	public int getNumberOfTimesRead()
	{
		return numberOfTimesRead;
	}
	
	public double getPrice() {
        return price;
    }
	
	public void setPrice(double price)
	{
		this.price = price;
	}
}