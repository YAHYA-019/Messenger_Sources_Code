package X;

/* renamed from: X.4P3, reason: invalid class name */
/* loaded from: 4P3.class */
public final class C4P3 extends C4Kr {
    public final C4Kc A00;

    public C4P3() {
        this(C4Kc.A01);
    }

    public C4P3(C4Kc c4Kc) {
        this.A00 = c4Kc;
    }

    @Override // X.C4Kr
    public C4Kc A00() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C4P3) obj).A00);
    }

    public int hashCode() {
        return (-1876823561) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Success {mOutputData=");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }
}
