package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: Fud.class */
public final class Fud implements C41k {
    public Context A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final Set A07;
    public final C41i A08;

    /* JADX WARN: Type inference failed for: r0v38, types: [X.3sk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.3sk, java.lang.Object] */
    public Fud() {
        1BQ A02 = 1BQ.A02(16650);
        this.A05 = A02;
        this.A04 = 1BQ.A00();
        this.A06 = 1BV.A00(32811);
        this.A01 = 1BQ.A02(98628);
        this.A07 = AnonymousClass001.A0v();
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A02 = AbF.A0Q(A00, 65728);
        this.A03 = 1BQ.A02(83426);
        C41i c41i = (C41i) 1Bi.A03(32879);
        this.A08 = c41i;
        c41i.A00.add(this);
        1Pp r0 = ((ZeroSDKServiceProvider) A02.get()).A07;
        FbUserSession A002 = 1Fw.A00();
        A00(A002, r0, 1QE.A02);
        A00(A002, r0, 1QE.A01);
        ?? obj = new Object();
        FuI fuI = new FuI(this, 2);
        C01853t4 c01853t4 = C01853t4.A00;
        5Y4.A00((InterfaceC01693sk) obj, c01853t4, r0, fuI);
        5Y4.A00((InterfaceC01693sk) new Object(), c01853t4, r0, new FuI(this, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3sk, java.lang.Object, X.FtW] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.3sk, java.lang.Object, X.FtW] */
    private void A00(FbUserSession fbUserSession, 1Pp r303, 1QE r304) {
        ?? obj = new Object();
        ((FtW) obj).A00 = r304;
        C3sw A00 = FuG.A00((InterfaceC01693sk) obj, 14);
        4WL r0 = new 4WL(fbUserSession, this, r304);
        C01853t4 c01853t4 = C01853t4.A00;
        5Y4.A00(A00, c01853t4, r303, r0);
        ?? obj2 = new Object();
        ((FtW) obj2).A00 = r304;
        5Y4.A00(FuG.A00((InterfaceC01693sk) obj2, 15), c01853t4, r303, new FuJ(this, r304));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (X.1BK.A0N(r301.A04).AZr(X.1GD.A05, 36314734466769044L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.Fud r301) {
        /*
            r0 = r301
            X.00i r0 = r0.A06
            java.lang.String r0 = X.DKE.A0s(r0)
            r302 = r0
            java.lang.String r0 = "wifi"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L38
            r0 = r301
            X.00i r0 = r0.A04
            X.2yD r0 = X.1BK.A0N(r0)
            r301 = r0
            r0 = 36314734466769044(0x81040f00012094, double:3.028922532258834E-306)
            r305 = r0
            X.1GD r0 = X.1GD.A05
            r303 = r0
            r0 = r301
            r1 = r303
            r2 = r305
            boolean r0 = r0.AZr(r1, r2)
            r307 = r0
            r0 = 1
            r304 = r0
            r0 = r307
            if (r0 == 0) goto L3c
        L38:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L3c:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fud.A01(X.Fud):boolean");
    }

    @Override // X.C41k
    public void C0v(java.util.Map map) {
        3oH r0 = ((ZeroSDKServiceProvider) this.A05.get()).A00;
        if (r0 != null) {
            1QC r02 = new 1QC();
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                DKC.A1T(r02, A0z.getKey(), A0z.getValue());
            }
            r0.ANn(new EDn(r02));
        }
    }

    @Override // X.C41k
    public void C0w() {
        3oH r0 = ((ZeroSDKServiceProvider) this.A05.get()).A00;
        if (r0 != null) {
            r0.ANn(new Object());
        }
    }
}
