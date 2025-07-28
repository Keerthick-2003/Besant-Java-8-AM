//parent class
class Tree {
    String tree;
    void grow() {
        System.out.println(tree + " is Growing");
     }
}
//child class 1

class MangoTree extends Tree {
   public void produceFruit() {
        System.out.println(tree + " is producing mangoes");
    }
}
//child class 2

class SpecialMango extends MangoTree {
   public void produceFruit() {
        super.produceFruit();
        System.out.println("This " + tree + " is producing special mangoes");
    }

    void specialMangoFruit() {
        System.out.println("This " + tree + " Fruit is very tasty");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        SpecialMango sm = new SpecialMango();
        sm.tree = "Mango Tree";
        sm.grow();
        sm.produceFruit();
        sm.specialMangoFruit();
    }
}
