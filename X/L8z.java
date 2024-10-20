package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: L8z.class */
public final class L8z {
    public static final L8z A02 = new L8z("COMPOSITION");
    public MIC A00;
    public final List A01;

    public L8z(L8z l8z) {
        this.A01 = 1BK.A17(l8z.A01);
        this.A00 = l8z.A00;
    }

    public L8z(String... strArr) {
        this.A01 = Arrays.asList(strArr);
    }

    public int A00(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.A01;
        int i2 = 1;
        if (1BK.A14(list, i).equals("**")) {
            if (i == GOn.A0A(list, 1) || !1BK.A14(list, i + 1).equals(str)) {
                return 0;
            }
            i2 = 2;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        if (((java.lang.String) X.DKE.A0q(r0)).equals("**") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        if (r305 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        if (r0.equals("*") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01(java.lang.String r302, int r303) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L8z.A01(java.lang.String, int):boolean");
    }

    public boolean A02(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (i >= list.size()) {
                return false;
            }
            if (!1BK.A14(list, i).equals(str) && !1BK.A14(list, i).equals("**") && !1BK.A14(list, i).equals("*")) {
                return false;
            }
        }
        return true;
    }

    public boolean A03(String str, int i) {
        boolean z = true;
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (i >= GOn.A0A(list, 1) && !1BK.A14(list, i).equals("**")) {
                z = false;
            }
        }
        return z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            L8z l8z = (L8z) obj;
            if (!this.A01.equals(l8z.A01)) {
                return false;
            }
            MIC mic = this.A00;
            MIC mic2 = l8z.A00;
            if (mic != null) {
                z = mic.equals(mic2);
            } else if (mic2 != null) {
                return false;
            }
        }
        return z;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + AnonymousClass002.A04(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("KeyPath{keys=");
        A0k.append(this.A01);
        A0k.append(",resolved=");
        A0k.append(AnonymousClass001.A1T(this.A00));
        return AnonymousClass001.A0f(A0k);
    }
}
