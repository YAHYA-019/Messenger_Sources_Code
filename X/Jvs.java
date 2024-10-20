package X;

import android.net.Uri;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Jvs.class */
public final class Jvs extends 4tJ {
    public HashMap A02(Set set) {
        4cU B7g;
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            4tX r0 = (4tX) it.next();
            if (A01(r0) && (B7g = ((4tJ) this).A01.B7g(r0.A00())) != null) {
                File file = B7g.A00;
                if (file.exists()) {
                    A0u.put(r0, Uri.fromFile(file));
                }
            }
        }
        return A0u;
    }
}
