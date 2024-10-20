package X;

import android.graphics.Point;

/* loaded from: J0x.class */
public final class J0x implements Runnable {
    public static final String __redex_internal_original_name = "FocusController$5";
    public final /* synthetic */ Huf A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ float[] A02;

    public J0x(Huf huf, Integer num, float[] fArr) {
        this.A00 = huf;
        this.A02 = fArr;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public void run() {
        JGA jga = this.A00.A02;
        if (jga != null) {
            float[] fArr = this.A02;
            jga.BzD(fArr != null ? new Point((int) fArr[0], (int) fArr[1]) : null, this.A01);
        }
    }
}
