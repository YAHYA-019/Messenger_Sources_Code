package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1u9, reason: invalid class name */
/* loaded from: 1u9.class */
public final class C1u9 {
    public C1lp A00;
    public final List A04 = new ArrayList();
    public final C00i A03 = new 1BQ(66516);
    public boolean A01 = false;
    public final 1KE A02 = (1KE) 1Bn.A0A(16479);

    public static void A00(C1u9 c1u9, List list, List list2) {
        List list3 = c1u9.A04;
        list3.addAll(list);
        for (Object obj : list2) {
            if (!list3.remove(obj)) {
                0fH.A0T(C1u9.class, "Unsubscribed from topic that was not subscribed: '%s'", new Object[]{obj});
            }
        }
    }
}
