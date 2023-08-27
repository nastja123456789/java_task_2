public class Main {
    public static void main(String[] args) {
        Author author=new Author("Ivan Ivanov",
                "i.ivanov@somewhere.com", 'm');
        Book book=new Book("Test", author, 1001.00, 10);
        System.out.println("Book name: " + book.getName());
        System.out.println("Author: " + book.getAuthor().toString());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Quantity: " + book.getQty());
        System.out.println("Book details: " + book.toString());
    }
}
