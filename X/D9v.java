package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D9v.class */
public final class D9v implements Runnable {
    public static final String __redex_internal_original_name = "SuggestedJoinedUnjoinedCommunityDataSource$getResultsAsync$1";
    public final /* synthetic */ ByH A00;
    public final /* synthetic */ Cq4 A01;
    public final /* synthetic */ C96 A02;
    public final /* synthetic */ ListenableFuture A03;

    public D9v(ByH byH, Cq4 cq4, C96 c96, ListenableFuture listenableFuture) {
        this.A03 = listenableFuture;
        this.A01 = cq4;
        this.A02 = c96;
        this.A00 = byH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImmutableList A0b;
        BEP bep;
        BEP bep2 = (BEP) this.A03.get();
        if (bep2 != null) {
            Cq4 cq4 = this.A01;
            boolean z = cq4.A0A;
            if (Cq4.A04(cq4, bep2, z) && (bep = (BEP) Cq4.A02(cq4).get()) != null) {
                bep2 = bep;
            }
            A0b = Cq4.A01(cq4, bep2, z);
        } else {
            A0b = 1BK.A0b();
        }
        Cq4 cq42 = this.A01;
        Cq4.A03(cq42, A0b);
        cq42.A08.BsT(new C1323Ae1(ImmutableList.of((Object) Cq4.A00(cq42, A0b)), 0S2.A0C), cq42, this.A00, this.A02);
    }
}
