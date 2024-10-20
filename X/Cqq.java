package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: Cqq.class */
public final class Cqq implements DHR {
    public boolean ADX(C5n c5n) {
        if (c5n.A01 != BLs.A01) {
            return false;
        }
        53M r0 = c5n.A00;
        return r0 == 53M.A01 || r0 == 53M.A02;
    }

    public C91 AJH(C5n c5n) {
        ImmutableList copyOf;
        53M r0 = c5n.A00;
        53M r02 = 53M.A01;
        C83 c83 = new C83();
        if (r0 == r02) {
            ImmutableList of = ImmutableList.of((Object) new CHu(ClientDataSourceIdentifier.A0E, (ImmutableList) null), (Object) new CHu(ClientDataSourceIdentifier.A0H, (ImmutableList) null), (Object) new CHu(ClientDataSourceIdentifier.A0G, (ImmutableList) null));
            5PC r03 = (5PC) 1Bn.A0A(82526);
            ImmutableList.Builder builder = ImmutableList.builder();
            builder.m11012add((Object[]) new 53N[]{53N.A05, 53N.A0Q});
            if (C5yp.A00((C5yp) 1Br.A0B(r03.A01), 36313823933897780L)) {
                builder.m11012add((Object[]) new 53N[]{53N.A0E, 53N.A0F, 53N.A0G, 53N.A0H});
            }
            copyOf = AbI.A0t(of, ImmutableList.of((Object) new CHu(ClientDataSourceIdentifier.A06, builder.build())));
        } else {
            copyOf = ImmutableList.copyOf((Collection) ImmutableList.of((Object) new CHu(ClientDataSourceIdentifier.A0I, (ImmutableList) null)));
        }
        c83.A00(copyOf);
        return new C91(c83);
    }
}
