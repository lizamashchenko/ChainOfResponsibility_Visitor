package main;

public class Main {
    public static void main(String[] args) {
        Signature signature1 = new SignatureWithStamp("sig1", "stamp1");
        Signature signature2 = new SignatureWithStamp("sig2", "stamp2");
        Signature signature3 = new SignatureWithStamp("sig3", "stamp3");

        Group group1 = new Group("first");
        group1.addTask(signature1);
        group1.addTask(signature2);
        Group group2 = new Group("second");
        group2.addTask(signature2);
        group2.addTask(signature3);
        Group group3 = new Group("third");
        group3.addTask(signature2);

        VisitorWithStamp visitorWithStamp = new VisitorWithStamp("some stamp");

        group1.accept(visitorWithStamp);
        group2.accept(visitorWithStamp);
        group3.accept(visitorWithStamp);
    }
}