package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.08v, reason: invalid class name */
/* loaded from: 08v.class */
public final class C08v {
    public final Set A00(02C r302) {
        11T.A0F(r302, 0);
        Set set = (Set) C08u.A0d.get(r302);
        if (set == null) {
            set = Collections.singleton(C08u.A01);
            11T.A0A(set);
        }
        return set;
    }
}
