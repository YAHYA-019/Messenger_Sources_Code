package X;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.066, reason: invalid class name */
/* loaded from: 066.class */
public final class AnonymousClass066 {
    public final Runnable A00;
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();
    public final java.util.Map A01 = new HashMap();

    public AnonymousClass066(Runnable runnable) {
        this.A00 = runnable;
    }

    public void A00(Menu menu) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C06j) ((C06k) it.next())).A00.A1W(menu);
        }
    }

    public void A01(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C06j) ((C06k) it.next())).A00.A1X(menu, menuInflater);
        }
    }

    public boolean A02(MenuItem menuItem) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            if (((C06j) ((C06k) it.next())).A00.A1Z(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
