package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Fla.class */
public final class Fla implements GKs {
    public final Er4 A00 = DKG.A0e();

    @Override // X.GKs
    public /* bridge */ /* synthetic */ Object CWh(24X r302, String str) {
        ImmutableList.Builder A0h = 4YU.A0h();
        GKs A0W = DKF.A0W(this.A00.A0I);
        Iterator it = r302.iterator();
        while (it.hasNext()) {
            A0h.m11011add(A0W.CWh(DKC.A0j(it), str));
        }
        return A0h.build();
    }
}
