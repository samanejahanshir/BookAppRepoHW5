public class BookArray {
    Book[] books = new Book[10];

    public BookArray() {
        books[0] = new Fiction("Alice");
        books[1] = new Fiction("Suvashun");
        books[2] = new Fiction("The Prince");
        books[3] = new Fiction("The Warrior");
        books[4] = new Fiction("Harry Potter");
        books[5] = new NonFiction("Hiroshima");
        books[6] = new NonFiction("Black Boy");
        books[7] = new NonFiction("My Early Life");
        books[8] = new NonFiction("Brief Lives");
        books[9] = new NonFiction("On Liberty");
    }


    public  void showBook() {
        System.out.println("---------- Books ---------");

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
        System.out.println("--------------------------");

    }
}
