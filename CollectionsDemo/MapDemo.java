package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

class Employee{
    String name;
    int salary;
}
public class MapDemo {

    Employee e1  = new Employee();
    public static void main(String[] args) {
        Map <String, Integer> emp = new HashMap<>();
        emp.put("Alan", 11111111);
        emp.put("Sagar", 222222);

        System.out.println(emp);
        System.out.println(emp.get("Alan"));

        // for (String name : emp.keySet() ){
        //     for (int salary : emp.values()){
        //         System.out.println(name + "---" + salary);
        //     }
        // }

        // for (int  i =0; i <emp.size(); i++){
        //     System.out.println(emp.get(emp));
        // }

        for (String name: emp.keySet()){
            System.out.println(name+"---"+emp.get(name));
        }
    }
}
