package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.google.common.collect.ImmutableList;

/* loaded from: Cqs.class */
public final class Cqs implements DHR {
    public final C00i A00 = AbH.A0X();

    public boolean ADX(C5n c5n) {
        if (c5n.A01 != BLs.A01) {
            return false;
        }
        53M r0 = c5n.A00;
        return r0 == 53M.A0Q || r0 == 53M.A0U;
    }

    public C91 AJH(C5n c5n) {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(ImmutableList.of((Object) new CHu(ClientDataSourceIdentifier.A0K, (ImmutableList) null)));
        ImmutableList.Builder builder2 = ImmutableList.builder();
        if (1qI.A02(C1gb.A00(AbF.A0n(this.A00))).AZk(36322796134221781L)) {
            CHu.A00(ClientDataSourceIdentifier.A0r, builder2, (ImmutableList) null);
        }
        CHu.A00(ClientDataSourceIdentifier.A06, builder2, (ImmutableList) null);
        AbG.A1U(builder2, builder);
        ImmutableList build = builder.build();
        C83 c83 = new C83();
        c83.A00(build);
        c83.A01(c5n.A02);
        return new C91(c83);
    }
}
