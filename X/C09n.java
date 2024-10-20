package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.09n, reason: invalid class name */
/* loaded from: 09n.class */
public final class C09n {
    public final List A00;

    public C09n() {
        this.A00 = Collections.synchronizedList(new ArrayList());
    }

    public C09n(int i) {
    }

    public void A00(Intent intent, String str, String str2, String str3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C09n) it.next()).A00(intent, str, str2, str3);
        }
    }
}
