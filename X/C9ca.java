package X;

/* renamed from: X.9ca, reason: invalid class name */
/* loaded from: 9ca.class */
public final class C9ca {
    public final String A00;
    public final boolean A01;
    public final String A02;
    public final String A03;

    public C9ca(String str, String str2, String str3, boolean z) {
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9ca)) {
                return false;
            }
            C9ca c9ca = (C9ca) obj;
            if (!11T.A0O(this.A02, c9ca.A02) || !11T.A0O(this.A00, c9ca.A00) || !11T.A0O(this.A03, c9ca.A03) || this.A01 != c9ca.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A00, 4YV.A02(this.A02)) + 1BL.A05(this.A03)) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CreatorAttribution(id=");
        A0k.append(this.A02);
        A0k.append(", name=");
        A0k.append(this.A00);
        A0k.append(", profilePicUri=");
        A0k.append(this.A03);
        A0k.append(4YT.A00(205));
        A0k.append(this.A01);
        return 4YV.A0x(A0k);
    }
}
