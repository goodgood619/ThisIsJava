package thisIsJava.Generic_13_7;

public class Product<T, M> {
    private T kind;
    private M model;

    public void setModel(M model) {
        this.model = model;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public T getKind() {
        return kind;
    }
}
class Tv{}
