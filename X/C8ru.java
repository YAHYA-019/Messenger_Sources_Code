package X;

/* renamed from: X.8ru, reason: invalid class name */
/* loaded from: 8ru.class */
public final class C8ru extends 99L {
    public final Exception A00;

    public C8ru(Exception exc) {
        11T.A0F(exc, 1);
        this.A00 = exc;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof C8ru) && 0CV.A0a(((C8ru) obj).A00.getMessage(), this.A00.getMessage(), false)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
