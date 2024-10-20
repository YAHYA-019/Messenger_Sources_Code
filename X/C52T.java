package X;

import android.content.Context;
import android.telephony.SubscriptionManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.52T, reason: invalid class name */
/* loaded from: 52T.class */
public final class C52T {
    public final Context A00;
    public final SubscriptionManager A01;
    public final 1qC A02;

    public C52T(Context context) {
        this.A00 = context;
        1qC r303 = null;
        Object systemService = context != null ? context.getSystemService("telephony_subscription_service") : null;
        11T.A0I(systemService, "null cannot be cast to non-null type android.telephony.SubscriptionManager");
        this.A01 = (SubscriptionManager) systemService;
        this.A02 = context != null ? 5Uo.A00(context) : r303;
    }

    public static final void A00(5E0 r301, java.util.Map map, int i) {
        if (i != -1) {
            Integer valueOf = Integer.valueOf(i);
            if (map.get(valueOf) == null) {
                map.put(valueOf, new ArrayList());
            }
            List list = (List) map.get(valueOf);
            if (list != null) {
                list.add(r301);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r307 == (-1)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList A01() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52T.A01():java.util.ArrayList");
    }
}
