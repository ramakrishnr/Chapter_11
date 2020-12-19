import javax.swing.*;

public class Sailboat extends Vehicle {
    //fields
    private int length;

    //constructos
    public Sailboat(String powerSource, int wheels) {
        super("wind", 0);
        setLength();
    }

    //mutators
    public void setLength() {
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat length in feet ");
        length = Integer.parseInt(entry);
    }
    @Override
    public void setPrice() {
        String entry;
        final int MAX = 100_000;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat price ");
        price = Integer.parseInt(entry);
        
        if (price > MAX) {
            price = MAX;
        }
    }

    //accessor
    public int getLength() {
        return length;
    }
    
}
