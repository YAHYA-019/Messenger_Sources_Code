package androidx.lifecycle;

import X.C2ya;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ViewModel.class */
public abstract class ViewModel {
    public final C2ya impl = new C2ya();

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C2ya c2ya = this.impl;
        if (c2ya != null) {
            if (c2ya.A03) {
                C2ya.A00(autoCloseable);
                return;
            }
            synchronized (c2ya.A00) {
                autoCloseable2 = (AutoCloseable) c2ya.A01.put(str, autoCloseable);
            }
            C2ya.A00(autoCloseable2);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        C2ya c2ya = this.impl;
        if (c2ya != null && !c2ya.A03) {
            c2ya.A03 = true;
            synchronized (c2ya.A00) {
                Iterator it = c2ya.A01.values().iterator();
                while (it.hasNext()) {
                    C2ya.A00((AutoCloseable) it.next());
                }
                Set set = c2ya.A02;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    C2ya.A00((AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        onCleared();
    }

    public final AutoCloseable getCloseable(String str) {
        AutoCloseable autoCloseable;
        C2ya c2ya = this.impl;
        if (c2ya == null) {
            return null;
        }
        synchronized (c2ya.A00) {
            autoCloseable = (AutoCloseable) c2ya.A01.get(str);
        }
        return autoCloseable;
    }

    public void onCleared() {
    }
}
