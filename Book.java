public abstract class Book {
    //fields
    private String title;
    private double price;
    
    //constructor
    public Book(String title) {
        this.title = title;
    }

    //mutator
    public abstract void setPrice();
    
    //accessor
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }

}
