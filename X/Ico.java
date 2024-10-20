package X;

/* loaded from: Ico.class */
public abstract class Ico implements JQ5 {
    public JMu A00;
    public I9U A01;
    public Ice A02;
    public Ich A03;
    public final I1d A04;

    public Ico(I1d i1d) {
        this.A04 = i1d == null ? I1d.A01 : i1d;
    }

    public Ich A02() {
        if (this.A03 == null) {
            this.A03 = new Ich(this.A04);
            this.A01.getClass();
            Ich ich = this.A03;
            JMu jMu = this.A00;
            jMu.getClass();
            ich.AAv(jMu);
        }
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (android.os.Looper.myLooper().getThread() != X.DKD.A10()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            r301 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            android.os.Looper r0 = android.os.Looper.myLooper()
            r302 = r0
            r0 = r302
            java.lang.Thread r0 = r0.getThread()
            r303 = r0
            java.lang.Thread r0 = X.DKD.A10()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L22
        L1d:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L39
            r0 = r301
            X.I1d r0 = r0.A04
            r304 = r0
            X.HBq r0 = X.HBq.A01
            r302 = r0
        L32:
            r0 = r304
            r1 = r302
            r0.A00(r1)
            r0 = 0
            return r0
        L39:
            r0 = r301
            X.I9U r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L4e
            r0 = r301
            X.I1d r0 = r0.A04
            r304 = r0
            X.HBq r0 = X.HBq.A05
            r302 = r0
            goto L32
        L4e:
            r0 = r301
            X.JMu r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L63
            r0 = r301
            X.I1d r0 = r0.A04
            r304 = r0
            X.HBq r0 = X.HBq.A08
            r302 = r0
            goto L32
        L63:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ico.A03():boolean");
    }

    public void A04() {
        Gu4 gu4 = (Gu4) this;
        Icw icw = gu4.A00;
        if (icw != null) {
            icw.AN3();
            gu4.A00 = null;
        }
        Icw icw2 = gu4.A01;
        if (icw2 != null) {
            icw2.AN3();
            gu4.A01 = null;
        }
    }

    public final void AAv(JMu jMu) {
        JMu jMu2 = this.A00;
        if (jMu2 != null && jMu2 != jMu) {
            this.A04.A00(HBq.A02);
        }
        this.A00 = jMu;
    }

    public final void AN3() {
        A04();
        this.A00 = null;
        Ich ich = this.A03;
        if (ich != null) {
            ich.AN3();
            this.A03 = null;
        }
    }

    public final void BOo(I9U i9u) {
        I9U i9u2 = this.A01;
        if (i9u2 != null && i9u2 != i9u) {
            this.A04.A00(HBq.A04);
        }
        this.A01 = i9u;
    }

    public final void release() {
        this.A01 = null;
    }
}
