public class Main{
	public static void main(String[] args)
	{
		Book b = new Book(9781794710177L, "A Mensagem", "Fernando Pessoa", "Parceria António Maria Pereira", true, 92);
		
		b.setPrice(30);
		
		System.out.println("Title = " + b.getTitle());
		System.out.println("Author = " + b.getAuthor());
		System.out.println("Publisher = " + b.getPublisher());
		 System.out.println("Price = " + b.getPrice() + "$");
		System.out.println("Is it hardcover = " + b.getIsHardcover());
		System.out.println("Number of pagees = " + b.getNumberOfPages());
		System.out.println("Times Read = " + b.getNumberOfTimesRead());
		System.out.println("Read time (minutes) = " + b.timeToRead());
		System.out.println("Should I read it now = " + b.shouldRead());
	}
}