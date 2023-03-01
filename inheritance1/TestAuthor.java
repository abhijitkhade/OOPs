package inheritance1;

public class TestAuthor {
public static void main(String[] args) {
	
	Author author= new Author("jon",42,"USA");
	Book b= new Book("java",800,author);
	System.out.println(author);
	System.out.println(b);
}

}
