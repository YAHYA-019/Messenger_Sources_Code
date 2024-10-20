package X;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* loaded from: Eey.class */
public final class Eey {
    public final ImmutableMap A00;

    public Eey(Context context) {
        Set<Epg> set = (Set) 1Bn.A0E(context, (1BY) null, 226);
        ImmutableMap.Builder A0c = 1BK.A0c();
        for (Epg epg : set) {
            A0c.put(epg.A05, epg);
        }
        this.A00 = A0c.build();
    }
}
