package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.29u, reason: invalid class name */
/* loaded from: 29u.class */
public final class C29u {
    public final List A00 = new ArrayList();

    public final void A00(C1gp c1gp) {
        11T.A0F(c1gp, 0);
        List list = this.A00;
        synchronized (list) {
            list.add(c1gp);
        }
    }
}
