package X;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* loaded from: Gtq.class */
public final class Gtq extends GuG implements JQ3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public JPz A06;
    public JG1 A07;
    public JLp A08;
    public JG3 A09;
    public JKN A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public int A0E;
    public JKJ A0F;
    public JG0 A0G;
    public final Handler A0H;
    public final Handler A0I;
    public final I1d A0J;
    public final I4V A0K;
    public final JOO A0L;
    public final boolean A0M;
    public final HP4 A0N;
    public final IeY A0O;
    public volatile JLq A0P;
    public volatile boolean A0Q;
    public volatile I5d A0R;

    /* JADX WARN: Multi-variable type inference failed */
    public Gtq(HP4 hp4, JOW jow) {
        super(jow);
        this.A0K = I4V.A00();
        this.A00 = 0;
        Hvf hvf = JO2.A00;
        Object i1d = new I1d();
        JOW jow2 = ((GuG) this).A00;
        Object Adn = jow2.Adn(hvf);
        this.A0J = (I1d) (Adn != null ? Adn : i1d);
        this.A0I = HGc.A00(jow);
        this.A0H = JOW.A00(jow2, JQ7.A00);
        this.A0O = new IeY(this);
        this.A0M = true;
        this.A0B = true;
        this.A0N = hp4;
        Object obj = false;
        Object Adn2 = jow2.Adn(JNw.A01);
        this.A0L = AnonymousClass001.A1V(Adn2 != null ? Adn2 : obj) ? new IeE() : new Object();
    }

    public static void A00(JKJ jkj, Gtq gtq, int i) {
        if (gtq.A0I.getLooper() != Looper.myLooper()) {
            throw AnonymousClass001.A0N("getInputTextureId() must be called at SurfacePipe thread.");
        }
        if (!(jkj instanceof JG0)) {
            throw AnonymousClass002.A0C(jkj, "glInput must implement GlInputUpdateAware interface: ", AnonymousClass001.A0k());
        }
        gtq.A0F = jkj;
        JG1 jg1 = gtq.A07;
        if (jg1 == null) {
            jg1 = new Icx(gtq, 2);
            gtq.A07 = jg1;
        }
        jkj.Crq(jg1);
        gtq.A0G = (JG0) jkj;
        Icg icg = new Icg(gtq.A0J, null, gtq.A0F, false, false);
        if (i != 0) {
            icg.A00 = i;
        }
        IHY.A00(gtq.A06).Cpn(icg, 0);
    }

    public static void A01(Gtq gtq) {
        A04(gtq, null);
        GuJ guJ = JQ1.A00;
        if (((GuG) gtq).A00.BRD(guJ)) {
            JQ1 jq1 = (JQ1) gtq.A0B(guJ);
            JLp jLp = gtq.A08;
            if (jLp == null) {
                jLp = new Id3(gtq, 8);
                gtq.A08 = jLp;
            }
            jq1.Cf0(jLp);
        }
        JLq jLq = gtq.A0P;
        if (jLq != null) {
            jLq.stop();
        }
    }

    public static void A02(Gtq gtq) {
        GuJ guJ = JQ1.A00;
        if (((GuG) gtq).A00.BRD(guJ)) {
            JQ1 jq1 = (JQ1) gtq.A0B(guJ);
            JLp jLp = gtq.A08;
            if (jLp == null) {
                jLp = new Id3(gtq, 8);
                gtq.A08 = jLp;
            }
            jq1.A78(jLp);
        }
        JLq jLq = gtq.A0P;
        if (jLq != null) {
            JG3 jg3 = gtq.A09;
            if (jg3 == null) {
                jg3 = new Id4(gtq, 5);
                gtq.A09 = jg3;
            }
            jLq.D1H(jg3);
        }
    }

    public static void A03(Gtq gtq) {
        int i;
        JG0 jg0;
        int i2 = gtq.A03;
        if (i2 == 0 || (i = gtq.A02) == 0 || (jg0 = gtq.A0G) == null) {
            return;
        }
        boolean z = true;
        boolean z2 = false;
        int i3 = i2;
        if (gtq.A05 % 180 != 0) {
            z2 = true;
            i3 = i;
        }
        int i4 = i3;
        if (!z2) {
            i2 = i;
        }
        int i5 = gtq.A04;
        int i6 = i2;
        if (i5 % 180 == 0) {
            z = false;
            i6 = i3;
            i3 = i2;
        }
        HP4 hp4 = gtq.A0N;
        if (hp4 != null) {
            HZf hZf = hp4.A00;
            if (i6 > i3) {
                i6 = hZf.A00;
                i3 = hZf.A01;
            } else {
                i3 = hZf.A00;
                i6 = hZf.A01;
            }
        }
        int i7 = i6;
        int i8 = i6;
        if (z) {
            i8 = i3;
        }
        gtq.A0E = i8;
        if (!z) {
            i6 = i3;
        }
        gtq.A0D = i6;
        Hp4 D76 = jg0.D76(i4, i2, i8, i6, i5, gtq.A0B ? gtq.A01 : 0, gtq.A00, gtq.A0C);
        I5d i5d = gtq.A0R;
        if (i5d != null) {
            i5d.A07 = gtq.A04;
        }
        gtq.A06.D7Z(0, D76.A01, D76.A00, i7, i3, gtq.A0C);
        int i9 = gtq.A0E;
        int i10 = gtq.A0D;
        int i11 = gtq.A04;
        int i12 = gtq.A0B ? gtq.A01 : 0;
        boolean z3 = gtq.A0C;
        if (i9 == 0 || i10 == 0) {
            return;
        }
        List list = gtq.A0K.A00;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((JG4) list.get(i13)).CAR(i9, i10, i11, i12, z3);
        }
    }

    public static void A04(Gtq gtq, I5d i5d) {
        I5d i5d2 = gtq.A0R;
        if (i5d2 != null && i5d2 != i5d) {
            gtq.Ceu(i5d2);
        }
        gtq.A0R = i5d;
        if (i5d != null) {
            Icv icv = new Icv(gtq.A0J, i5d);
            if (gtq.A0Q) {
                icv.A01 = 3;
            }
            icv.A09 = true;
            IHY.A00(gtq.A06).A5n(icv, 0);
        }
    }

    public void A0A() {
        this.A06 = (JPz) A0B(JPz.A01);
        this.A0P = ((JPw) A0B(JPw.A00)).B6v();
    }

    @Override // X.JQ3
    public void A6y(I5d i5d) {
        Icv icv = new Icv(this.A0J, i5d);
        if (this.A0Q) {
            icv.A00 = 7;
            icv.A01 = 7;
        }
        icv.A09 = true;
        IHY.A00(this.A06).A5n(icv, 0);
    }

    @Override // X.JQ3
    public void A7V(JG4 jg4) {
        if (this.A0K.A02(jg4)) {
            int i = this.A0E;
            int i2 = this.A0D;
            int i3 = this.A04;
            int i4 = this.A0B ? this.A01 : 0;
            boolean z = this.A0C;
            if (i <= 0 || i2 <= 0) {
                return;
            }
            jg4.CAR(i, i2, i3, i4, z);
        }
    }

    @Override // X.JQC
    public GuJ Ase() {
        return JQ3.A00;
    }

    @Override // X.JQ3
    public JNZ BDt() {
        return this.A0O;
    }

    @Override // X.JQ3
    public boolean BNd() {
        JQ6 jq6 = ((C2419Gcg) this.A06).A06.A00;
        if (jq6 != null) {
            return jq6.BNe();
        }
        return false;
    }

    @Override // X.JQ3
    public void Ceu(I5d i5d) {
        IHY.A00(this.A06).CeN(0, i5d);
    }

    @Override // X.JQ3
    public void CfE(JG4 jg4) {
        this.A0K.A03(jg4);
    }

    @Override // X.JQ3
    public void Co6(boolean z) {
        this.A0I.post(new IxU(this, z));
    }

    @Override // X.JQ3
    public void Cpk(Object obj, int i, int i2, int i3) {
        Cpl(i, obj, i2, 0, 0);
    }

    @Override // X.JQ3
    public void Cpl(final int i, final Object obj, final int i2, int i3, final int i4) {
        if (!(obj instanceof JKJ)) {
            throw AnonymousClass002.A0C(obj, "input must implement GlInput interface: ", AnonymousClass001.A0k());
        }
        this.A0I.post(new Runnable() { // from class: X.J30
            public static final String __redex_internal_original_name = "RtcSurfacePipeComponent$$ExternalSyntheticLambda4";

            @Override // java.lang.Runnable
            public final void run() {
                Gtq gtq = Gtq.this;
                Object obj2 = obj;
                int i5 = i4;
                int i6 = i;
                int i7 = i2;
                Gtq.A00((JKJ) obj2, gtq, i5);
                boolean z = gtq.A0B;
                int i8 = gtq.A00;
                gtq.A03 = i6;
                gtq.A02 = i7;
                gtq.A04 = 0;
                gtq.A05 = 0;
                gtq.A01 = 0;
                gtq.A0C = false;
                gtq.A0B = z;
                gtq.A00 = i8;
                Gtq.A03(gtq);
            }
        });
    }

    @Override // X.JQ3
    public void Cs5(HJY hjy, Object obj) {
        IeY ieY = this.A0O;
        if (hjy == JNx.A00) {
            ieY.A07.A00 = (JNx) obj;
        }
    }

    @Override // X.JQ3
    public void CtE(boolean z) {
        I5d i5d = this.A0R;
        if (i5d != null) {
            i5d.A0E = z;
        }
    }

    @Override // X.JQ3
    public /* synthetic */ void CtN(HWr hWr) {
    }

    @Override // X.JQ3
    public void CwK(JKN jkn) {
        this.A0A = jkn;
    }
}
