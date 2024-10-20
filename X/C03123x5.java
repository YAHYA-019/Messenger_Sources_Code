package X;

import java.util.List;

/* renamed from: X.3x5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3x5.class */
public final class C03123x5 extends C2sm {
    @Override // X.C2sm
    public void A00(List list, int i) {
        int max;
        int i2;
        if (i < 0 || i > 100) {
            return;
        }
        double d = i / 100.0d;
        int i3 = 800;
        if (i >= 50) {
            i3 = 1000;
        }
        C1eF c1eF = this.A00;
        if (c1eF.A07) {
            int[] iArr = c1eF.A0A;
            int i4 = iArr[1];
            int max2 = Math.max((iArr[0] + ((int) ((i4 - r0) * d))) / 1000, i3);
            int[] iArr2 = c1eF.A0C;
            int i5 = iArr2[1];
            max = Math.max((iArr2[0] + ((int) ((i5 - r0) * d))) / 1000, i3);
            list.add(Integer.valueOf(c1eF.A00));
            list.add(Integer.valueOf(max2 * 1000));
            i2 = c1eF.A03;
        } else {
            int[] iArr3 = c1eF.A0B;
            int i6 = iArr3[1];
            max = Math.max((iArr3[0] + ((int) ((i6 - r0) * d))) / 1000, i3);
            i2 = c1eF.A02;
        }
        list.add(Integer.valueOf(i2));
        list.add(Integer.valueOf(max * 1000));
    }

    public String toString() {
        return "mediatek";
    }
}
