package X;

import android.os.Handler;
import android.view.View;
import java.util.List;

/* loaded from: Gts.class */
public final class Gts extends GuG implements JQ3, JLp, JO0 {
    public static final Object A0N = AnonymousClass001.A0R();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public JKN A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public final Handler A0B;
    public final Id5 A0C;
    public final I4V A0D;
    public final I4V A0E;
    public final Object A0F;
    public final boolean A0G;
    public final IeW A0H;
    public final boolean A0I;
    public volatile JLq A0J;
    public volatile IGl A0K;
    public volatile I5d A0L;
    public volatile I5d A0M;

    public Gts(JOW jow) {
        super(jow);
        Hvf hvf = JO0.A00;
        Object obj = A0N;
        JOW jow2 = ((GuG) this).A00;
        Object Adn = jow2.Adn(hvf);
        this.A0F = Adn != null ? Adn : obj;
        Hvf hvf2 = JO0.A02;
        Object A0K = AnonymousClass001.A0K();
        Object obj2 = A0K;
        Object Adn2 = jow2.Adn(hvf2);
        this.A0I = AnonymousClass001.A1V(Adn2 != null ? Adn2 : obj2);
        Object Adn3 = jow2.Adn(JO0.A01);
        this.A0G = AnonymousClass001.A1V(Adn3 != null ? Adn3 : A0K);
        this.A0E = I4V.A00();
        this.A0D = I4V.A00();
        this.A0B = ((JQ7) jow2.AdD(JQ7.A00)).AoV("Lite-SurfacePipe-Thread");
        this.A0H = new IeW(this);
        this.A0C = new Id5(this);
    }

