package main;

import lombok.Getter;

public class Signature implements Task {
    @Getter
    private String content = "";

    public Signature() {}
    public Signature(String content) {
        this.content = content;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}