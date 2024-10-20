package X;

/* loaded from: KR2.class */
public final class KR2 extends IllegalStateException {
    public final String message;

    public KR2(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
