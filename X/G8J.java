package X;

/* loaded from: G8J.class */
public final class G8J extends RuntimeException {
    public final int code;

    public G8J(int i) {
        this.code = i;
    }

    public G8J(String str, int i) {
        super(str);
        this.code = i;
    }
}
