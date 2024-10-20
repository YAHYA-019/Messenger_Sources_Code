package X;

import java.util.Set;

/* loaded from: Iif.class */
public final class Iif implements JLy {
    public static final Set A04 = new J7R(0);
    public boolean A01;
    public HWe A02;
    public final java.util.Map A03 = AnonymousClass001.A0u();
    public H9n A00 = H9n.NONE;

    public Iif(HWe hWe) {
        this.A02 = hWe;
    }

    @Override // X.JLy
    public boolean ATf() {
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r301.A00 != r302) goto L6;
     */
    @Override // X.JLy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BSP(X.H9n r302) {
        /*
            r301 = this;
            r0 = r301
            X.HWe r0 = r0.A02
            X.Ij0 r0 = r0.A00
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0j
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1f
            r0 = r301
            X.H9n r0 = r0.A00
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            r1 = r302
            if (r0 == r1) goto L23
        L1f:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L23:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Iif.BSP(X.H9n):boolean");
    }

    @Override // X.JLy
    public boolean BSt(H9n h9n) {
        return A04.contains(h9n);
    }

    @Override // X.JLy
    public void CbL(IPK ipk) {
        Ij0 ij0 = this.A02.A00;
        if (ij0.A0I) {
            ij0.A08 = new IPK(ipk.A00());
            ij0.A0E = true;
        } else {
            I0F i0f = (I0F) ipk.get();
            ij0.A0O(new Iit(i0f.A04, i0f.A02));
            ij0.A0V.A00(ipk);
        }
        this.A01 = false;
    }

    @Override // X.JLy
    public void Cp8(JMr jMr) {
        this.A03.put(jMr.AnB(), jMr);
    }
}
