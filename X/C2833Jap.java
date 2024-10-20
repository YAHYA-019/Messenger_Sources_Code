package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Jap, reason: case insensitive filesystem */
/* loaded from: Jap.class */
public final class C2833Jap extends Kue {
    public Set A00;
    public final int A01;
    public final boolean A04;
    public final boolean A05;
    public final KUI A06;
    public final /* synthetic */ LNS A07;
    public final Set A03 = 7zL.A15();
    public final MN4 A02 = LO7.A02(LNq.A00, C2856JbY.A00, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");

    public C2833Jap(LNS lns, KUI kui, int i, boolean z, boolean z2) {
        this.A07 = lns;
        this.A01 = i;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = kui;
    }

    public final void A0F() {
        Set<LNS> set = this.A03;
        if (!set.isEmpty()) {
            Set set2 = this.A00;
            if (set2 != null) {
                for (LNS lns : set) {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(lns.A0Y);
                    }
                }
            }
            set.clear();
        }
    }
}
