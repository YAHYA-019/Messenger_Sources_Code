package X;

/* renamed from: X.8tg, reason: invalid class name */
/* loaded from: 8tg.class */
public final class C8tg extends 99Z {
    public final Exception A00;

    public C8tg(Exception exc) {
        11T.A0F(exc, 1);
        this.A00 = exc;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof C8tg) && 0CV.A0a(((C8tg) obj).A00.getMessage(), this.A00.getMessage(), false)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
