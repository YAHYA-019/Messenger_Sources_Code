package X;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Display;
import android.view.TextureView;
import com.facebook.acra.constants.ActionId;

/* renamed from: X.Gch, reason: case insensitive filesystem */
/* loaded from: Gch.class */
public final class C2420Gch extends AbstractC2421Gci {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Display A06;
    public TextureView A07;
    public JE9 A08;
    public Hh3 A09;
    public HP7 A0A;
    public HP8 A0B;
    public GuT A0C;
    public JED A0D;
    public HTM A0E;
    public HTN A0F;
    public JLp A0G;
    public JG9 A0H;
    public JGA A0I;
    public JGB A0J;
    public JGC A0K;
    public JGD A0L;
    public Ht4 A0M;
    public Ht4 A0N;
    public JGJ A0O;
    public JLI A0P;
    public HzC A0Q;
    public JNZ A0R;
    public Float A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public int A0X;
    public int A0Y;
    public I3h A0Z;
    public I95 A0a;
    public JQ8 A0b;
    public boolean A0c;
    public boolean A0d;
    public final H9N A0e;
    public final I4V A0f;
    public final JNk A0g;
    public final Context A0h;
    public final JQ7 A0i;
    public final String A0j;
    public volatile boolean A0k;

    public C2420Gch(JOW jow) {
        super(jow);
        this.A0f = I4V.A00();
        this.A03 = 0;
        this.A01 = 0;
        this.A05 = 0;
        this.A00 = -1;
        this.A0T = true;
        this.A0W = true;
        this.A0c = false;
        JOW jow2 = ((Ic7) this).A00;
        jow2.getClass();
        this.A0h = jow2.getContext();
        Hvf hvf = Hxy.A02;
        Object A09 = Ic7.A09(this, hvf);
        if (A09 == null) {
            throw AnonymousClass002.A0C(hvf, "Configuration is not available: ", AnonymousClass001.A0k());
        }
        this.A0j = (String) A09;
        Boolean bool = (Boolean) Ic7.A09(this, JO1.A05);
        if (bool == null) {
            JOW jow3 = ((Ic7) this).A00;
            jow3.getClass();
            bool = Boolean.valueOf(HO0.A00(jow3.getContext(), false));
        }
        H9N h9n = bool.booleanValue() ? H9N.A02 : H9N.A01;
        this.A0e = h9n;
        JQ7 jq7 = (JQ7) Ic7.A08(this, JQ7.A00);
        this.A0i = jq7;
        Hvf hvf2 = JO1.A00;
        JNk jNk = (JNk) Ic7.A09(this, hvf2);
        if (jNk == null) {
            JOW jow4 = ((Ic7) this).A00;
            jow4.getClass();
            Object A00 = HJZ.A00(jow4.getContext(), jq7.AoV("Lite-Controller-Thread"), h9n, false);
            Object A092 = Ic7.A09(this, hvf2);
            jNk = (JNk) (A092 != null ? A092 : A00);
        }
        this.A0g = jNk;
        ((AbstractC2421Gci) this).A00 = 0;
        this.A0V = true;
        this.A0U = true;
        this.A0c = Ic7.A0A(this, JO1.A02, false);
        if (Ic7.A0A(this, JO1.A01, false)) {
            this.A0H = new JG9() { // from class: X.Idb
                @Override // X.JG9
                public final void BwL(J7E j7e) {
                    IHZ.A09(j7e, ((AbstractC2421Gci) C2420Gch.this).A01.A00);
                }
            };
        }
        HJS hjs = JQ8.A00;
        JOW jow5 = ((Ic7) this).A00;
        jow5.getClass();
        if (jow5.BRE(hjs)) {
            this.A0b = (JQ8) Ic7.A08(this, hjs);
        }
        this.A0Y = 1920;
        this.A0X = 1080;
        this.A0d = true;
    }

    public static I3h A00(C2420Gch c2420Gch) {
        I3h i3h = c2420Gch.A0Z;
        if (i3h == null) {
            i3h = new I3h(c2420Gch.A0i);
            c2420Gch.A0Z = i3h;
        }
        return i3h;
    }

