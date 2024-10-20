package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Kvw.class */
public final class Kvw {
    public static final boolean A00(Bundle bundle, Bundle bundle2, Kvw kvw) {
        if (bundle != null || bundle2 != null) {
            if (bundle == null || bundle2 == null || bundle.size() != bundle2.size()) {
                return false;
            }
            Set<String> keySet = bundle.keySet();
            Set<String> keySet2 = bundle2.keySet();
            11T.A0A(keySet2);
            if (!keySet.containsAll(keySet2)) {
                return false;
            }
            Iterator A0w = JR0.A0w(bundle);
            while (A0w.hasNext()) {
                String A0i = AnonymousClass001.A0i(A0w);
                Object obj = bundle.get(A0i);
                Object obj2 = bundle2.get(A0i);
                if (!(((obj instanceof Bundle) && (obj2 instanceof Bundle)) ? A00((Bundle) obj, (Bundle) obj2, kvw) : 11T.A0O(obj, obj2))) {
                    return false;
                }
            }
        }
        return true;
    }
}
