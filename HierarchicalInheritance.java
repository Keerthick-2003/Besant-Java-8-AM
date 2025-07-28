//parent class
class Tree {
    String tree;
    void grow() {
        System.out.println(tree + " is growing");
    }
}
//1st child class
class MangoTree extends Tree {
    void ProduceFruit() {
        System.out.println(tree + " is producing mangoes");
    }
}
//2nd child class
class JackFruitTree extends Tree {
    void ProduceFruit() {
        System.out.println(tree + " is producing jackfruits");
    }
}
//main class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        MangoTree mt = new MangoTree();
        mt.tree = "Mango Tree";
        mt.grow();  // this method from parent class
        mt.ProduceFruit();  //this from 1st child class

        JackFruitTree jft = new JackFruitTree();
        jft.tree = "Jackfruit Tree";
        jft.grow();  // this method from parent class
        jft.ProduceFruit();  //this from 2nd child class
    }  
}

