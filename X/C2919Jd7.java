package X;

import java.util.List;

/* renamed from: X.Jd7, reason: case insensitive filesystem */
/* loaded from: Jd7.class */
public final class C2919Jd7 extends Kuj {
    public KiX A00;
    public MKq A01;
    public boolean A04;
    public final LPR A06;
    public final KrM A07 = new KrM();
    public final C00p A05 = new C00p(2);
    public boolean A02 = true;
    public boolean A03 = true;

    public C2919Jd7(LPR lpr) {
        this.A06 = lpr;
    }

    @Override // X.Kuj
    public void A03(Kp6 kp6) {
        super.A03(kp6);
        KiX kiX = this.A00;
        if (kiX == null) {
            return;
        }
        this.A04 = this.A02;
        List list = kiX.A02;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                this.A02 = false;
                this.A03 = AnonymousClass001.A1Q(kiX.A00, 5);
                return;
            }
            Kts A0O = JQz.A0O(list, i2);
            boolean z = !A0O.A0B;
            boolean z2 = !kp6.A00(A0O.A05);
            boolean z3 = !this.A02;
            if (z && (z2 || z3)) {
                this.A07.A01(A0O.A05);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0313, code lost:
    
        if (r311 == 1) goto L9;
     */
    @Override // X.Kuj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(X.C00p r302, X.Kp6 r303, X.MKq r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2919Jd7.A04(X.00p, X.Kp6, X.MKq, boolean):boolean");
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Node(pointerInputFilter=");
        A0k.append(this.A06);
        A0k.append(", children=");
        A0k.append(super.A00);
        A0k.append(", pointerIds=");
        return AnonymousClass002.A0K(this.A07, A0k);
    }
}
