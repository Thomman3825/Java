public class javaTwo{
    private String name;
    private int age;
    static String jr;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
   

    
}
class main{
    public static void main(String[] args) {
        javaTwo j1 = new javaTwo();
        j1.setName("alan vaali");
        j1.setAge(70);
        System.out.println(j1.getAge());
        System.out.println(j1.getName());
        javaTwo.jr = "Assc. Software Engineer";
        System.out.print(javaTwo.jr);
    }
}