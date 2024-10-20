package X;

import android.graphics.Rect;
import android.media.Image;
import android.util.Pair;
import java.nio.ByteBuffer;

/* loaded from: I40.class */
public final class I40 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Pair A04;
    public Float A05;
    public Long A06;
    public Long A07;
    public boolean A08;
    public byte[] A09;
    public float[] A0A;
    public RLg[] A0B;
    public Rect A0C;

    public static void A00(Image image, I41 i41, I40 i40, boolean z) {
        float[] fArr = (float[]) i41.A00(I41.A0Q);
        i40.A02(image, (Pair) i41.A00(I41.A0N), (Float) i41.A00(I41.A0M), (Long) i41.A00(I41.A0O), (Long) i41.A00(I41.A0K), fArr, z, false);
    }

    public void A01() {
        if (this.A0B != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                RLg[] rLgArr = this.A0B;
                if (i2 >= rLgArr.length) {
                    break;
                }
                RLg rLg = rLgArr[i2];
                ByteBuffer byteBuffer = rLg.A02;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                    rLg.A02 = null;
                }
                i = i2 + 1;
            }
            this.A0B = null;
        }
        this.A09 = null;
        this.A0A = null;
        this.A04 = null;
        this.A07 = null;
        this.A05 = null;
        this.A06 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r0 != r313) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(android.media.Image r302, android.util.Pair r303, java.lang.Float r304, java.lang.Long r305, java.lang.Long r306, float[] r307, boolean r308, boolean r309) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I40.A02(android.media.Image, android.util.Pair, java.lang.Float, java.lang.Long, java.lang.Long, float[], boolean, boolean):void");
    }
}
