package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import com.facebook.inject.FbInjector;
import java.util.concurrent.Executor;

/* renamed from: X.1yS, reason: invalid class name */
/* loaded from: 1yS.class */
public final class C1yS {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final Context A0D;
    public volatile ConnectivityManager.NetworkCallback A0F;
    public volatile 1PA A0G;
    public volatile 1PA A0H;
    public volatile 1PA A0I;
    public final 1BP A0E = FbInjector.A00;
    public final 1Br A09 = 1Bq.A00(16385);

    public C1yS() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A0D = A00;
        this.A04 = 1HG.A00(A00, 65728);
        this.A06 = 1HG.A00(A00, 65729);
        this.A05 = 1Bq.A00(16687);
        this.A08 = 1Bq.A00(66699);
        this.A0C = 1Bu.A00(16671);
        this.A0B = 1Bq.A00(66687);
        this.A07 = 1Bq.A00(66424);
        this.A0A = 1Bq.A00(66435);
        this.A02 = 1Bq.A00(66591);
        this.A00 = 1Bq.A00(16387);
        this.A01 = 1Bq.A00(16457);
        this.A03 = 1Bq.A00(16782);
    }

    public static final void A00(C1yS c1yS) {
        if (Build.VERSION.SDK_INT < 29 || c1yS.A0F != null) {
            return;
        }
        ((Executor) c1yS.A01.A00.get()).execute(new 1yX(c1yS));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        if (((X.1SI) X.1Br.A0B(r301.A0C)).A09() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(X.C1yS r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A08
            r302 = r0
            r0 = r302
            X.00i r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            r0 = 16385(0x4001, float:2.296E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36317925627408318(0x8106f600002fbe, double:3.030940635096883E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L3c
            r0 = r303
            java.lang.Object r0 = r0.get()
        L36:
            r0 = 0
            r308 = r0
        L39:
            r0 = r308
            return r0
        L3c:
            r0 = r301
            X.1Br r0 = r0.A0C
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.1SI r0 = (X.1SI) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A09()
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L39
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1yS.A01(X.1yS):boolean");
    }
}
