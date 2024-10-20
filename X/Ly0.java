package X;

/* loaded from: Ly0.class */
public final class Ly0 extends Throwable {
    public static final long serialVersionUID = -4649703670690200604L;

    public Ly0() {
        super("No further exceptions");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
