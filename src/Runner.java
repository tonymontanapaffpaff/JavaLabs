import by.gsu.pms.Material;
import by.gsu.pms.Subject;

public class Runner {

    public static void main(String[] args) {
        final Material STEEL = new Material("steel", 7850.0);
        Subject wire = new Subject("wire", STEEL, 0.03);

        System.out.println(wire);

        final Material COPPER = new Material("copper", 8500);
        wire.setMaterial(COPPER);
        System.out.println("The wire mass is " + wire.getMass() + " kg.");
    }
}