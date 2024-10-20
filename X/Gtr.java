package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.List;

/* loaded from: Gtr.class */
public final class Gtr extends GuG implements JQ3 {
    public static final String A0V = IeX.class.getSimpleName();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public JPz A08;
    public JG1 A09;
    public JLp A0A;
    public JG3 A0B;
    public JQ8 A0C;
    public JQ7 A0D;
    public HWr A0E;
    public JKN A0F;
    public boolean A0G;
    public boolean A0H;
    public JKJ A0I;
    public JG0 A0J;
    public final Handler A0K;
    public final Handler A0L;
    public final I1d A0M;
    public final JQ9 A0N;
    public final I4V A0O;
    public final JOO A0P;
    public final boolean A0Q;
    public final IeX A0R;
    public volatile JLq A0S;
    public volatile boolean A0T;
    public volatile I5d A0U;

    public Gtr(JOW jow) {
        this(jow, false, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Gtr(JOW jow, boolean z, boolean z2) {
        super(jow);
        this.A0O = I4V.A00();
        this.A00 = 0;
        Hvf hvf = JO2.A00;
        Object i1d = new I1d();
        JOW jow2 = ((GuG) this).A00;
        Object Adn = jow2.Adn(hvf);
        this.A0M = (I1d) (Adn != null ? Adn : i1d);
        this.A0L = HGc.A00(jow);
        HJS hjs = JQ7.A00;
        JQ9 jq9 = null;
        this.A0K = jow2.BRE(hjs) ? JOW.A00(jow2, hjs) : null;
        HJS hjs2 = JQ9.A00;
        this.A0N = jow2.BRE(hjs2) ? (JQ9) jow2.AdD(hjs2) : jq9;
        this.A0R = new IeX(this);
        this.A0Q = AnonymousClass001.A1N(z ? 1 : 0);
        this.A0G = z2;
        Object obj = false;
        Object Adn2 = jow2.Adn(JNw.A01);
        this.A0P = AnonymousClass001.A1V(Adn2 != null ? Adn2 : obj) ? new IeE() : new Object();
    }

    public static void A00(JKJ jkj, Gtr gtr, int i) {
        if (gtr.A0L.getLooper() != Looper.myLooper()) {
            throw AnonymousClass001.A0N("getInputTextureId() must be called at SurfacePipe thread.");
        }
        if (!(jkj instanceof JG0)) {
            throw AnonymousClass002.A0C(jkj, "glInput must implement GlInputUpdateAware interface: ", AnonymousClass001.A0k());
        }
        gtr.A0I = jkj;
        JG1 jg1 = gtr.A09;
        if (jg1 == null) {
            jg1 = new Icx(gtr, 1);
            gtr.A09 = jg1;
        }
        jkj.Crq(jg1);
        gtr.A0J = (JG0) jkj;
        Icg icg = new Icg(gtr.A0M, null, gtr.A0I, false, false);
        if (i != 0) {
            icg.A00 = i;
        }
        IHY.A00(gtr.A08).Cpn(icg, 0);
    }

    public static void A01(Gtr gtr) {
        A04(gtr, null);
        GuJ guJ = JQ1.A00;
        if (((GuG) gtr).A00.BRD(guJ)) {
            JQ1 jq1 = (JQ1) gtr.A0B(guJ);
            JLp jLp = gtr.A0A;
            if (jLp == null) {
                jLp = new Id3(gtr, 7);
                gtr.A0A = jLp;
            }
            jq1.Cf0(jLp);
        }
        JLq jLq = gtr.A0S;
        if (jLq != null) {
            jLq.stop();
        }
    }

    public static void A02(Gtr gtr) {
        GuJ guJ = JQ1.A00;
        if (((GuG) gtr).A00.BRD(guJ)) {
            JQ1 jq1 = (JQ1) gtr.A0B(guJ);
            JLp jLp = gtr.A0A;
            if (jLp == null) {
                jLp = new Id3(gtr, 7);
                gtr.A0A = jLp;
            }
            jq1.A78(jLp);
        }
        JLq jLq = gtr.A0S;
        if (jLq != null) {
            JG3 jg3 = gtr.A0B;
            if (jg3 == null) {
                jg3 = new Id4(gtr, 4);
                gtr.A0B = jg3;
            }
            jLq.D1H(jg3);
        }
    }

    public static void A03(Gtr gtr) {
        int i;
        int i2;
        JG0 jg0;
        int i3 = gtr.A03;
        if (i3 == 0) {
            return;
        }
        int i4 = gtr.A02;
        if (i4 == 0 || (i = gtr.A05) == 0 || (i2 = gtr.A04) == 0 || (jg0 = gtr.A0J) == null) {
            return;
        }
        int i5 = i3;
        if (gtr.A07 % 180 != 0) {
            i5 = i4;
            i4 = i3;
        }
        int i6 = gtr.A06;
        int i7 = i;
        int i8 = i2;
        if (i6 % 180 != 0) {
            i7 = i2;
            i8 = i;
        }
        Hp4 D76 = jg0.D76(i5, i4, i7, i8, i6, gtr.A0G ? gtr.A01 : 0, gtr.A00, gtr.A0H);
        I5d i5d = gtr.A0U;
        if (i5d != null) {
            i5d.A07 = gtr.A06;
        }
        gtr.A08.D7Z(0, D76.A01, D76.A00, i, i2, gtr.A0H);
        int i9 = gtr.A05;
        int i10 = gtr.A04;
        int i11 = gtr.A06;
        int i12 = gtr.A0G ? gtr.A01 : 0;
        boolean z = gtr.A0H;
        if (i9 == 0 || i10 == 0) {
            return;
        }
        List list = gtr.A0O.A00;
        int size = list.size();
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (i14 >= size) {
                return;
            }
            ((JG4) list.get(i14)).CAR(i9, i10, i11, i12, z);
            i13 = i14 + 1;
        }
    }

    public static void A04(Gtr gtr, I5d i5d) {
        I5d i5d2 = gtr.A0U;
        if (i5d2 != null && i5d2 != i5d) {
            gtr.Ceu(i5d2);
        }
        gtr.A0U = i5d;
        if (i5d != null) {
            boolean z = false;
            JQ8 jq8 = gtr.A0C;
            if (jq8 != null) {
                z = jq8.BSa(ActionId.APP_WILL_ENTER_FOREGROUND);
            }
            AwakeTimeSinceBootClock awakeTimeSinceBootClock = null;
            HWo hWo = z ? new HWo(gtr) : null;
            I1d i1d = gtr.A0M;
            boolean z2 = false;
            JQ8 jq82 = gtr.A0C;
            if (jq82 != null) {
                z2 = jq82.BSa(ActionId.APP_DID_ENTER_BACKGROUND);
            }
            JQ9 jq9 = gtr.A0N;
            if (jq9 != null) {
                awakeTimeSinceBootClock = jq9.AyE();
            }
            Icv icv = new Icv(awakeTimeSinceBootClock, i1d, hWo, i5d, z2);
            if (gtr.A0T) {
                icv.A01 = 3;
            }
            icv.A09 = true;
            IHY.A00(gtr.A08).A5n(icv, 0);
        }
    }

    public void A0A() {
        HJS hjs = JQ8.A00;
        JOW jow = ((GuG) this).A00;
        this.A0C = jow.BRE(hjs) ? (JQ8) jow.AdD(hjs) : null;
        this.A0D = (JQ7) jow.AdD(JQ7.A00);
        this.A08 = (JPz) A0B(JPz.A01);
        this.A0S = ((JPw) A0B(JPw.A00)).B6v();
    }

    @Override // X.JQ3
    public void A6y(I5d i5d) {
        I1d i1d = this.A0M;
        boolean z = false;
        JQ8 jq8 = this.A0C;
        if (jq8 != null) {
            z = jq8.BSa(ActionId.APP_DID_ENTER_BACKGROUND);
        }
        Icv icv = new Icv(null, i1d, null, i5d, z);
        if (this.A0T) {
            icv.A00 = 7;
            icv.A01 = 7;
        }
        icv.A09 = true;
        IHY.A00(this.A08).A5n(icv, 0);
    }

    @Override // X.JQ3
    public void A7V(JG4 jg4) {
        if (this.A0O.A02(jg4)) {
            int i = this.A05;
            int i2 = this.A04;
            int i3 = this.A06;
            int i4 = this.A0G ? this.A01 : 0;
            boolean z = this.A0H;
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
        return this.A0R;
    }

    @Override // X.JQ3
    public boolean BNd() {
        JQ6 jq6 = ((C2419Gcg) this.A08).A06.A00;
        if (jq6 != null) {
            return jq6.BNe();
        }
        return false;
    }

    @Override // X.JQ3
    public void Ceu(I5d i5d) {
        IHY.A00(this.A08).CeN(0, i5d);
    }

    @Override // X.JQ3
    public void CfE(JG4 jg4) {
        this.A0O.A03(jg4);
    }

    @Override // X.JQ3
    public void Co6(boolean z) {
        this.A0L.post(new IxQ(this, z));
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
        this.A0L.post(new Runnable() { // from class: X.J2z
            public static final String __redex_internal_original_name = "BasicSurfacePipeComponent$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                Gtr gtr = Gtr.this;
                Object obj2 = obj;
                int i5 = i4;
                int i6 = i;
                int i7 = i2;
                Gtr.A00((JKJ) obj2, gtr, i5);
                boolean z = gtr.A0G;
                int i8 = gtr.A00;
                gtr.A03 = i6;
                gtr.A02 = i7;
                gtr.A06 = 0;
                gtr.A07 = 0;
                gtr.A01 = 0;
                gtr.A0H = false;
                gtr.A0G = z;
                gtr.A00 = i8;
                Gtr.A03(gtr);
            }
        });
    }

    @Override // X.JQ3
    public void Cs5(HJY hjy, Object obj) {
        IeX ieX = this.A0R;
        if (hjy == JNx.A00) {
            ieX.A07.A00 = (JNx) obj;
        }
    }

    @Override // X.JQ3
    public void CtE(boolean z) {
        I5d i5d = this.A0U;
        if (i5d != null) {
            i5d.A0E = z;
        }
    }

    @Override // X.JQ3
    public void CtN(HWr hWr) {
        this.A0E = hWr;
    }

    @Override // X.JQ3
    public void CwK(JKN jkn) {
        this.A0F = jkn;
    }
}
