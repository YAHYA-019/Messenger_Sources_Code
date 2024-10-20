package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Lhw.class */
public final class Lhw implements MHY, MJG {
    public List A00;
    public volatile boolean A01;

    public boolean A57(MHY mhy) {
        if (!this.A01) {
            synchronized (this) {
                if (!this.A01) {
                    List list = this.A00;
                    if (list == null) {
                        list = AbF.A1F();
                        this.A00 = list;
                    }
                    list.add(mhy);
                    return true;
                }
            }
        }
        mhy.dispose();
        return false;
    }

    public boolean AMc(MHY mhy) {
        if (this.A01) {
            return false;
        }
        synchronized (this) {
            if (!this.A01) {
                List list = this.A00;
                if (list != null && list.remove(mhy)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void dispose() {
        if (this.A01) {
            return;
        }
        synchronized (this) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            List list = this.A00;
            this.A00 = null;
            if (list != null) {
                ArrayList arrayList = null;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((MHY) it.next()).dispose();
                    } catch (Throwable th) {
                        KYz.A00(th);
                        if (arrayList == null) {
                            arrayList = AnonymousClass001.A0s();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new LxO(arrayList);
                    }
                    Throwable th2 = (Throwable) arrayList.get(0);
                    Throwable th3 = Kxz.A00;
                    if (!(th2 instanceof Error) && !(th2 instanceof RuntimeException)) {
                        th2 = AnonymousClass001.A0U(th2);
                    }
                    throw th2;
                }
            }
        }
    }
}
