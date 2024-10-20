package X;

import android.util.Patterns;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: F3q.class */
public abstract class F3q {
    public static final Ety A00 = new Ety(32);
    public static final Ety A01 = new Ety(128);

    public static final void A00(ELN eln, Collection collection) {
        11T.A0F(collection, 0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            11T.A0F(A0i, 0);
            int length = A0i.length();
            if (length != 0) {
                if (length > 25) {
                    A00.A00(eln, A0i);
                }
                Iterator it2 = 4YU.A19(A0i, " ", 0).iterator();
                while (it2.hasNext()) {
                    String A0i2 = AnonymousClass001.A0i(it2);
                    if (DKD.A1X(A0i2, Patterns.WEB_URL) || DKD.A1X(A0i2, Patterns.EMAIL_ADDRESS)) {
                        A01.A00(eln, A0i2);
                    }
                }
            }
        }
    }
}
