package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.7lq, reason: invalid class name */
/* loaded from: 7lq.class */
public abstract class C7lq {
    public static boolean A00(Bundle bundle, Bundle bundle2) {
        if (bundle != null || bundle2 != null) {
            if (bundle == null || bundle2 == null || bundle.size() != bundle2.size()) {
                return false;
            }
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                Object obj = bundle.get(A0i);
                Object obj2 = bundle2.get(A0i);
                if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !A00((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
                if (obj == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
