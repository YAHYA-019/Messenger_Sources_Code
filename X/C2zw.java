package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2zw, reason: invalid class name */
/* loaded from: 2zw.class */
public abstract class C2zw {
    public static final Long A00() {
        Set set = (Set) 1Bn.A0E((Context) null, (1BY) null, ActionId.RTMP_CONNECTION_RELEASE);
        EnumSet noneOf = EnumSet.noneOf(1mE.class);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            noneOf.addAll(((1mG) it.next()).Abf());
        }
        Iterator it2 = noneOf.iterator();
        long j = 0;
        while (true) {
            long j2 = j;
            if (!it2.hasNext()) {
                return Long.valueOf(j2);
            }
            j = j2 | (1 << ((Enum) it2.next()).ordinal());
        }
    }
}
