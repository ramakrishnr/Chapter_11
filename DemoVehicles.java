import javax.swing.*;
public class DemoVehicles {
    public static void main(String[] args) {
        Sailboat aSailboat = new Sailboat();
        Bicycle aBicycle = new Bicycle();

        JOptionPane.showMessageDialog(null,
         "\nVehicle descriptions:\n" +
         aSailboat.toString() + "\n" + aBicycle.toString());
    }
}
