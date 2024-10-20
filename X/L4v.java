package X;

import java.util.BitSet;

/* loaded from: L4v.class */
public final class L4v {
    public int A00;
    public int A01;
    public KpX A02;
    public Object A03;
    public final AbstractC01033pi A04;
    public final C27T A05;
    public final C7Rt A06;
    public final BitSet A07;
    public final Object[] A08;

    public L4v(AbstractC01033pi abstractC01033pi, C27T c27t, C7Rt c7Rt, int i) {
        this.A04 = abstractC01033pi;
        this.A05 = c27t;
        this.A00 = i;
        this.A06 = c7Rt;
        this.A08 = new Object[i];
        this.A07 = i < 32 ? null : new BitSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r0.booleanValue() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object A00(X.68S r301, X.L4v r302) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4v.A00(X.68S, X.L4v):java.lang.Object");
    }

    public void A01(7Rr r302, Object obj, String str) {
        this.A02 = new Jy8(r302, this.A02, obj, str);
    }

    public void A02(68S r302, Object obj) {
        this.A02 = new Jy7(r302, this.A02, obj);
    }

    public boolean A03(68S r302, Object obj) {
        int A02 = r302.A02();
        this.A08[A02] = obj;
        BitSet bitSet = this.A07;
        boolean z = false;
        if (bitSet == null) {
            int i = this.A01;
            int i2 = (1 << A02) | i;
            if (i != i2) {
                this.A01 = i2;
                int i3 = this.A00 - 1;
                this.A00 = i3;
                if (i3 <= 0 && (this.A06 == null || this.A03 != null)) {
                    z = true;
                }
            }
        } else if (!bitSet.get(A02)) {
            bitSet.set(A02);
            this.A00--;
            return false;
        }
        return z;
    }

    public boolean A04(String str) {
        C7Rt c7Rt = this.A06;
        if (c7Rt == null || !str.equals(c7Rt.propertyName._simpleName)) {
            return false;
        }
        this.A03 = c7Rt._deserializer.A0M(this.A04, this.A05);
        return true;
    }
}
