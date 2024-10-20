package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.msys.mci.PrivacyContext;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: Cq3.class */
public final class Cq3 implements DIW {
    public 5O6 A00;
    public Long A01;
    public Future A02;
    public final C0dp A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final ClientDataSourceIdentifier A0D;
    public final 53M A0E;
    public final PrivacyContext A0F;
    public final boolean A0G;
    public final Context A0H;
    public final FbUserSession A0I;
    public final 1Br A0C = AbG.A0S();
    public final C1325Ae3 A0J = new C1325Ae3();

    public Cq3(Context context, FbUserSession fbUserSession, 53M r304, boolean z) {
        this.A0H = context;
        this.A0I = fbUserSession;
        this.A0E = r304;
        this.A0G = z;
        this.A04 = 1Bu.A01(context, 16454);
        this.A07 = 1Lm.A00(context, fbUserSession, 33183);
        this.A09 = 1Lm.A00(context, fbUserSession, 84155);
        this.A08 = 1Lm.A00(context, fbUserSession, 84156);
        this.A05 = 1Lm.A00(context, fbUserSession, 67395);
        this.A0B = 1Lm.A00(context, fbUserSession, 84346);
        this.A06 = 1Bu.A01(context, 84334);
        0rI r0 = 0rI.A00;
        11T.A0A(r0);
        this.A03 = r0;
        this.A0F = AbH.A0t("FBLegacyBroker", "2971616476299527");
        1Br A00 = 1Lm.A00(context, fbUserSession, 84248);
        this.A0A = A00;
        if (r304 == 53M.A0Q) {
            this.A01 = ((AcP) 1Br.A0B(A00)).A0G.A02;
        }
        this.A0D = z ? ClientDataSourceIdentifier.A0N : ClientDataSourceIdentifier.A0O;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(2:79|(16:81|8|(1:76)(3:12|13|14)|15|(17:17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(12:37|38|39|40|42|(2:44|(1:52)(3:48|(1:50)|51))|53|(1:55)(1:63)|56|(1:58)(1:62)|59|60))(1:73)|68|39|40|42|(0)|53|(0)(0)|56|(0)(0)|59|60))|5|6|7|8|(1:10)|76|15|(0)(0)|68|39|40|42|(0)|53|(0)(0)|56|(0)(0)|59|60) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.AcX A00(X.Cq3 r301, X.BEP r302, int r303, long r304) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cq3.A00(X.Cq3, X.BEP, int, long):X.AcX");
    }

    public static final ImmutableList A01(Cq3 cq3, C96 c96, BEP bep) {
        ImmutableList.Builder A0h = 4YU.A0h();
        ImmutableList.Builder A0h2 = 4YU.A0h();
        int A00 = 1qX.A00(bep);
        for (int i = 0; i < A00; i++) {
            A0h2.m11011add((Object) A00(cq3, bep, i, 0L));
            A0h.m11011add((Object) 1BK.A0m(((1qX) bep).mResultSet, i, 0));
        }
        ImmutableList A01 = 1Fj.A01(A0h);
        if (AbL.A0N(cq3.A0C).AZk(36319227002959575L)) {
            synchronized (cq3) {
                Future future = cq3.A02;
                if (future != null) {
                    future.cancel(false);
                }
                cq3.A02 = null;
                cq3.A02 = ((ExecutorService) 1Br.A0B(cq3.A04)).submit(new DB5(5, c96, cq3, bep, A01));
            }
        }
        ImmutableList build = A0h2.build();
        5O6 r0 = cq3.A00;
        if (r0 != null) {
            if (!build.isEmpty()) {
                ((AcX) build.get(0)).A01 = r0;
            }
            AbF.A1S(r0, build);
            ((2eN) 1Br.A0B(cq3.A06)).A01(r0, "search ended");
        }
        11T.A0D(build);
        return build;
    }

    private final SettableFuture A02(boolean z) {
        SettableFuture A0j = 4YU.A0j();
        BDT bdt = (BDT) 1Br.A0B(this.A09);
        C00i c00i = this.A0C.A00;
        int i = 20;
        if (!AbK.A0l(c00i).AZk(36323242798827907L) && !z) {
            i = 3;
            if (this.A0G) {
                i = 5;
            }
        }
        bdt.A00(new Czk(A0j, 96), i, 2To.A0F.msysDbValue, false, false, AbK.A0l(c00i).AZk(36323242797451638L), false);
        return A0j;
    }

    public static final void A03(Cq3 cq3, C96 c96, ImmutableList immutableList) {
        C1333AeN c1333AeN = new C1333AeN(EnumC1297Ada.A0c, immutableList, null);
        ((C6p) 1Br.A0B(cq3.A0B)).A01(c96, c1333AeN, "SuggestedCommunityThreadsDataSource");
        cq3.A0J.BsT(new C1323Ae1(ImmutableList.of((Object) c1333AeN), 0S2.A0C), cq3, null, c96);
    }

    public final ImmutableList A04(C96 c96, boolean z) {
        String str;
        try {
            BEP bep = (BEP) A02(z).get();
            if (bep != null) {
                return A01(this, c96, bep);
            }
        } catch (InterruptedException e) {
            e = e;
            str = "InterruptedException while loading channel info from msys";
            0fH.A0s("SuggestedCommunityThreadsDataSource", str, e);
            return 1BK.A0b();
        } catch (ExecutionException e2) {
            e = e2;
            str = "ExecutionException while loading channel info from msys";
            0fH.A0s("SuggestedCommunityThreadsDataSource", str, e);
            return 1BK.A0b();
        }
        return 1BK.A0b();
    }

    public void A5L(DFe dFe) {
        11T.A0F(dFe, 0);
        this.A0J.A00(dFe);
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r306 == null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C1323Ae1 Cpm(X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cq3.Cpm(X.ByH, java.lang.Object):X.Ae1");
    }

    public String getFriendlyName() {
        return "SuggestedCommunityThreadsDataSource";
    }
}
