package X;

import java.util.Set;

/* loaded from: JtD.class */
public final class JtD extends C04v {
    public String A00;
    public String A01;
    public java.util.Map A02;
    public Set A03;
    public Set A04;
    public Set A05;
    public Set A06;
    public Set A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public JtD() {
        /*
            r301 = this;
            X.0uA r0 = X.C0uA.A00
            r302 = r0
            r0 = r301
            r1 = r302
            r2 = r302
            r3 = r302
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JtD.<init>():void");
    }

    public JtD(Set set, Set set2, Set set3) {
        1BL.A1H(set, set2, set3);
        this.A03 = set;
        this.A06 = set2;
        this.A05 = set3;
        this.A00 = null;
        this.A07 = null;
        this.A04 = null;
        this.A02 = null;
        this.A01 = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof JtD)) {
                return false;
            }
            JtD jtD = (JtD) obj;
            if (!11T.A0O(this.A03, jtD.A03) || !11T.A0O(this.A06, jtD.A06) || !11T.A0O(this.A05, jtD.A05) || !11T.A0O(this.A00, jtD.A00) || !11T.A0O(this.A07, jtD.A07) || !11T.A0O(this.A04, jtD.A04) || !11T.A0O(this.A02, jtD.A02) || !11T.A0O(this.A01, jtD.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A06, 1BL.A03(this.A03))) + 1BL.A05(this.A00)) * 31) + AnonymousClass001.A02(this.A07)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 7zN.A05(this.A01);
    }
}
