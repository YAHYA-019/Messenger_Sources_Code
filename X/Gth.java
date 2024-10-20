package X;

import android.content.Context;
import android.os.Handler;

/* loaded from: Gth.class */
public final class Gth extends GuG implements JPe {
    public int A00;
    public int A01;
    public Handler A02;
    public final Context A03;
    public final I4V A04;
    public final C01i A05;
    public final C01i A06;
    public final boolean A07;

    public Gth(JOW jow) {
        super(jow);
        this.A07 = true;
        this.A04 = I4V.A00();
        Context context = jow.getContext();
        11T.A0A(context);
        this.A03 = context;
        C03i c03i = C03i.A02;
        this.A05 = C01g.A00(c03i, new J8q(this, 31));
        this.A06 = C01g.A00(c03i, new J8q(this, 32));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r304 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r0 = r304.getRotation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r0 == 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        return 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r0 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r0 != 3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        r302 = 270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        return 180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0057, code lost:
    
        if (r304 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A00(X.Gth r301) {
        /*
            r0 = 0
            r302 = r0
            X.GuJ r0 = X.JQ1.A00     // Catch: java.lang.RuntimeException -> L8e
            r303 = r0
            r0 = r301
            r1 = r303
            X.JQC r0 = r0.A0B(r1)     // Catch: java.lang.RuntimeException -> L8e
            r304 = r0
            r0 = r304
            X.11T.A0A(r0)     // Catch: java.lang.RuntimeException -> L8e
            r0 = r304
            X.JQ1 r0 = (X.JQ1) r0     // Catch: java.lang.RuntimeException -> L8e
            r304 = r0
            r0 = r304
            boolean r0 = r0.BNN()     // Catch: java.lang.RuntimeException -> L8e
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L41
            r0 = r301
            r1 = r303
            X.JQC r0 = r0.A0B(r1)     // Catch: java.lang.RuntimeException -> L8e
            r304 = r0
            r0 = r304
            X.11T.A0A(r0)     // Catch: java.lang.RuntimeException -> L8e
            r0 = r304
            X.JQ1 r0 = (X.JQ1) r0     // Catch: java.lang.RuntimeException -> L8e
            r304 = r0
            r0 = r304
            android.view.View r0 = r0.B4V()     // Catch: java.lang.RuntimeException -> L8e
            r304 = r0
            r0 = r304
            android.view.Display r0 = r0.getDisplay()     // Catch: java.lang.RuntimeException -> L8e
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L5a
        L41:
            r0 = r301
            android.content.Context r0 = r0.A03     // Catch: java.lang.RuntimeException -> L8e
            r304 = r0
            r0 = r304
            android.view.WindowManager r0 = X.GOo.A0G(r0)     // Catch: java.lang.RuntimeException -> L8e
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L88
            r0 = r304
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.RuntimeException -> L8e
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L88
        L5a:
            r0 = r304
            int r0 = r0.getRotation()     // Catch: java.lang.RuntimeException -> L8e
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 == r1) goto L6d
            goto L70
        L6d:
            r0 = 90
            return r0
        L70:
            r0 = 2
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 == r1) goto L8a
            r0 = 3
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L88
            r0 = 270(0x10e, float:3.78E-43)
            r302 = r0
        L88:
            r0 = r302
            return r0
        L8a:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        L8e:
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gth.A00(X.Gth):int");
    }

    public static final void A01(Gth gth, final C00m c00m) {
        Handler handler = gth.A02;
        if (handler == null) {
            HJS hjs = JQ7.A00;
            JOW jow = ((GuG) gth).A00;
            if (jow.BRE(hjs)) {
                gth.A02 = JOW.A00(jow, hjs);
            }
            handler = gth.A02;
            if (handler == null) {
                c00m.invoke();
                return;
            }
        }
        handler.post(new Runnable() { // from class: X.Iok
            public static final String __redex_internal_original_name = "OrientationControllerImpl$sam$java_lang_Runnable$0";

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C00m.this.invoke();
            }
        });
    }

    public void A0A() {
        JQC A0B = A0B(JQ1.A00);
        11T.A0A(A0B);
        ((JQ1) A0B).A78((JLp) this.A05.getValue());
    }

    @Override // X.JQC
    public GuJ Ase() {
        GuJ guJ = JPe.A00;
        11T.A0B(guJ);
        return guJ;
    }
}
