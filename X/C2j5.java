package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.2j5, reason: invalid class name */
/* loaded from: 2j5.class */
public final class C2j5 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Context A04;
    public final 1De A06;
    public final 1BP A05 = FbInjector.A00;
    public final 1Br A03 = 1Bq.A00(16385);

    public C2j5(1De r302) {
        this.A06 = r302;
        1BY r0 = r302.A00;
        Context context = (Context) 1Bn.A0E((Context) null, r0, 83719);
        this.A04 = context;
        this.A01 = 1HG.A00(context, 100171);
        this.A00 = 1Bq.A00(66227);
        this.A02 = 1Bu.A03(r0, 66463);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (((android.app.ActivityManager) r301.A01.A00.get()).isLowRamDevice() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            r301 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r302 = r0
            r0 = 30
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 < r1) goto L27
            r0 = r301
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0.isLowRamDevice()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L2b
        L27:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L2b:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2j5.A00():boolean");
    }

    public final boolean A01() {
        if (A00() && ((C1uz) this.A00.A00.get()).A02(28)) {
            return ((2yD) ((C2s0) this.A02.A00.get()).A00.A00.get()).AZk(36313046544684551L);
        }
        return false;
    }

    public final boolean A02() {
        return ((2yD) this.A03.A00.get()).AZk(36313046545274377L);
    }
}
