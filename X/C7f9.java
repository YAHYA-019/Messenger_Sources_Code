package X;

/* renamed from: X.7f9, reason: invalid class name */
/* loaded from: 7f9.class */
public final class C7f9 extends C04v implements C2mq {
    public final String A00;
    public final boolean A01 = true;

    public C7f9(String str) {
        this.A00 = str;
    }

    @Override // X.C2mq
    public int AU8() {
        return 24;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7f9)) {
                return false;
            }
            C7f9 c7f9 = (C7f9) obj;
            if (!11T.A0O(this.A00, c7f9.A00) || this.A01 != c7f9.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}
