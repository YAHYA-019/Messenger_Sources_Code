package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: Cqu.class */
public final class Cqu implements DHR {
    public 53M A00;
    public final 1Br A01 = AbG.A0S();

    public boolean ADX(C5n c5n) {
        53M r0;
        11T.A0F(c5n, 0);
        boolean z = false;
        if (c5n.A01 == BLs.A01 && ((r0 = c5n.A00) == 53M.A0N || r0 == 53M.A0L || r0 == 53M.A0K || r0 == 53M.A0M || r0 == 53M.A0O || r0 == 53M.A0J)) {
            z = true;
        }
        return z;
    }

    public C91 AJH(C5n c5n) {
        ArrayList A11;
        11T.A0F(c5n, 0);
        this.A00 = c5n.A00;
        C00i c00i = this.A01.A00;
        if (AbH.A0p(c00i).A0Q(true)) {
            A11 = C0s8.A11(new CHu(ClientDataSourceIdentifier.A0K, (ImmutableList) null));
        } else {
            A11 = C0s8.A11(new CHu(ClientDataSourceIdentifier.A0E, (ImmutableList) null), new CHu(ClientDataSourceIdentifier.A0G, (ImmutableList) null), new CHu(ClientDataSourceIdentifier.A0F, (ImmutableList) null), new CHu(ClientDataSourceIdentifier.A0H, (ImmutableList) null));
            if (this.A00 != 53M.A0J) {
                A11.add(new CHu(ClientDataSourceIdentifier.A0x, (ImmutableList) null));
            }
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11012add((Object[]) new 53N[]{53N.A05, 53N.A0D, 53N.A0Q, 53N.A0S});
        if (AbK.A0l(c00i).AZk(36321322947002565L)) {
            builder.m11011add((Object) 53N.A03);
        }
        ImmutableList build = builder.build();
        ArrayList A0s = AnonymousClass001.A0s();
        if (this.A00 != null) {
            C1gb A0p = AbH.A0p(c00i);
            53M r0 = this.A00;
            if (r0 == null) {
                throw 1BK.A0h();
            }
            if (A0p.A0P(r0) && !AbH.A0p(c00i).A0Q(false)) {
                A0s.add(new CHu(ClientDataSourceIdentifier.A0v, (ImmutableList) null));
            }
        }
        A0s.add(new CHu(ClientDataSourceIdentifier.A06, build));
        if (!AbH.A0p(c00i).A0Q(false)) {
            A0s.add(new CHu(ClientDataSourceIdentifier.A07, build));
        }
        ImmutableList A0a = 1BL.A0a(0QD.A0O(A0s, A11));
        C83 c83 = new C83();
        c83.A00(A0a);
        c83.A01(c5n.A02);
        return new C91(c83);
    }
}
