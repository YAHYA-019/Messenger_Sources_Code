package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.util.TriState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: E1r.class */
public final class E1r extends GS2 {
    public int A00;
    public ETl A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final FbUserSession A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 2JM A0N;
    public final HGB A0O;
    public final EeG A0P;
    public final GF7 A0Q;
    public final MigColorScheme A0R;
    public final 1De A0S;
    public final 1Br A0T;
    public final DEx A0U;
    public final Runnable A0V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1r(FbUserSession fbUserSession, 1De r303) {
        super("CoplayContainerPresenter");
        11T.A0F(fbUserSession, 2);
        this.A0S = r303;
        this.A0B = fbUserSession;
        1BY r0 = r303.A00;
        this.A0F = 1Bu.A03(r0, 85227);
        this.A0G = 1Bu.A03(r0, 67677);
        this.A0I = 1Lm.A03(fbUserSession, r0, 99472);
        this.A0T = 1Lm.A03(fbUserSession, r0, 99471);
        this.A0J = 1Lm.A03(fbUserSession, r0, 99474);
        this.A0M = 1Lm.A03(fbUserSession, r0, 33088);
        this.A0L = 1Bq.A00(98346);
        this.A0C = 1Lm.A03(fbUserSession, r0, 98492);
        this.A0E = 1Bu.A03(r0, 85233);
        this.A0R = (MigColorScheme) 1Bn.A0E((Context) null, r0, 16980);
        this.A0H = 1Lm.A03(fbUserSession, r0, 85234);
        this.A0D = 1Lm.A03(fbUserSession, r0, 99475);
        this.A0K = 1Lm.A03(fbUserSession, r0, 99470);
        this.A04 = true;
        this.A0A = AnonymousClass001.A07();
        this.A0N = new Fjm(this, 2);
        FjN fjN = new FjN(this);
        this.A0U = fjN;
        ((CNU) 1Br.A0B(this.A0H)).A09.add(fjN);
        this.A0V = new G0K(this);
        this.A0O = new Gpl(this, 8);
        this.A0P = new EeG(this);
        this.A01 = new E1m(this, 1);
        this.A0Q = new Fjq(this);
    }

