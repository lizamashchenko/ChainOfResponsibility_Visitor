package main;

import lombok.Getter;

public class SignatureWithStamp extends Signature {
    @Getter
    private String stamp = "";

    public SignatureWithStamp(String content, String stamp) {
        super(content);
        this.stamp = stamp;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
