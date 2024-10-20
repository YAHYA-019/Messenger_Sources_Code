package X;

/* renamed from: X.9hx, reason: invalid class name */
/* loaded from: 9hx.class */
public final class C9hx {
    public final MRN A00;

    public C9hx() {
        this(Kwj.A00(C0ty.A00));
    }

    public C9hx(MRN mrn) {
        11T.A0F(mrn, 1);
        this.A00 = mrn;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9hx) && 11T.A0O(this.A00, ((C9hx) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImagineMEmuResponse(extendedCaptureImages=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
