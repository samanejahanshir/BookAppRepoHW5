public class UseBook {
    public static void main(String[] args) {
        Book bookFiction=new Fiction("Sandbad");
        Book bookNonFiction=new NonFiction("Secret");
        System.out.println(bookFiction.toString());
        System.out.println(bookNonFiction.toString());
        BookArray bookArray = new BookArray();
        bookArray.showBook();

    }
}
