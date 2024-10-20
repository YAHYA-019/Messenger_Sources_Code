package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0xf, reason: invalid class name */
/* loaded from: 0xf.class */
public abstract class C0xf {
    public static void A00(Intent intent, C0w6 c0w6, boolean z) {
        Bundle extras;
        StringBuilder A0k;
        String str;
        if (intent.getExtras() == null || (extras = intent.getExtras()) == null) {
            return;
        }
        Set<String> keySet = extras.keySet();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            Object obj = extras.get(A0i);
            if (obj != null && 0Ed.class.getClassLoader().equals(obj.getClass().getClassLoader())) {
                A0s.add(A0i);
            }
        }
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            String A0i2 = AnonymousClass001.A0i(it2);
            if (z) {
                A0k = AnonymousClass001.A0k();
                str = "Found an internal class in a different-key intent but not removing: ";
            } else {
                intent.removeExtra(A0i2);
                A0k = AnonymousClass001.A0k();
                str = "Removed an internal class in a different-key intent: ";
            }
            AnonymousClass001.A1D(str, A0i2, " => ", A0k);
            c0w6.Cg0("ExternalIntentSanitization", AnonymousClass001.A0a(extras.get(A0i2), A0k), null);
        }
    }
}
