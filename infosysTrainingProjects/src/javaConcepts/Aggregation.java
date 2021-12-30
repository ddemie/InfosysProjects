package javaConcepts;
/
public class Aggregation {
	public static class Author {
		private String name;
		private String email;
		private char gender;
		
		public Author(String name, String email, char gender){
			this.name = name;
			this.email = email;
			this.gender = gender;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	}
	
	public static class Book {
		private String name;
		private Author author;
		private double price;
		private int quantity;
		
		public Book(String name, Author author, double price, int quantity){
			this.name = name;
			this.author = author;
			this.price = price;
			this.quantity = quantity;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Author getAuthor() {
			return author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public void displayAuthorDetails() {
			System.out.println("Displaying author details");
			System.out.println("Author name: " + author.getName());
			System.out.println("Author email: " + author.getEmail());
			System.out.println("Author gender: " + author.getGender());
		}

	}
	
	public static class AggregationMainMethod {

		public static void main(String[] args) {
			Author author1 = new Author("Joshua Bloch", "joshua@email.com", 'M');
			
			Book book1 = new Book("Effective Java", author1, 45, 15);
			
			book1.displayAuthorDetails();

		}

	}

}
