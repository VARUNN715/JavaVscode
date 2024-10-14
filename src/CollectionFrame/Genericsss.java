package CollectionFrame;

import java.util.ArrayList;

public class Genericsss {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("1", "bruno");
        Dog<String> d2 = new Dog<>("2", "stuffy");
        Dog<String> d3 = new Dog<>("12", "hello");
        System.out.println(d1.id+":"+d1.name);
        // System.out.println(d2.id);
        System.out.println(d2.id+":"+d2.name);
        System.out.println(d3.getId());
        ArrayList<Integer> arr = new ArrayList<>();
        
    }
}

class Dog<E> {
    E id;
    E name;

    public Dog(E id, E name) { // constructors
        this.id = id;
        this.name = name;
    }
    public E getId(){
        return id;
    }
}
