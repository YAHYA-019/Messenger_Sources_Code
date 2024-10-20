package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4Ak, reason: invalid class name */
/* loaded from: 4Ak.class */
public final class C4Ak {
    public static final ArrayList A02 = new ArrayList();
    public Set A00;
    public final C4Al A01 = new C4Al();

    public C4Ak() {
        Set set;
        ArrayList arrayList = A02;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                new HashSet();
            } else {
                set = (Set) arrayList.remove(arrayList.size() - 1);
            }
        }
        this.A00 = set;
    }

    public static void A00(C4Ak c4Ak, Enum r302) {
        Set set = c4Ak.A00;
        if (set == null) {
            throw AnonymousClass001.A0N("Can't modify state after build.  Create a new builder.");
        }
        Class<?> cls = r302.getClass();
        if (set.contains(cls)) {
            throw 0Pz.A05(cls.getSimpleName(), "has been set up. More than one value is not allowed from the same state type");
        }
        c4Ak.A00.add(cls);
        c4Ak.A01.A01.add(r302);
    }

    public C4Ao A01() {
        if (!this.A00.contains(C4Am.class)) {
            A00(this, C4Am.BACKGROUND);
        }
        ArrayList arrayList = A02;
        synchronized (arrayList) {
            this.A00.clear();
            arrayList.add(this.A00);
            this.A00 = null;
        }
        return new C4Ao(this.A01);
    }

    public void A02(C4Am c4Am) {
        A00(this, c4Am);
    }

    public void A03(4CC r302) {
        A00(this, r302);
    }

    public void A04(C4Ax c4Ax) {
        A00(this, c4Ax);
    }

    public void A05(C4Ay c4Ay) {
        A00(this, c4Ay);
    }
}