    public static I95 A01(C2420Gch c2420Gch) {
        GuJ guJ = JPj.A00;
        if (Ic7.A0B(c2420Gch, guJ)) {
            JOW jow = ((Ic7) c2420Gch).A00;
            jow.getClass();
            jow.AdC(guJ);
            throw AnonymousClass001.A0Q("getCameraEventLogger");
        }
        HJS hjs = JQ9.A00;
        JOW jow2 = ((Ic7) c2420Gch).A00;
        jow2.getClass();
        if (jow2.BRE(hjs)) {
            HJS hjs2 = JQ7.A00;
            JOW jow3 = ((Ic7) c2420Gch).A00;
            jow3.getClass();
            if (jow3.BRE(hjs2) && c2420Gch.A0a == null) {
                JQ7 jq7 = (JQ7) Ic7.A08(c2420Gch, hjs2);
                JQ9 jq9 = (JQ9) Ic7.A08(c2420Gch, hjs);
                JQ8 jq8 = c2420Gch.A0b;
                c2420Gch.A0a = new I95(jq9, new GTN((jq8 == null || !jq8.BSa(ActionId.RTMP_CONNECTION_RELEASE)) ? Looper.getMainLooper() : jq7.AoV("Lite-Controller-Thread").getLooper()));
            }
        }
        return c2420Gch.A0a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0145, code lost:
    
        if (r315 != null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.Ie9, X.GuT] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.JGJ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(final X.C2420Gch r301) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2420Gch.A02(X.Gch):void");
    }

