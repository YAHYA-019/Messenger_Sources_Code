package X;

import androidx.lifecycle.Lifecycle;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.Acn, reason: case insensitive filesystem */
/* loaded from: Acn.class */
public final class C1283Acn {
    public long A00;
    public Lifecycle A01;
    public final AdB A02;

    public C1283Acn(Lifecycle lifecycle, AdB adB, long j) {
        11T.A0F(adB, 1);
        this.A02 = adB;
        this.A00 = j;
        this.A01 = lifecycle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r306v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final ListenableFuture A00() {
        long j = this.A00;
        Lifecycle lifecycle = this.A01;
        AdB adB = this.A02;
        ?? A0j = 4YU.A0j();
        AbI.A0C(adB.A00).A02(Czj.A00(A0j, adB, 48), AbH.A0t("FBLegacyBroker", "447151659733423"), j);
        ListenableFuture listenableFuture = A0j;
        if (!lifecycle.equals(C2sa.A00)) {
            listenableFuture = BTa.A00(lifecycle, (ListenableFuture) A0j);
        }
        return listenableFuture;
    }

    public final void A01(MFT mft) {
        2FR A03 = 2FR.A03(A00());
        11T.A0A(A03);
        1Kd.A0F(new LfP(this, mft, 8), A03, 2eQ.A01);
    }
}
