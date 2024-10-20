package X;

import android.app.Service;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.01w, reason: invalid class name */
/* loaded from: 01w.class */
public abstract class C01w {
    public static final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public static void A00(Service service) {
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            ((C01f) it.next()).BtF(service);
        }
    }
}
