//parent class
class Tree {
    String tree;
    void grow() {
        System.out.println(tree + " is growing");
    }
}
//child class
class MangoTree extends Tree {
    void ProduceFruit() {
        System.out.println(tree + " is producing mangoes");
    }
}
//main class
public class SingleInheritance {
    public static void main(String[] args) {
        MangoTree mt = new MangoTree();
        mt.tree = "Mango Tree";
        mt.grow();  // this method from parent class
        mt.ProduceFruit();  //this from child class
    }
}
