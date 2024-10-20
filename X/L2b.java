package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: L2b.class */
public final class L2b {
    public final QzN A00;
    public final KzB A01;
    public final L9i A02;
    public final MFE A03;
    public final C1Ae A04;
    public final C1Ag A05;
    public final ScheduledExecutorService A06;
    public final boolean A07;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ L2b(KzB kzB, L9i l9i, MFE mfe, C1Ae c1Ae, C1Ag c1Ag, ScheduledExecutorService scheduledExecutorService, int i) {
        Object obj = null;
        KzB obj2 = (i & 16) != 0 ? new Object() : kzB;
        l9i = (i & 32) != 0 ? new L9i(L9i.A01) : l9i;
        obj = (i & 64) != 0 ? new Object() : obj;
        boolean A1N = AnonymousClass001.A1N(i & 128);
        7zT.A1W(scheduledExecutorService, c1Ae, mfe, c1Ag);
        1BL.A1G(obj2, l9i);
        11T.A0F(obj, 7);
        this.A06 = scheduledExecutorService;
        this.A04 = c1Ae;
        this.A03 = mfe;
        this.A05 = c1Ag;
        this.A01 = obj2;
        this.A02 = l9i;
        this.A00 = obj;
        this.A07 = A1N;
    }

    public static final void A00(MIM mim, L2b l2b, String str, List list) {
        0fH.A0j("BLogPlayIntegrityAttestationPerfLogger", "getPlayIntegrityTokenStart");
        C4Ez BGJ = l2b.A03.BGJ(str);
        ScheduledExecutorService scheduledExecutorService = l2b.A06;
        BGJ.A03(new LeD(mim, l2b, str, list), scheduledExecutorService).A0A(new Le3(mim, l2b, str, list, 0), scheduledExecutorService);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final void A01(MIM mim) {
        0fH.A0j("BLogPlayIntegrityAttestationPerfLogger", "playIntegrityAttestationStart");
        0fH.A0j("BLogPlayIntegrityAttestationPerfLogger", "getAttestationChallengeStart");
        ArrayList A0s = AnonymousClass001.A0s();
        C1Ae c1Ae = this.A04;
        GraphQlCallInput dgU = new DgU(64);
        dgU.A09("app_scoped_device_id", c1Ae.A01);
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
        graphQlQueryParamSet.A01(dgU, "input");
        5Dh A00 = 5Dh.A00(graphQlQueryParamSet, new C01643sd(0mY.class, "AppAttestationAndroidGooglePlayIntegrityAttestationChallengeCreate", null, "input", "fbandroid", 1914762815, 384, 3306521706L, 3306521706L, false, true));
        final ?? A0j = 4YU.A0j();
        c1Ae.A00.ARI(new 0pE((Object) A0j, 0), new InterfaceC01743sp() { // from class: X.1Ad
            @Override // X.InterfaceC01743sp
            public final void BQ3(AbstractC08294mh abstractC08294mh) {
                1AR r0;
                1AQ BLD;
                1AW A9L;
                String Ac4;
                if (abstractC08294mh == null || (r0 = (1AR) abstractC08294mh.A00()) == null || (BLD = r0.BLD()) == null || (A9L = BLD.A9L()) == null || (Ac4 = A9L.Ac4()) == null) {
                    SettableFuture.this.setException(AnonymousClass001.A0N("Server returned null challenge nonce"));
                } else {
                    SettableFuture.this.set(Ac4);
                }
            }
        }, A00);
        1Kd.A0F(new LfK(1, A0s, mim, this), (ListenableFuture) A0j, this.A06);
    }
}
