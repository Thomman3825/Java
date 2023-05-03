package abstractDemo;

abstract class vehicle{
    abstract public void gearbox();

    abstract public void aspriration();

    public void idle(){
        System.out.println("Car idling");
    }

    public void drive(){
        System.out.println("Car is driven");
    }
}

class ford extends vehicle{
    @Override
    public void gearbox() {
        System.out.println("Manual 5 speed");
    }
    @Override
    public void aspriration() {
        System.out.println("Naturally Aspirated");
    }
}

class vw extends vehicle{
    @Override
    public void gearbox() {
        System.out.println("DSG 7");
        
    }
    @Override
    public void aspriration() {
        System.out.println("Turbo");
    }
}



public class AbstractDemo {
    public static void main(String[] args) {
        ford v1 = new ford();
        vw v2 = new vw();

        v1.aspriration();
        v1.gearbox();
        v1.drive();
        v1.idle();

        v2.aspriration();
        v2.gearbox();
        v2.drive();
        v2.idle();
    }
}
