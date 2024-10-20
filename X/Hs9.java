package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: Hs9.class */
public final class Hs9 {
    public int A00;
    public int A01;
    public int A02;
    public List A03 = AnonymousClass001.A0s();

    public void A00() {
        synchronized (this) {
            02W.A07(AnonymousClass001.A1O(this.A01), "There are allocated frame buffers unaccounted for, we're leaking!");
            List list = this.A03;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((HsS) it.next()).A01();
            }
            list.clear();
            this.A00 = 0;
            this.A02 = 0;
        }
    }

    public void A01(HsS hsS) {
        synchronized (this) {
            if (hsS != null) {
                List list = this.A03;
                if (!list.contains(hsS)) {
                    list.add(hsS);
                    this.A01--;
                }
            }
        }
    }
}
