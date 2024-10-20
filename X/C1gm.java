package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1gm, reason: invalid class name */
/* loaded from: 1gm.class */
public final class C1gm {
    public long A00;
    public long A01;
    public final List A04 = new ArrayList();
    public final 1Br A02 = 1Bq.A00(16385);
    public final 1Br A03 = 1Bq.A00(84488);
    public final String[] A05 = {"com.facebook.push", "com.google.firebase"};

    public final void A00(C1gk c1gk) {
        11T.A0F(c1gk, 0);
        List list = this.A04;
        synchronized (list) {
            list.add(c1gk);
        }
    }
}
