package X;

import android.util.SparseArray;

/* loaded from: Emk.class */
public final class Emk {
    public final SparseArray A00;
    public final SparseArray A01;
    public final SparseArray A02;

    public Emk(Emk emk) {
        int i = 0;
        this.A02 = new SparseArray(emk != null ? emk.A02.size() : 0);
        this.A00 = new SparseArray(emk != null ? emk.A00.size() : 0);
        this.A01 = new SparseArray(emk != null ? emk.A01.size() : i);
    }
}
