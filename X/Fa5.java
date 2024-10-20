package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* loaded from: Fa5.class */
public final class Fa5 implements GHT {
    public final /* synthetic */ Fwk A00;
    public final /* synthetic */ FHh A01;
    public final /* synthetic */ GJj A02;

    public Fa5(Fwk fwk, FHh fHh, GJj gJj) {
        this.A00 = fwk;
        this.A02 = gJj;
        this.A01 = fHh;
    }

    public void Bs6() {
        DKM A00 = DKM.A00();
        A00.A0H(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
        A00.A0I((Object) null);
        A00.A0J((Object) null, 2);
        A00.A0J((Object) null, 3);
        A00.A0J((Object) null, 4);
        FEK.A00(this.A01, DKM.A07(A00, (Object) null, 5), this.A02);
    }

    public void Bs7(String str, String str2) {
        boolean A1X = 1BL.A1X(str, str2);
        FEg fEg = (FEg) 1Bn.A0E(this.A00.A00, (1BY) null, 100112);
        DKM A00 = DKM.A00();
        A00.A0J(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS, 0);
        A00.A0J((Object) null, A1X ? 1 : 0);
        A00.A0J(str, 2);
        A00.A0J(fEg != null ? FHp.A03(str2, fEg.A03, (F5N) null).A00 : null, 3);
        A00.A0J((Object) null, 4);
        FEK.A00(this.A01, DKM.A07(A00, (Object) null, 5), this.A02);
    }
}
