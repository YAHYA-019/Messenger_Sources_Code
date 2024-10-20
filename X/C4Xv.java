package X;

/* renamed from: X.4Xv, reason: invalid class name */
/* loaded from: 4Xv.class */
public final class C4Xv extends RuntimeException {
    public final 4RV callbackName;
    public final Throwable cause;

    public C4Xv(4RV r302, Throwable th) {
        super(th);
        this.callbackName = r302;
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