    public static void A03(C2420Gch c2420Gch) {
        JNk jNk = c2420Gch.A0g;
        JGD jgd = c2420Gch.A0L;
        if (jgd == null) {
            jgd = new Idq(c2420Gch);
            c2420Gch.A0L = jgd;
        }
        jNk.Ceq(jgd);
        jNk.Cov(null);
        JG9 jg9 = c2420Gch.A0H;
        if (jg9 != null) {
            jNk.CeF(jg9);
        }
        c2420Gch.A0C = null;
        c2420Gch.A0k = false;
        jNk.ANZ(new GuV(c2420Gch, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r306 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(X.C2420Gch r301, X.HzC r302) {
        /*
            r0 = r301
            X.JNk r0 = r0.A0g
            r303 = r0
            r0 = r303
            boolean r0 = r0.isConnected()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L85
            r0 = r302
            if (r0 == 0) goto L85
            r0 = 0
            r305 = r0
            r0 = r301
            android.view.Display r0 = r0.A06     // Catch: java.lang.RuntimeException -> L86
            r306 = r0
            r0 = r301
            android.view.TextureView r0 = r0.A07     // Catch: java.lang.RuntimeException -> L86
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L3f
            r0 = r307
            if (r0 == 0) goto L46
            r0 = r307
            android.view.Display r0 = r0.getDisplay()     // Catch: java.lang.RuntimeException -> L86
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A06 = r1     // Catch: java.lang.RuntimeException -> L86
            r0 = r306
            if (r0 == 0) goto L46
        L3f:
            r0 = r306
            int r0 = r0.getRotation()     // Catch: java.lang.RuntimeException -> L86
            r305 = r0
        L46:
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L65
            r0 = r301
            int r0 = r0.A04
            r308 = r0
            r0 = r301
            int r0 = r0.A02
            r304 = r0
            r0 = r301
            r1 = r302
            r2 = r308
            r3 = r304
            A05(r0, r1, r2, r3)
            return
        L65:
            r0 = r301
            r1 = r305
            r0.A00 = r1
            r0 = 5
            r308 = r0
            X.GuV r0 = new X.GuV
            r307 = r0
            r0 = r307
            r1 = r301
            r2 = r308
            r0.<init>(r1, r2)
            r0 = r303
            r1 = r307
            r2 = r305
            r0.CtD(r1, r2)
        L85:
            return
        L86:
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2420Gch.A04(X.Gch, X.HzC):void");
    }

    public static void A05(C2420Gch c2420Gch, HzC hzC, int i, int i2) {
        IBB ibb;
        if (i <= 0 || i2 <= 0 || (ibb = (IBB) hzC.A03.A05(I82.A0q)) == null) {
            return;
        }
        Matrix A0F = GOn.A0F();
        JNk jNk = c2420Gch.A0g;
        if (jNk.Cwx(A0F, i, i2, ibb.A02, ibb.A01, true)) {
            jNk.BPC(A0F, i, i2, hzC.A01);
            if (c2420Gch.A07 != null) {
                JNZ jnz = c2420Gch.A0R;
                if (jnz == null) {
                    jnz = ((JQ3) Ic7.A07(c2420Gch, JQ3.A00)).BDt();
                    c2420Gch.A0R = jnz;
                }
                jnz.getClass();
                if (jnz.DAd()) {
                    return;
                }
                c2420Gch.A0i.A00.post(new IvX(A0F, c2420Gch));
            }
        }
    }

    public static void A06(C2420Gch c2420Gch, String str) {
        JQ9 A01 = JOW.A01(c2420Gch, ((Ic7) c2420Gch).A00, JQ9.A00);
        I95 A012 = A01(c2420Gch);
        if (A01 == null || A012 == null) {
            return;
        }
        java.util.Map A3w = A01.A3w();
        Hbr hbr = A012.A00;
        if (hbr == null) {
            hbr = new Hbr(A012);
            A012.A00 = hbr;
        }
        A3w.put("timestamp", String.valueOf(hbr.A00.now()));
        A01.BZh(str, "OpticControllerImpl", A3w, GOn.A0B(c2420Gch));
        A01.Cco(A3w);
    }

    @Override // X.JQ2
    public JNk AbG() {
        return this.A0g;
    }

    @Override // X.Ic7, X.JQC
    public GuJ Ase() {
        return JQ2.A00;
    }

    @Override // X.JQ2
    public void CiC() {
        if (this.A0U) {
            A03(this);
            A02(this);
        }
    }

    @Override // X.JQ2
    public void Cod(float f) {
        JNk jNk;
        I1R A0F = A0F();
        if (A0F == null || !GOp.A1Y(I1R.A0J, A0F)) {
            return;
        }
        this.A0S = Float.valueOf(f);
        I1R A0F2 = A0F();
        if (A0F2 == null || (jNk = this.A0g) == null || !jNk.isConnected()) {
            return;
        }
        float A00 = 7zM.A00(A0F2.A02(I1R.A03));
        float A0C = GOq.A0C(I1R.A0n, A0F2) * A00;
        float A0C2 = GOq.A0C(I1R.A0j, A0F2) * A00;
        if (f < A0C) {
            f = A0C;
        } else if (f > A0C2) {
            f = A0C2;
        }
        int A04 = GOn.A04(f, A00);
        I4E i4e = new I4E();
        I4E.A00(I82.A09, i4e, A04);
        jNk.BeT(new GuU(1), i4e.A01());
    }

    @Override // X.JQ2
    public void Coq(int i) {
        if (((AbstractC2421Gci) this).A00 == 1) {
            A00(this).A00 = i;
            return;
        }
        I4E i4e = new I4E();
        HX7 hx7 = I82.A0B;
        int i2 = 4;
        if (i == 0) {
            i2 = 0;
        } else if (i == 1) {
            i2 = 1;
        } else if (i == 2) {
            i2 = 2;
        } else if (i == 3) {
            i2 = 3;
        } else if (i != 4) {
            throw GOp.A16("Could not convert flash mode to optic: ", i);
        }
        I4E.A00(hx7, i4e, i2);
        this.A0g.BeT(new GuU(1), i4e.A01());
    }

    @Override // X.JQ2
    public void CtC(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw AnonymousClass001.A0L("Width or height for the preview aspect ratio cannot be <= 0");
        }
        if (this.A0g.isConnected()) {
            return;
        }
        this.A0Y = 1920;
        this.A0X = GOn.A02(1920.0f / AbstractC2327GOs.A01(i, i2));
    }

    @Override // X.JQ2
    public void CtF(JE9 je9) {
        if (!this.A0V && this.A0U) {
            JNk jNk = this.A0g;
            if (jNk.isConnected()) {
                if (je9 != null) {
                    JGC jgc = this.A0K;
                    if (jgc == null) {
                        jgc = new Idn(this);
                        this.A0K = jgc;
                    }
                    jNk.A6p(jgc);
                } else if (this.A08 != null) {
                    JGC jgc2 = this.A0K;
                    if (jgc2 == null) {
                        jgc2 = new Idn(this);
                        this.A0K = jgc2;
                    }
                    jNk.Cep(jgc2);
                }
            }
        }
        this.A08 = je9;
    }

    @Override // X.JQ2
    public void Cue(boolean z) {
        this.A0W = false;
    }

    @Override // X.JQ2
    public void D3r() {
        if (this.A0V || !this.A0U) {
            return;
        }
        JNk jNk = this.A0g;
        if (jNk.BWX()) {
            SystemClock.elapsedRealtime();
            SystemClock.elapsedRealtime();
            I3h A00 = A00(this);
            A00.A00 = 0;
            if (A00.A02) {
                A00.A00();
            }
            Ht4 ht4 = this.A0N;
            if (ht4 == null) {
                ht4 = new GuV(this, 7);
                this.A0N = ht4;
            }
            jNk.D3q(ht4);
        }
    }

    @Override // X.JQ2
    public void enable(boolean z) {
        if (this.A0U != z) {
            this.A0U = z;
            if (this.A0V) {
                return;
            }
            if (z) {
                A02(this);
            } else {
                A03(this);
            }
        }
    }
}
