package main;

public class VisitorWithStamp implements Visitor {
    private String name = "";

    public VisitorWithStamp(String name) {
        this.name = name;
    }

    @Override
    public void visit(Signature signature) {
        System.out.println("Stamped -> " + signature.getContent() + "; with main.Group ->  " + name);
    }
}