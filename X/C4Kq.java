package X;

/* renamed from: X.4Kq, reason: invalid class name */
/* loaded from: 4Kq.class */
public final class C4Kq extends C4Kr {
    public final C4Kc A00;

    public C4Kq() {
        this(C4Kc.A01);
    }

    public C4Kq(C4Kc c4Kc) {
        this.A00 = c4Kc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C4Kq) obj).A00);
    }

    public int hashCode() {
        return 846803280 + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Failure {mOutputData=");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }
}
