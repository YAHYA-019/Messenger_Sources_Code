package X;

/* loaded from: G8H.class */
public final class G8H extends RuntimeException {
    public final int errorCode;

    public G8H(int i) {
        super(0Pz.A0T("Headwind error: ", i));
        this.errorCode = i;
    }

    public G8H(int i, String str) {
        super(str);
        this.errorCode = i;
    }
}
