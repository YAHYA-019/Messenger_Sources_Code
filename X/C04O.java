package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.04O, reason: invalid class name */
/* loaded from: 04O.class */
public final class C04O {
    public static C04O A02;
    public boolean A00;
    public final List A01 = new ArrayList();

    public final void A00(04P r302) {
        11T.A0F(r302, 0);
        List list = this.A01;
        synchronized (list) {
            list.add(r302);
        }
    }
}
