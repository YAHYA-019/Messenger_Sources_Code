package X;

import android.opengl.Matrix;

/* loaded from: I5I.class */
public class I5I {
    public static final float[] A06;
    public long A00;
    public HsT A01 = null;
    public float[] A02;
    public float[] A03;
    public float[] A04;
    public float[] A05;

    static {
        float[] A1a = GOn.A1a();
        A06 = A1a;
        Matrix.setIdentityM(A1a, 0);
    }

    public I5I() {
        float[] fArr = A06;
        this.A04 = fArr;
        this.A05 = fArr;
        this.A03 = fArr;
    }

    public HsT A00() {
        HsT hsT = this.A01;
        if (hsT != null) {
            return hsT;
        }
        throw AnonymousClass001.A0N("MutableVideoFrame not initialized, missing rgbTexture");
    }

    public void A01(HsT hsT, float[] fArr, float[] fArr2, float[] fArr3, long j) {
        A02(hsT, fArr, fArr2, fArr3, null, j);
    }

    public void A02(HsT hsT, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j) {
        this.A01 = hsT;
        if (fArr == null) {
            fArr = A06;
        }
        this.A04 = fArr;
        if (fArr2 == null) {
            fArr2 = A06;
        }
        this.A05 = fArr2;
        if (fArr3 == null) {
            fArr3 = A06;
        }
        this.A03 = fArr3;
        if (fArr4 == null) {
            fArr4 = A06;
        }
        this.A02 = fArr4;
        this.A00 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0.A01 != 36197) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            r301 = this;
            r0 = r301
            X.HsT r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L19
            r0 = r302
            int r0 = r0.A01
            r303 = r0
            r0 = 36197(0x8d65, float:5.0723E-41)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L1e
        L19:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L1e:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5I.A03():boolean");
    }
}
