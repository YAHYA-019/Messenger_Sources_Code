package X;

/* renamed from: X.78f, reason: invalid class name */
/* loaded from: 78f.class */
public final class C78f extends C04v implements C6xq {
    public final 82W A00;
    public final String A01;

    public C78f() {
        this(null, null);
    }

    public C78f(82W r302, String str) {
        this.A00 = r302;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C78f)) {
                return false;
            }
            C78f c78f = (C78f) obj;
            if (!11T.A0O(this.A00, c78f.A00) || !11T.A0O(this.A01, c78f.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A02 = AnonymousClass001.A02(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A02 + i;
    }
}
