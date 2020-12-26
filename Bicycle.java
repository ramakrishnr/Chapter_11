import javax.swing.*;

public class Bicycle extends Vehicle {
    //fields
    //construtor
    public Bicycle() {
        super("a person", 2);
    }
    //mutator
    @Override
    public void setPrice() {
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog(null, "Enter bicycle price ");
        price = Integer.parseInt(entry);
        if (price > MAX) {
            price = MAX;
        }
    }
    //accessor
    //methods
    @Override
    public String toString()
    {
         return("The bicycle is powered by " + getPowerSource() +
            "; it has " + getWheels() + " wheels and costs $" +
            getPrice());
    }
}
