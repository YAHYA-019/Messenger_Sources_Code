package X;

import java.util.Arrays;

/* loaded from: Dqy.class */
public final class Dqy extends C04v implements AYX {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Dq6 A06;
    public final GDB A07;
    public final float[] A08;
    public final GDC A09;

    public Dqy(Dq6 dq6, GDB gdb, GDC gdc, float[] fArr, float f, float f2, float f3, int i, int i2, int i3) {
        this.A09 = gdc;
        this.A07 = gdb;
        this.A03 = i;
        this.A06 = dq6;
        this.A01 = f;
        this.A04 = i2;
        this.A05 = i3;
        this.A02 = f2;
        this.A08 = fArr;
        this.A00 = f3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x013f, code lost:
    
        if (r0 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016f, code lost:
    
        if (r0 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x025a, code lost:
    
        if (r0 == r0) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AOI(android.graphics.Canvas r302, X.F9I r303) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dqy.AOI(android.graphics.Canvas, X.F9I):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.primitive.canvas.model.CanvasStroke");
        Dqy dqy = (Dqy) obj;
        if (!11T.A0O(this.A09, dqy.A09) || !11T.A0O(this.A07, dqy.A07) || this.A03 != dqy.A03 || !11T.A0O(this.A06, dqy.A06) || this.A01 != dqy.A01 || this.A04 != dqy.A04 || this.A05 != dqy.A05 || this.A02 != dqy.A02) {
            return false;
        }
        float[] fArr = this.A08;
        float[] fArr2 = dqy.A08;
        if (fArr != null) {
            if (fArr2 == null || !Arrays.equals(fArr, fArr2)) {
                return false;
            }
        } else if (fArr2 != null) {
            return false;
        }
        return this.A00 == dqy.A00;
    }

    public int hashCode() {
        int i = 0;
        int A00 = 1BL.A00((((1BL.A00((((AnonymousClass002.A05(this.A07, 1BL.A03(this.A09)) + this.A03) * 31) + AnonymousClass002.A04(this.A06)) * 31, this.A01) + this.A04) * 31) + this.A05) * 31, this.A02);
        float[] fArr = this.A08;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        }
        return ((A00 + i) * 31) + Float.floatToIntBits(this.A00);
    }
}
