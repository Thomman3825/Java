package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * CollectionsDemo
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        List <Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List");
        for (int i : list){
            System.out.println(i);
        }

        Set <Integer> set = new TreeSet<>();

        set.add(5);
        set.add(2);
        set.add(6);
        set.add(1);
        System.out.println("Set");
        for (int i : list){
            System.out.println(i);
        }

       
    }
}