package X;

/* loaded from: Icw.class */
public final class Icw implements JNP, JLE, JKJ {
    public JMg A00;
    public IFJ A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public JMu A07;
    public JG2 A08;
    public final I1d A09;
    public final Ict A0A;
    public final IFJ A0B;
    public final boolean A0C;
    public volatile int A0D;
    public volatile JG1 A0E;

    public Icw(I1d i1d, IFJ ifj, IFJ ifj2) {
        this(i1d, ifj, ifj2, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.Ict] */
    public Icw(I1d i1d, IFJ ifj, IFJ ifj2, boolean z) {
        this.A0A = new Object();
        this.A09 = i1d;
        this.A0B = ifj;
        this.A01 = ifj2;
        this.A0C = z;
        this.A0D = 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, X.JMu] */
    private void A00() {
        if (this.A00 == null) {
            ?? r0 = this.A07;
            if (r0 == 0) {
                this.A09.A00(HBq.A0F);
                return;
            }
            int i = this.A06;
            boolean z = true;
            boolean A1P = AnonymousClass001.A1P(i);
            int i2 = this.A05;
            if (i2 <= 0) {
                z = false;
            }
            if (!A1P) {
                this.A09.A00(HBq.A0H);
                if (z) {
                    return;
                }
            } else if (z) {
                JMg AJn = r0.BEy().AJn(null, r0, i, i2, this.A0C);
                this.A00 = AJn;
                Ict ict = this.A0A;
                ict.A04 = AJn.getTexture();
                int i3 = 3;
                if (AJn.is10Bit()) {
                    i3 = 7;
                }
                ict.A00 = i3;
                return;
            }
            this.A09.A00(HBq.A0G);
        }
    }

    private void A01() {
        JMg jMg = this.A00;
        if (jMg != null) {
            try {
                jMg.release();
            } finally {
                this.A00 = null;
                this.A0A.A04 = null;
            }
        }
    }

    public void A02(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        if (i3 % 180 != 0) {
            i4 = i2;
            i5 = i;
        }
        if (this.A06 == i4 && this.A05 == i5 && this.A04 == i3 && this.A00 != null) {
            return;
        }
        this.A04 = i3;
        this.A06 = i4;
        this.A05 = i5;
        if (this.A07 != null) {
            A01();
            A00();
        }
        IFJ ifj = this.A0B;
        ifj.A09(this.A06, this.A05, i, i2, this.A04, false, false);
        this.A0A.A05 = ifj.A08();
    }

    public void AAv(JMu jMu) {
        this.A07 = jMu;
        A00();
    }

    public void AN3() {
        A01();
        this.A07 = null;
    }

    public /* synthetic */ int Ad5() {
        return 0;
    }

    @Override // X.JKJ
    public JMv AnT() {
        return this.A0A;
    }

    @Override // X.JKJ
    public int Aqq() {
        return this.A0A.A00;
    }

    public Object AuT() {
        return this;
    }

    public int B0g() {
        return this.A0A.A00;
    }

    public int B0l() {
        int i;
        synchronized (this) {
            i = this.A0D;
        }
        return i;
    }

    public void BOo(I9U i9u) {
    }

    public boolean BS5(JMv jMv) {
        return true;
    }

    public /* synthetic */ boolean BUc() {
        return false;
    }

    public boolean BWr() {
        return this.A03;
    }

    public Exception BcC() {
        JMg jMg = this.A00;
        if (jMg == null || this.A07 == null) {
            if (jMg == null) {
                this.A09.A00(HBq.A0J);
                return AnonymousClass001.A0N("Frame buffer is null");
            }
            if (this.A07 == null) {
                this.A09.A00(HBq.A0K);
                return AnonymousClass001.A0N("Gl context is null");
            }
        }
        try {
            jMg.bind();
            N34.A02("Failure to bind frame buffer", AnonymousClass001.A1Z());
            return null;
        } catch (J7C e) {
            this.A09.A00(HBq.A0I);
            return e;
        }
    }

    public void Cn3(int i) {
        this.A0A.A00 = i;
    }

    @Override // X.JKJ
    public void Crq(JG1 jg1) {
        this.A0E = jg1;
    }

    public void Crr(JG2 jg2) {
        this.A08 = jg2;
    }

    public /* synthetic */ void CvA(int i) {
    }

    public void D3m() {
        JMg jMg = this.A00;
        if (jMg == null) {
            this.A09.A00(HBq.A0N);
            return;
        }
        JG2 jg2 = this.A08;
        if (jg2 != null) {
            jg2.Bzm(jMg.getWidth(), jMg.getHeight());
        }
        this.A00.unbind();
        JG1 jg1 = this.A0E;
        if (jg1 != null) {
            jg1.onFrameAvailable();
        }
    }

    public Hp4 D7S(JMv jMv) {
        return D7T(jMv, this.A01);
    }

    public Hp4 D7T(JMv jMv, IFJ ifj) {
        I1d i1d;
        HBq hBq;
        Hp4 BKK = jMv.BKK();
        if (BKK == null) {
            i1d = this.A09;
            hBq = HBq.A0P;
        } else {
            if (BKK.A00()) {
                ifj.A09(BKK.A01, BKK.A00, this.A06, this.A05, -this.A04, false, this.A02);
                Ict ict = this.A0A;
                ict.A02 = jMv.B0k();
                ict.A01 = jMv.Ahi();
                ict.A03 = jMv.BFt();
                ict.A06 = jMv.BT0();
                return ifj.A08();
            }
            i1d = this.A09;
            hBq = HBq.A0O;
        }
        i1d.A00(hBq);
        return null;
    }

    public boolean contains(Object obj) {
        return AnonymousClass001.A1W(obj, this);
    }

    public void release() {
    }
}
