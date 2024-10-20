package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: F8n.class */
public final class F8n {
    public static final WeakHashMap A01 = new WeakHashMap();
    public final WeakReference A00;

    public F8n(View view) {
        this.A00 = 7zL.A14(view);
    }

    public boolean equals(Object obj) {
        Object obj2;
        boolean z = true;
        if (obj != this) {
            if (obj == null || !1BL.A1V(obj, this) || (obj2 = this.A00.get()) == null) {
                return false;
            }
            if (obj2 != ((F8n) obj).A00.get()) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A04(this.A00.get());
    }
}
