package X;

/* loaded from: G86.class */
public final class G86 extends RuntimeException {
    public String message;

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.message;
        if (str == null) {
            str = super.getMessage();
        }
        return str;
    }
}
