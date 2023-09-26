import com.workintech.Home.*;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("sag");
        Wall wall2 = new Wall("sol");
        Wall wall3 = new Wall("arka");
        Wall wall4 = new Wall("ön");
        Ceiling ceiling= new Ceiling(10, PaintColor.GREY);
        Bed bed = new Bed("King Size",2,1,3,2);
        Lamp lamp = new Lamp(LampType.LED,true,4);
        Wardrobe wardrobe = new Wardrobe(2,1,8.6);
        Carpet carpet= new Carpet(1,1,PaintColor.BLUE);
        Bedroom bedroom = new Bedroom("Main Bedroom",wall1,wall2,wall3,wall4,ceiling,bed,lamp,wardrobe,carpet);

        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Wall1 Duvar Yönü: " +bedroom.getWall1().getDirection());
        System.out.println("Wall2 Duvar Yönü: " +bedroom.getWall2().getDirection());
        System.out.println("Wall3 Duvar Yönü: " +bedroom.getWall3().getDirection());
        System.out.println("Wall4 Duvar Yönü: " +bedroom.getWall4().getDirection());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Bed Size: " + bedroom.getBed().getPillows());
        System.out.println("Lamp: " + bedroom.getLamp().getGlobRating());
        System.out.println("Wardrobe Height: " + bedroom.getWardrobe().getHeight());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());

    }
}