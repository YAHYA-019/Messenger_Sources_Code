package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: Cpi.class */
public final class Cpi implements DHP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 5O6 A01;
    public final /* synthetic */ ByH A02;
    public final /* synthetic */ Cq6 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Future A05;

    public Cpi(5O6 r302, ByH byH, Cq6 cq6, String str, Future future, int i) {
        this.A03 = cq6;
        this.A05 = future;
        this.A01 = r302;
        this.A04 = str;
        this.A00 = i;
        this.A02 = byH;
    }

    public void BxJ() {
        Cq6 cq6 = this.A03;
        String str = cq6.A02;
        String str2 = this.A04;
        if (str.equals(str2) && cq6.A00 == this.A00) {
            cq6.A0M.BsT(AbG.A0n(ImmutableList.copyOf((Collection) cq6.A05)), cq6, this.A02, str2);
        }
    }

    public void Byh(List list, boolean z, boolean z2, boolean z3, boolean z4) {
        C1b c1b;
        this.A05.cancel(true);
        5O6 r0 = this.A01;
        if (r0 != null) {
            r0.A00 = list.size();
        }
        Cq6 cq6 = this.A03;
        1qH r02 = cq6.A01;
        if (r02 != null && !z4) {
            if (z2) {
                r02.A00(r0, "issue server query end primary");
            }
            if (z3) {
                r02.A00(r0, "issue server query end secondary");
            }
            if (z) {
                r02.A00(r0, "issue server query end meta ai type ahead");
            }
        }
        String str = cq6.A02;
        String str2 = this.A04;
        if (str.equals(str2) && cq6.A00 == this.A00) {
            ByH byH = this.A02;
            if (byH == null || (c1b = byH.A01) == null || !c1b.A00(str2)) {
                if (z4 && list.isEmpty()) {
                    return;
                }
                cq6.A05 = list;
                cq6.A0M.BsT(new C1323Ae1(ImmutableList.copyOf((Collection) list), z3 ? 0S2.A0C : 0S2.A0j), cq6, byH, str2);
            }
        }
    }
}
