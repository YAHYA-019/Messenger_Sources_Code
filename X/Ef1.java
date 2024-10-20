package X;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* loaded from: Ef1.class */
public final class Ef1 {
    public final ImmutableMap A00;

    public Ef1(Context context) {
        Set<Ens> set = (Set) 1Bn.A0E(context, (1BY) null, 227);
        ImmutableMap.Builder A0c = 1BK.A0c();
        for (Ens ens : set) {
            A0c.put(ens.A03, ens);
        }
        this.A00 = A0c.build();
    }
}
