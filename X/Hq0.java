package X;

import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hq0.class */
public final class Hq0 {
    public boolean A00;
    public final List A02;
    public final List A03;
    public final float[] A05;
    public final HoE A06;
    public final float[] A04 = new float[16];
    public final I5I A01 = new I5I();

    public Hq0(HoE hoE, List list) {
        float[] fArr = new float[16];
        this.A05 = fArr;
        this.A06 = hoE;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A02 = A0s;
        A0s.clear();
        if (list != null) {
            for (Object obj : list) {
                if (obj != null) {
                    A0s.add(obj);
                }
            }
        }
        this.A03 = AnonymousClass001.A0s();
        this.A00 = false;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = this.A04;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }

    public void A00() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((JMr) it.next()).release();
        }
    }
}
