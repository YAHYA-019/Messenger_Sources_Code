package X;

import android.content.res.Resources;
import com.google.common.collect.ImmutableList;

/* loaded from: C39.class */
public final class C39 {
    public final 1Br A00 = AbG.A0V();
    public final 1Br A01 = AbG.A0S();

    public 5OO A00(C2fd c2fd) {
        ImmutableList A01;
        boolean A1Y = AbF.A1Y(AbL.A0N(this.A01), 36323036638496938L);
        Integer num = 0S2.A01;
        if (A1Y) {
            ImmutableList.Builder builder = ImmutableList.builder();
            Resources A09 = 4YV.A09(this.A00);
            11T.A0F(A09, 0);
            AbH.A1S(new 5ON(4YU.A0t(A09, 2131965580), (Integer) null), (58D) null, builder, true);
            A01 = 1Fj.A01(builder);
        } else {
            ImmutableList.Builder builder2 = ImmutableList.builder();
            Resources A092 = 4YV.A09(this.A00);
            11T.A0F(A092, 0);
            AbH.A1S(new 5OV(c2fd, 4YU.A0t(A092, 2131956552)), (58D) null, builder2, true);
            A01 = 1Fj.A01(builder2);
        }
        return AbstractC1309Adm.A00(A01, num, true);
    }
}
