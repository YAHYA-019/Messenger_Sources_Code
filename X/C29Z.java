package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.29Z, reason: invalid class name */
/* loaded from: 29Z.class */
public final class C29Z implements C29a {
    public final List A00 = new ArrayList();

    @Override // X.C29a
    public 2Ah Aug(String str) {
        List list = this.A00;
        synchronized (list) {
            list.add(str);
        }
        return 2Ah.A00;
    }
}
