package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;

/* loaded from: Cph.class */
public final class Cph implements DHP {
    public final /* synthetic */ ByH A00;
    public final /* synthetic */ Cq5 A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ String A03;

    public Cph(ByH byH, Cq5 cq5, SettableFuture settableFuture, String str) {
        this.A01 = cq5;
        this.A02 = settableFuture;
        this.A03 = str;
        this.A00 = byH;
    }

    public void BxJ() {
        Cq5 cq5 = this.A01;
        cq5.A06.BsT(C1323Ae1.A03, cq5, this.A00, this.A03);
    }

    public void Byh(List list, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4 && list.isEmpty()) {
            this.A02.set(ImmutableList.of());
        } else {
            this.A02.set(list);
        }
    }
}