    public static void A00(Gts gts) {
        IGl iGl = gts.A0K;
        A03(iGl, gts.A0M);
        List list = gts.A0E.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            A03(iGl, (I5d) list.get(i2));
            i = i2 + 1;
        }
    }

    public static void A01(Gts gts) {
        int i;
        int i2;
        int i3;
        IGl iGl = gts.A0K;
        I5d i5d = gts.A0L;
        I5d i5d2 = gts.A0M;
        int i4 = gts.A03;
        if (i4 == 0 || (i = gts.A01) == 0 || (i2 = gts.A08) == 0 || (i3 = gts.A07) == 0 || iGl == null || i5d == null || i5d2 == null) {
            return;
        }
        int i5 = gts.A02 - gts.A04;
        int i6 = i4;
        int i7 = i;
        if (i5 % 180 == 0) {
            i7 = i4;
            i6 = i;
        }
        boolean z = gts.A0I;
        if (!z || (i7 >= i2 && i6 >= i3)) {
            gts.A0A = i2;
            gts.A09 = i3;
        } else {
            float f = i7;
            float f2 = i6;
            float f3 = f / f2;
            float f4 = i2 / i3;
            if (f4 < f3) {
                gts.A0A = (int) (f2 * f4);
            } else {
                gts.A0A = i7;
                i6 = (int) (f / f4);
            }
            gts.A09 = i6;
        }
        i5d.A02(i4, i, i5, gts.A06);
        i5d.A03 = gts.A02;
        if (z) {
            int i8 = gts.A0A;
            int i9 = gts.A09;
            synchronized (i5d2) {
                i5d2.A02(i8, i9, 0, false);
            }
        }
        int i10 = gts.A0A;
        int i11 = gts.A09;
        int i12 = gts.A02;
        int i13 = gts.A00;
        boolean z2 = gts.A06;
        List list = gts.A0D.A00;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((JG4) list.get(i14)).CAR(i10, i11, i12, i13, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        r0.A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r0.A02();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(X.IGl r301, X.I5d r302) {
        /*
            r0 = r302
            if (r0 == 0) goto L7c
            r0 = r301
            if (r0 == 0) goto L7c
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.I5G r0 = r0.A02     // Catch: java.lang.Throwable -> L77
            r303 = r0
            r0 = r303
            android.opengl.EGLDisplay r0 = r0.A02     // Catch: java.lang.Throwable -> L77
            r304 = r0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY     // Catch: java.lang.Throwable -> L77
            r303 = r0
            r0 = r304
            r1 = r303
            boolean r0 = X.AnonymousClass001.A1W(r0, r1)     // Catch: java.lang.Throwable -> L77
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L74
            r0 = r301
            X.I4V r0 = r0.A00     // Catch: java.lang.Throwable -> L77
            r306 = r0
            r0 = r306
            java.util.List r0 = r0.A00     // Catch: java.lang.Throwable -> L77
            r307 = r0
            r0 = r307
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L77
            r308 = r0
            r0 = 0
            r309 = r0
        L3d:
            r0 = r309
            r1 = r308
            if (r0 >= r1) goto L74
            r0 = r307
            r1 = r309
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L77
            r304 = r0
            r0 = r304
            X.Hua r0 = (X.Hua) r0     // Catch: java.lang.Throwable -> L77
            r304 = r0
            r0 = r304
            X.I5d r0 = r0.A02     // Catch: java.lang.Throwable -> L77
            r303 = r0
            r0 = r303
            r1 = r302
            if (r0 != r1) goto L6b
            r0 = r306
            r1 = r304
            boolean r0 = r0.A03(r1)     // Catch: java.lang.Throwable -> L77
            r0 = r304
            r0.A02()     // Catch: java.lang.Throwable -> L77
            goto L74
        L6b:
            r0 = r309
            r1 = 1
            int r0 = r0 + r1
            r309 = r0
            goto L3d
        L74:
            r0 = r301
            monitor-exit(r0)
            return
        L77:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gts.A02(X.IGl, X.I5d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r0 = r0.A00(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        r0.A02(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(X.IGl r301, X.I5d r302) {
        /*
            r0 = r302
            if (r0 == 0) goto L8e
            r0 = r301
            if (r0 == 0) goto L8e
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.I5G r0 = r0.A02     // Catch: java.lang.Throwable -> L87
            r303 = r0
            r0 = r303
            android.opengl.EGLDisplay r0 = r0.A02     // Catch: java.lang.Throwable -> L87
            r304 = r0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY     // Catch: java.lang.Throwable -> L87
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.AnonymousClass001.A1W(r0, r1)     // Catch: java.lang.Throwable -> L87
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L84
            r0 = r301
            X.I4V r0 = r0.A00     // Catch: java.lang.Throwable -> L87
            r307 = r0
            r0 = r307
            java.util.List r0 = r0.A00     // Catch: java.lang.Throwable -> L87
            r308 = r0
            r0 = r308
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L87
            r309 = r0
            r0 = 0
            r310 = r0
            r0 = 0
            r304 = r0
        L41:
            r0 = r310
            r1 = r309
            if (r0 >= r1) goto L70
            r0 = r308
            r1 = r310
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L87
            r305 = r0
            r0 = r305
            X.Hua r0 = (X.Hua) r0     // Catch: java.lang.Throwable -> L87
            r305 = r0
            r0 = r305
            X.I5d r0 = r0.A02     // Catch: java.lang.Throwable -> L87
            r305 = r0
            r0 = r305
            r1 = r302
            if (r0 == r1) goto L84
            r0 = r310
            r1 = 1
            int r0 = r0 + r1
            r310 = r0
            goto L41
        L70:
            r0 = r303
            r1 = r302
            X.Hua r0 = r0.A00(r1)     // Catch: java.lang.Throwable -> L87
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L84
            r0 = r307
            r1 = r305
            boolean r0 = r0.A02(r1)     // Catch: java.lang.Throwable -> L87
        L84:
            r0 = r301
            monitor-exit(r0)
            return
        L87:
            r305 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r305
            throw r0
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gts.A03(X.IGl, X.I5d):void");
    }

    public void A0A() {
        GuJ guJ = JPw.A00;
        if (((GuG) this).A00.BRD(guJ)) {
            this.A0J = ((JPw) A0B(guJ)).B6v();
        }
    }

    @Override // X.JQ3
    public void A6y(I5d i5d) {
        this.A0E.A02(i5d);
        A03(this.A0K, i5d);
    }

    @Override // X.JQ3
    public void A7V(JG4 jg4) {
        if (this.A0D.A02(jg4)) {
            int i = this.A0A;
            int i2 = this.A09;
            int i3 = this.A02;
            int i4 = this.A00;
            boolean z = this.A06;
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
        return this.A0H;
    }

    @Override // X.JQ3
    public boolean BNd() {
        return false;
    }

    @Override // X.JLp
    public void CDg(I5d i5d) {
        IGl iGl = this.A0K;
        I5d i5d2 = this.A0M;
        if (i5d2 != null && i5d2 != i5d) {
            A02(iGl, i5d2);
            i5d2.A01();
        }
        this.A0M = i5d;
        A03(iGl, i5d);
    }

    @Override // X.JLp
    public void CDh(I5d i5d) {
        IGl iGl = this.A0K;
        I5d i5d2 = this.A0M;
        if (i5d2 != null) {
            A02(iGl, i5d2);
            i5d2.A01();
        }
        this.A0M = null;
    }

    @Override // X.JLp
    public void CDi(I5d i5d, int i, int i2) {
        this.A08 = i;
        this.A07 = i2;
        this.A0B.post(new Ise(this));
    }

    @Override // X.JLp
    public void CDj(I5d i5d) {
    }

    @Override // X.JLp
    public void CDl(View view) {
    }

    @Override // X.JQ3
    public void Ceu(I5d i5d) {
        this.A0E.A03(i5d);
        A02(this.A0K, i5d);
    }

    @Override // X.JQ3
    public void CfE(JG4 jg4) {
        this.A0D.A03(jg4);
    }

    @Override // X.JQ3
    public void Co6(boolean z) {
    }

    @Override // X.JQ3
    public void Cpk(Object obj, int i, int i2, int i3) {
        throw AnonymousClass001.A0q("setInput not supported");
    }

    @Override // X.JQ3
    public /* synthetic */ void Cpl(int i, Object obj, int i2, int i3, int i4) {
        throw AnonymousClass001.A0q("setInput not supported");
    }

    @Override // X.JQ3
    public /* synthetic */ void Cs5(HJY hjy, Object obj) {
    }

    @Override // X.JQ3
    public void CtE(boolean z) {
        I5d i5d = this.A0M;
        if (i5d != null) {
            i5d.A0E = z;
        }
    }

    @Override // X.JQ3
    public /* synthetic */ void CtN(HWr hWr) {
    }

    @Override // X.JQ3
    public void CwK(JKN jkn) {
        this.A05 = jkn;
    }
}
