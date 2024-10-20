package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* renamed from: X.6eM, reason: invalid class name */
/* loaded from: 6eM.class */
public final class C6eM {
    public final 1Br A00;
    public final ImmutableMap A01;

    public C6eM(Context context) {
        11T.A0F(context, 1);
        this.A00 = 1Bu.A01(context, 116301);
        Set<5zK> set = (Set) 1Bn.A0E(context, (1BY) null, ActionId.DISPLAYED);
        11T.A0A(set);
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        for (5zK r0 : set) {
            if (!r0.A03) {
                builder.put(r0.A00, r0.A02);
            }
        }
        ImmutableMap build = builder.build();
        11T.A0A(build);
        this.A01 = build;
    }

    public final C63j A00(6Az r302) {
        ImmutableList BDF;
        if (r302 != null && (BDF = r302.BDF()) != null) {
            1Du it = BDF.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C63j c63j = null;
                ImmutableMap immutableMap = this.A01;
                if (immutableMap.containsKey(next)) {
                    C00i c00i = (C00i) immutableMap.get(next);
                    if (c00i != null) {
                        c63j = (C63j) c00i.get();
                    }
                    if (c63j instanceof 6eN) {
                        6eN r0 = (6eN) c63j;
                        if (r302 instanceof 6Ay) {
                            1Du it2 = ((6Ay) r302).A0x().iterator();
                            while (it2.hasNext()) {
                                if (!(r0.A01.A00((6Az) it2.next()) instanceof C63i)) {
                                    break;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    if (c63j != null) {
                        return c63j;
                    }
                }
            }
        }
        return (C63j) 1Br.A0B(this.A00);
    }
}
