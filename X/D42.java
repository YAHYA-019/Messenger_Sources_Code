package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: D42.class */
public final class D42 implements 1K9 {
    public final C27 A00;

    public D42(C27 c27) {
        this.A00 = c27;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        0fH.A0r("BlockedPeopleFetcher", "Query to get a list blocked people failed", th);
        C27 c27 = this.A00;
        if (c27 != null) {
            c27.A00(th);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ImmutableCollection immutableCollection = (ImmutableCollection) obj;
        if (immutableCollection == null) {
            onFailure(AnonymousClass001.A0L(4YT.A00(712)));
            return;
        }
        C27 c27 = this.A00;
        if (c27 != null) {
            ImmutableList.Builder A0h = 4YU.A0h();
            ImmutableList.Builder A0h2 = 4YU.A0h();
            ImmutableList.Builder A0h3 = 4YU.A0h();
            1Du it = immutableCollection.iterator();
            while (it.hasNext()) {
                CIQ ciq = (CIQ) it.next();
                if (ciq.A05) {
                    A0h.m11011add((Object) ciq);
                } else {
                    A0h2.m11011add((Object) ciq);
                }
                A0h3.m11011add((Object) ciq);
            }
            ArrayList A17 = 1BK.A17(Arrays.asList(A0h3.build(), A0h2.build(), A0h.build()));
            CbT cbT = c27.A00;
            Object obj2 = A17.get(0);
            C00i c00i = cbT.A07;
            1Kd.A0D(cbT.A0C, D4q.A00(c27, 91), 1Kd.A01(1BK.A17(Arrays.asList(DBF.A00(AbF.A13(c00i), obj2, cbT, 15), DBF.A00(AbF.A13(c00i), A17.get(1), cbT, 15), DBF.A00(AbF.A13(c00i), A17.get(2), cbT, 15)))));
        }
    }
}
