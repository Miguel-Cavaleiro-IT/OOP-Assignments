import java.util.Arrays;

public class Main{
	public static void main(String[] args)
	{
		Photo p = new Photo(600, 900, 300, "A beautiful sunset", Arrays.asList("Diogo", "Tiago", "Miguel"));
		System.out.println("Description: " + p.getDescription());
		System.out.println("Can it be printed = " + p.canBePrinted());
		System.out.println("Is it a group photo = " + p.isGroupPhoto());
	}
}