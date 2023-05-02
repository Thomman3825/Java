public class Calc {
    public void display() {
        System.out.println("In calc");
    }

    public static void main(String[] args) {
        Calc c1= new Calc();
        BasicCalc bc1 = new BasicCalc();
        AdvCalc ac1 = new AdvCalc();

        c1.display();

        bc1.display();
        bc1.add(2, 3);

        ac1.display();
        ac1.mul(2, 3);
        ac1.add(3, 4);
    }
}
class BasicCalc{
public void add(int a, int b) {
    System.out.println(a+b);
}
public void display() {
    System.out.println("In basic calc");
}
}
class AdvCalc extends BasicCalc{ //inheritance
    public void mul(int a, int b) {
        System.out.println(a*b);
    }
    //overridding 
    public void display(){
        System.out.println("In adv calc");
    }
}
