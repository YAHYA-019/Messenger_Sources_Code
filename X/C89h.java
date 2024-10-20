package X;

/* renamed from: X.89h, reason: invalid class name */
/* loaded from: 89h.class */
public final class C89h extends C04v {
    public static final C89h A03 = new C89h(89Y.A02, "", 0);
    public final int A00;
    public final 89Y A01;
    public final String A02;

    public C89h() {
        this(89Y.A02, "", 0);
    }

    public C89h(89Y r302, String str, int i) {
        this.A00 = i;
        this.A01 = r302;
        this.A02 = str;
    }

    public static final C89h A00(89Y r301, String str, int i) {
        1BL.A1F(r301, str);
        return new C89h(r301, str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C89h)) {
                return false;
            }
            C89h c89h = (C89h) obj;
            if (this.A00 != c89h.A00 || this.A01 != c89h.A01 || !11T.A0O(this.A02, c89h.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A02, AnonymousClass002.A05(this.A01, this.A00 * 31));
    }
}
