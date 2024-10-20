package X;

/* renamed from: X.0sE, reason: invalid class name */
/* loaded from: 0sE.class */
public final class C0sE extends Exception {
    public boolean mFillInStackTrace = true;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        synchronized (this) {
            if (this.mFillInStackTrace) {
                super.fillInStackTrace();
            }
        }
        return this;
    }
}
