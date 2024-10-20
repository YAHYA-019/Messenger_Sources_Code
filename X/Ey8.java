package X;

/* loaded from: Ey8.class */
public final class Ey8 {
    public final String A00;
    public final String A01;

    public Ey8(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ey8)) {
                return false;
            }
            Ey8 ey8 = (Ey8) obj;
            if (!11T.A0O(this.A00, ey8.A00) || !11T.A0O(this.A01, ey8.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, AnonymousClass002.A02(170859388332670L, 4YV.A02(this.A00)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CdsAnalyticsConfig(analyticsName=");
        A0k.append(this.A00);
        A0k.append(", featureId=");
        A0k.append(170859388332670L);
        A0k.append(", moduleClassNameOverride=");
        return DKH.A0o(this.A01, A0k);
    }
}
