package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Cbz.class */
public final class Cbz implements 2TV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Cbf A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public Cbz(Cbf cbf, SettableFuture settableFuture, int i, boolean z, boolean z2) {
        this.A01 = cbf;
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = settableFuture;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        2fP r0 = (2fP) obj2;
        11T.A0F(r0, 1);
        this.A02.setException(r0.A00);
    }

    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        2Un r0 = (2Un) obj2;
        11T.A0F(r0, 1);
        ImmutableList immutableList = r0.A02.A01;
        Cbf.A01(this.A01, immutableList, this.A02, this.A00, this.A03, this.A04);
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
    }
}
