package X;

import android.util.SparseArray;

/* renamed from: X.1dx, reason: invalid class name */
/* loaded from: 1dx.class */
public final class C1dx {
    public static C1dx A01 = new C1dx();
    public final SparseArray A00 = new SparseArray();

    public 1fL A00(int i) {
        1fL r0;
        synchronized (this) {
            r0 = (1fL) this.A00.get(i);
        }
        return r0;
    }
}
