// Abstraction.java
// This code demonstrates the concept of abstraction in Java using an abstract class and method.
// uses
// an abstract class Tree with an abstract method produceFruit, and a concrete class MangoTree that extends Tree.
// The MangoTree class provides an implementation for the produceFruit method.
// The main method creates an instance of MangoTree and calls its methods to demonstrate abstraction.
// Abstraction is a fundamental concept in object-oriented programming that allows you to hide complex implementation details and expose only the necessary parts of an object.
// This helps in reducing complexity and increasing efficiency in code management.

abstract class Tree{
    String tree;

    abstract void produceFruit();  //abstract method

    void grow(){
        System.out.println(tree+" is growing");
    }
}

class MangoTree extends Tree{
    MangoTree(String tree) {
        this.tree = tree;
    }
    @Override
    void produceFruit() {
        System.out.println(tree + " produces mangoes.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        MangoTree mt = new MangoTree("Mango Tree");
        mt.grow();
        mt.produceFruit();
        
    }
}