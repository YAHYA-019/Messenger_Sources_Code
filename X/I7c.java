package X;

import android.graphics.RectF;

/* loaded from: I7c.class */
public final class I7c {
    public final int[] A07;
    public final float[] A05 = new float[2];
    public final float[] A06 = new float[2];
    public final float[] A03 = new float[2];
    public final float[] A04 = new float[2];
    public I1o A01 = null;
    public boolean A02 = false;
    public int A00 = 0;

    public I7c() {
        int[] iArr = new int[2];
        this.A07 = iArr;
        int i = 0;
        do {
            iArr[i] = -1;
            i++;
        } while (i < 2);
    }

    public static void A00(I7c i7c) {
        IDm iDm;
        if (i7c.A02) {
            return;
        }
        I1o i1o = i7c.A01;
        if (i1o != null && (iDm = i1o.A00) != null) {
            iDm.A05(i1o);
        }
        i7c.A02 = true;
    }

    public static void A01(I7c i7c) {
        IDm iDm;
        if (i7c.A02) {
            i7c.A02 = false;
            I1o i1o = i7c.A01;
            if (i1o == null || (iDm = i1o.A00) == null) {
                return;
            }
            RectF rectF = IDm.A0C;
            JKT jkt = iDm.A02;
            if (jkt == null || !iDm.A03) {
                return;
            }
            jkt.CRk(iDm.A04);
        }
    }
}