    public static final CNQ A00(E1r e1r) {
        return DKG.A0Z(e1r.A0F);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.RPL, java.lang.Object] */
    private final RPL A01() {
        if (!A0V().isPresent()) {
            return new RPL();
        }
        RrM rrM = (RrM) A0V().get();
        ?? obj = new Object();
        ((RPL) obj).A08 = AnonymousClass001.A0v();
        rrM.getClass();
        ((RPL) obj).A06 = rrM.A06;
        ((RPL) obj).A05 = rrM.A05;
        ((RPL) obj).A09 = rrM.A09;
        ((RPL) obj).A0A = rrM.A0A;
        ((RPL) obj).A0B = rrM.A0B;
        ((RPL) obj).A0C = rrM.A0C;
        ((RPL) obj).A0D = rrM.A0D;
        ((RPL) obj).A0E = rrM.A0E;
        ((RPL) obj).A0F = rrM.A0F;
        ((RPL) obj).A0G = rrM.A0G;
        ((RPL) obj).A04 = rrM.A04;
        ((RPL) obj).A07 = rrM.A07;
        ((RPL) obj).A00 = rrM.A00;
        ((RPL) obj).A01 = rrM.A01;
        ((RPL) obj).A02 = rrM.A02;
        ((RPL) obj).A0H = rrM.A0H;
        ((RPL) obj).A03 = rrM.A03;
        ((RPL) obj).A08 = AbF.A1E(rrM.A08);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (((X.FAb) X.1Br.A0B(r0)).A05 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.E1r r301) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1r.A02(X.E1r):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0040, code lost:
    
        if (X.1Br.A06(((X.FFo) r0.get()).A08).AZk(36313905541553358L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A03(X.E1r r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A0G
            X.00i r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.FFo r0 = (X.FFo) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0T
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L43
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.FFo r0 = (X.FFo) r0
            X.1Br r0 = r0.A08
            X.1CO r0 = X.1Br.A06(r0)
            r301 = r0
            r0 = 36313905541553358(0x81034e00361cce, double:3.02839831661462E-306)
            r305 = r0
            r0 = r301
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r307
            if (r0 == 0) goto L45
        L43:
            r0 = 1
            r304 = r0
        L45:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1r.A03(X.E1r):boolean");
    }

    public TriState A0U() {
        return TriState.YES;
    }

    public void A0b() {
        ((2JN) 1Br.A0B(this.A0M)).A02(this.A0N);
        ((IMK) 1Br.A0B(this.A0C)).A0A(this.A0O);
        ((FAb) 1Br.A0B(this.A0I)).A06(this.A01);
        ((FI3) 1Br.A0B(this.A0L)).A01 = 7zL.A14((Object) null);
        this.A0A.removeCallbacksAndMessages(null);
        CNU cnu = (CNU) 1Br.A0B(this.A0H);
        DEx dEx = this.A0U;
        if (dEx != null) {
            cnu.A09.remove(dEx);
        }
        EzE ezE = (EzE) 1Br.A0B(this.A0K);
        GF7 gf7 = this.A0Q;
        if (gf7 != null) {
            ezE.A04.remove(gf7);
        }
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        11T.A0F(jFq, 0);
        this.A04 = true;
        ((2JN) 1Br.A0B(this.A0M)).A03(this.A0N, AnonymousClass001.A0v());
        ((IMK) 1Br.A0B(this.A0C)).A09(this.A0O);
        ((FAb) 1Br.A0B(this.A0I)).A05(this.A01);
        ((FI3) 1Br.A0B(this.A0L)).A01 = 7zL.A14(this);
        EzE ezE = (EzE) 1Br.A0B(this.A0K);
        GF7 gf7 = this.A0Q;
        if (gf7 != null) {
            ezE.A04.add(gf7);
        }
        A02(this);
    }

    public void A0d() {
        String A0k;
        1Br r0 = this.A0I;
        2JX r02 = ((FAb) 1Br.A0B(r0)).A00;
        if (r02 == null || (A0k = r02.A0k()) == null) {
            return;
        }
        if (A03(this)) {
            ((FAb) 1Br.A0B(r0)).A07 = true;
            A02(this);
        }
        try {
            2JX r03 = ((FAb) 1Br.A0B(r0)).A00;
            if (r03 != null) {
                2JX A1Q = r03.A1Q();
                if (A1Q != null) {
                    CNU cnu = (CNU) 1Br.A0B(this.A0H);
                    C1706Aqc A23 = A1Q.A23();
                    11T.A0A(A23);
                    cnu.A02(A23, new FjK(this, A0k));
                }
            }
        } catch (NumberFormatException e) {
            4zI.A03.A02("CoplayContainerPresenter", "Match ID is not of type long", e, new Object[0]);
            if (A03(this)) {
                ((FAb) 1Br.A0B(r0)).A07 = false;
                A02(this);
            }
        }
    }

    public void A0e(Context context) {
        C6J A03;
        BOX box;
        1Br r0 = this.A0I;
        if (((FAb) 1Br.A0B(r0)).A03 == 0S2.A00) {
            ((FAb) 1Br.A0B(r0)).A07(0S2.A01);
            A03 = DKG.A0Z(this.A0F).A02(BOk.A0N, this.A0B);
            box = BOX.A0B;
        } else {
            Activity A04 = 0NA.A04(context);
            if (A04 != null) {
                C6J A032 = DKG.A0Z(this.A0F).A03(this.A0B);
                A032.A01 = BOX.A0A;
                A032.A00();
                1Iw A0W = 7zL.A0W(5YG.A01(context));
                DfK dfK = new DfK(A0W);
                dfK.A01(ImmutableList.of());
                C2154Dfi c2154Dfi = new C2154Dfi(A0W);
                c2154Dfi.A0f(2131955065);
                dfK.A00 = new Ecw(c2154Dfi);
                C2164Dfs c2164Dfs = new C2164Dfs(A0W);
                C2169Dfx A00 = C2169Dfx.A00(c2164Dfs, A0W, 2131955065);
                A00.A0f(3Eh.AB6);
                c2164Dfs.A03 = new REF(A00);
                c2164Dfs.A02 = FXr.A02(this, ActionId.RTMP_CONNECTION_REQUESTED);
                c2164Dfs.A01 = 2;
                REE ree = new REE(c2164Dfs);
                ImmutableList.Builder builder = dfK.A02;
                builder.m11011add((Object) ree);
                C2164Dfs c2164Dfs2 = new C2164Dfs(A0W);
                C2169Dfx A002 = C2169Dfx.A00(c2164Dfs2, A0W, 2131955053);
                A002.A0f(3Eh.AAJ);
                c2164Dfs2.A03 = new REF(A002);
                c2164Dfs2.A02 = new CZE(context, this, 49);
                c2164Dfs2.A01 = 2;
                builder.m11011add((Object) new REE(c2164Dfs2));
                ExT A003 = FFw.A00(A0W);
                A003.A02 = A04;
                A003.A0C = dfK;
                A003.A07 = Fdx.A00;
                A003.A00(CallerContext.A0B("CoplayContainerPresenter")).A04();
                return;
            }
            boolean A0A = ((FAb) 1Br.A0B(r0)).A0A();
            CR1 cr1 = new CR1(5, this, A0A);
            CR1 cr12 = new CR1(4, this, A0A);
            1Br r02 = this.A0F;
            CNQ A0Z = DKG.A0Z(r02);
            FbUserSession fbUserSession = this.A0B;
            C6J A02 = A0Z.A02(BOk.A01, fbUserSession);
            A02.A00 = BOh.A0G;
            A02.A00();
            boolean A0A2 = ((FAb) 1Br.A0B(r0)).A0A();
            MigColorScheme migColorScheme = this.A0R;
            if (A0A2) {
                11T.A0F(migColorScheme, 1);
                C2121Dea c2121Dea = new C2121Dea(context, migColorScheme.Aho());
                c2121Dea.A06(2131955062);
                c2121Dea.A05(2131955061);
                c2121Dea.A0D(cr12, 2131955072);
                c2121Dea.A0E(cr1, 2131955060);
                DMV A0I = c2121Dea.A0I();
                A0I.setOnShowListener(new FKH(1, A0I, migColorScheme, true));
                A0I.show();
                A03 = DKG.A0Z(r02).A03(fbUserSession);
                box = BOX.A03;
            } else {
                11T.A0F(migColorScheme, 1);
                C2121Dea c2121Dea2 = new C2121Dea(context, migColorScheme.Aho());
                c2121Dea2.A06(2131955067);
                c2121Dea2.A05(2131955066);
                c2121Dea2.A0D(cr12, 2131955072);
                c2121Dea2.A0E(cr1, 2131955065);
                DMV A0I2 = c2121Dea2.A0I();
                A0I2.setOnShowListener(new FKH(1, A0I2, migColorScheme, false));
                A0I2.show();
                A03 = DKG.A0Z(r02).A03(fbUserSession);
                box = BOX.A0A;
            }
        }
        A03.A01 = box;
        A03.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0103 A[Catch: NumberFormatException -> 0x0167, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0167, blocks: (B:32:0x00a3, B:33:0x00a9, B:34:0x00b0, B:35:0x00b7, B:36:0x00bc, B:37:0x00c3, B:38:0x00ca, B:41:0x00d6, B:44:0x00e2, B:45:0x00e9, B:46:0x00f0, B:47:0x00f7, B:50:0x0103, B:53:0x010f, B:54:0x0116, B:55:0x011d, B:56:0x0124, B:59:0x0130, B:62:0x013c, B:64:0x014d), top: B:31:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130 A[Catch: NumberFormatException -> 0x0167, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0167, blocks: (B:32:0x00a3, B:33:0x00a9, B:34:0x00b0, B:35:0x00b7, B:36:0x00bc, B:37:0x00c3, B:38:0x00ca, B:41:0x00d6, B:44:0x00e2, B:45:0x00e9, B:46:0x00f0, B:47:0x00f7, B:50:0x0103, B:53:0x010f, B:54:0x0116, B:55:0x011d, B:56:0x0124, B:59:0x0130, B:62:0x013c, B:64:0x014d), top: B:31:0x00a3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0f(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1r.A0f(java.lang.String):void");
    }

    public void A0g(boolean z) {
        ((EzE) 1Br.A0B(this.A0K)).A00(z);
    }
}
