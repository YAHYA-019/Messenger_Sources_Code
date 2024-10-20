package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import java.util.concurrent.ScheduledFuture;

/* loaded from: B87.class */
public final class B87 extends BhE implements DIW, DEk {
    public Long A00;
    public ScheduledFuture A01;
    public final int A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final 53M A06;
    public final C1325Ae3 A07;
    public final Context A08;
    public final FbUserSession A09;
    public final C00i A0A;

    public B87(Context context, FbUserSession fbUserSession, 53M r304) {
        super(context, fbUserSession, r304);
        this.A05 = 1BQ.A02(84342);
        1BQ A0X = AbH.A0X();
        this.A0A = A0X;
        this.A07 = new C1325Ae3();
        this.A03 = 1BQ.A02(16465);
        this.A02 = 2yD.A00(AbJ.A0f(A0X), 36606659099368925L);
        this.A06 = r304;
        this.A08 = context;
        this.A09 = fbUserSession;
        this.A04 = 7zL.A0R(context, 84334);
        if (r304 == 53M.A0Q || r304 == 53M.A0U) {
            this.A00 = ((AcP) 1Lo.A04(context, fbUserSession, (1BY) null, 84248)).A0G.A02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r302.A08 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0381, code lost:
    
        if (X.BVm.A00(r0, X.AbF.A0n(r0)) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.5O6 r301, X.ByH r302, X.B87 r303, java.lang.String r304, int r305) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B87.A00(X.5O6, X.ByH, X.B87, java.lang.String, int):void");
    }

    public static boolean A01(C1gb c1gb, Enum r302) {
        boolean z = true;
        11T.A0F(c1gb, 1);
        int ordinal = r302.ordinal();
        if (ordinal == 15) {
            return false;
        }
        if (ordinal == 0) {
            z = !C1gb.A02(c1gb).AZk(36325184122802563L);
        }
        return z;
    }

    public void A5L(DFe dFe) {
        this.A07.A00(dFe);
    }

    public DataSourceIdentifier AgX() {
        return ClientDataSourceIdentifier.A0K;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r308 == (-1)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C1323Ae1 Cpm(X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B87.Cpm(X.ByH, java.lang.Object):X.Ae1");
    }

    @Override // X.DEk
    public void CuT(String str) {
        if (str != null) {
            this.A00 = 1BK.A0n(str);
        }
    }

    public String getFriendlyName() {
        return B87.class.getName();
    }
}
