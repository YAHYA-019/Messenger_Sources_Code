package X;

/* renamed from: X.2p2, reason: invalid class name */
/* loaded from: 2p2.class */
public final class C2p2 extends C2p3 {
    public static final C2p2 A01 = new C2p2("");
    public final String A00;

    public C2p2(String str) {
        str.getClass();
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C2p2) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return 0Pz.A0d("**REDACTED", "**", hashCode());
    }
}
