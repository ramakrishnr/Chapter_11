public abstract class Book {
    //fields
    private String title;
    protected double price;
    private int chapter;
    
    //constructor
    public Book(String title, int chapter, double price) {
        this.title = title;
        this.chapter = chapter;
        this.price = price;
    }

    //mutator
    //public abstract void setPrice();
    // public void setPrice(double price) {
    //     this.price = price;
    // }
    
    
    //accessor
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public int getChapter() {
        return chapter;
    }

    //method
    public void display() {
        System.out.println(getTitle() + " " + getPrice() + " " + getChapter());
    }
}
