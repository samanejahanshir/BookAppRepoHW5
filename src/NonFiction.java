public class NonFiction extends Book {
    private double price;

    public NonFiction(String title) {
        super(title);
        setPrice();
    }


    @Override
    public void setPrice() {
        super.price = 37.99;
    }
}
