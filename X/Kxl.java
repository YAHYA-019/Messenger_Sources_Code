package X;

import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: Kxl.class */
public abstract class Kxl {
    public static final CopyOnWriteArrayList A00 = JQx.A14();

    public static L7y A00(String str) {
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            L7y l7y = (L7y) it.next();
            if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                return l7y;
            }
        }
        throw JQx.A10(0Pz.A0W("No KMS client does support: ", str));
    }
}
