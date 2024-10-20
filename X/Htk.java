package X;

import android.util.SparseArray;

/* loaded from: Htk.class */
public final class Htk {
    public final SparseArray A00 = DKC.A0E();
    public final SparseArray A01 = DKC.A0E();
    public final SparseArray A02 = DKC.A0E();
    public final IDR A03;

    public Htk(IDR idr) {
        this.A03 = idr;
    }

    public Gun A00(int i) {
        Object obj = this.A02.get(IDR.A00(this.A03, i));
        obj.getClass();
        return (Gun) obj;
    }

    public I1R A01(int i) {
        Object obj = this.A00.get(IDR.A00(this.A03, i));
        obj.getClass();
        return (I1R) obj;
    }

    public I82 A02(int i) {
        Object obj = this.A01.get(IDR.A00(this.A03, i));
        obj.getClass();
        return (I82) obj;
    }
}
