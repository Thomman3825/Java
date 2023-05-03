package interfacedemo;


interface vehicle{
    public void gearbox();
    public void aspiration();

}

interface assembly{
    public void assemebledOrNot();
}
class ford implements vehicle, assembly{
    @Override
    public void gearbox() {
        System.out.println("5 speed manual");
    }

    @Override
    public void aspiration() {
        System.out.println("Naturally Asprirated");
    }
    @Override
    public void assemebledOrNot() {
        System.out.println("Assembled in India");
    }
    
    public void start(){
        System.out.println("Car started");
    }


}

public class InterfaceDemo {
    public static void main(String[] args) {
        ford v1 = new ford();
        v1.aspiration();
        v1.gearbox();
        v1.assemebledOrNot();
        v1.start();

    }
}
