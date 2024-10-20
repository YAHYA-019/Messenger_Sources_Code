package X;

import java.util.AbstractCollection;
import java.util.HashMap;

/* loaded from: F3s.class */
public abstract class F3s {
    public static final HashMap A01 = AnonymousClass001.A0u();
    public static final HashMap A00 = AnonymousClass001.A0u();

    public static final void A00(String str, String str2) {
        HashMap hashMap = A00;
        if (!hashMap.containsKey(str2)) {
            hashMap.put(str2, 02H.A00(new String[]{str}));
            return;
        }
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str2);
        if (abstractCollection != null) {
            abstractCollection.add(str);
        }
    }
}
