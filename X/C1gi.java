package X;

import com.facebook.common.network.FbNetworkManager;

/* renamed from: X.1gi, reason: invalid class name */
/* loaded from: 1gi.class */
public final class C1gi {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final C1gk A04;
    public final 1Ug A05;
    public final 04P A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C1gi() {
        1Br A00 = 1Bq.A00(16385);
        this.A03 = A00;
        this.A08 = ((2yD) A00.A00.get()).AZk(36313609185663757L);
        this.A07 = ((2yD) this.A03.A00.get()).AZk(36313609185729294L);
        this.A09 = ((2yD) this.A03.A00.get()).AZk(36313609185794831L);
        this.A01 = 1Bq.A00(16687);
        this.A00 = 1Bq.A00(16616);
        this.A02 = 1Bq.A00(66428);
        this.A06 = new 3cC(this, 2);
        this.A05 = new C3Z3(this, 2);
        this.A04 = new AnonymousClass316(this, 1);
    }

    public static final void A00(C1gi c1gi) {
        if (!c1gi.A09 || ((1Od) c1gi.A00.A00.get()).A0E()) {
            0fH.A0j("MessagingEfficiencyRefreshNetwork", 0Pz.A1C("refreshNetwork using fbNetworkManager.isCurrentlyConnected=", ((FbNetworkManager) c1gi.A01.A00.get()).A0P()));
        }
    }
}
