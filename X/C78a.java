package X;

/* renamed from: X.78a, reason: invalid class name */
/* loaded from: 78a.class */
public final class C78a extends C04v implements C6xq {
    public final 5vF A00;
    public final CharSequence A01;

    public C78a() {
        this(null, null);
    }

    public C78a(5vF r302, CharSequence charSequence) {
        this.A00 = r302;
        this.A01 = charSequence;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C78a)) {
                return false;
            }
            C78a c78a = (C78a) obj;
            if (!11T.A0O(this.A00, c78a.A00) || !11T.A0O(this.A01, c78a.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A02(this.A00) * 31) + 4YU.A03(this.A01);
    }
}
