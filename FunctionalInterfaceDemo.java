package functionalInterface;

interface Demo{
    public void show();
}


public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        
        Demo d1 = ()-> System.out.println("Inside lamda function");
        d1.show();

        Demo d2 = new Demo() {
            public void show(){
                System.out.println("Inside anonymous class");
            }
        };
        d2.show();
    }
}
