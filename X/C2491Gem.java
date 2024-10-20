package X;

import android.os.Bundle;
import com.facebook.inject.FbInjector;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* renamed from: X.Gem, reason: case insensitive filesystem */
/* loaded from: Gem.class */
public final class C2491Gem extends C49c {
    public static final String __redex_internal_original_name = "BugReportRunJobLogic";
    public ListenableFuture A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1ED A04;

    public C2491Gem() {
        super(FbInjector.A00());
        1ED listeningDecorator;
        this.A01 = 1Bq.A00(100305);
        1Br A00 = 1Bq.A00(16431);
        this.A02 = A00;
        1Br A002 = 1Bu.A00(16455);
        this.A03 = A002;
        if (1XR.A00()) {
            listeningDecorator = MoreExecutors.listeningDecorator(GOp.A1G(A002));
            11T.A0D(listeningDecorator);
        } else {
            listeningDecorator = AbJ.A0u(A00);
        }
        this.A04 = listeningDecorator;
    }

    @Override // X.C49c
    public boolean A03(int i) {
        ListenableFuture listenableFuture = this.A00;
        if (listenableFuture == null) {
            return false;
        }
        listenableFuture.cancel(true);
        return true;
    }

    @Override // X.C49c
    public boolean A04(Bundle bundle, C49f c49f, int i) {
        this.A00 = this.A04.D3B(new IvD(this, c49f));
        return true;
    }
}
