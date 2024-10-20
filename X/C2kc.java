package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.2kc, reason: invalid class name */
/* loaded from: 2kc.class */
public abstract class C2kc {
    public static C02833wb A00(final Context context, Integer num, final int i) {
        int i2;
        if (num != 0S2.A01 && num != 0S2.A0C && num != 0S2.A0N) {
            return num == 0S2.A0Y ? new C02833wb(context, i) { // from class: X.3wa
                public final int A00;

                {
                    this.A00 = i;
                }

                @Override // X.C02833wb
                public float A07(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // X.C02833wb
                public int A0B(int i3, int i4, int i5, int i6, int i7) {
                    return ((i5 + ((i6 - i5) / 2)) - (i3 + ((i4 - i3) / 2))) + this.A00;
                }
            } : new C02833wb(context);
        }
        switch (num.intValue()) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = -1;
                break;
            default:
                i2 = 1;
                break;
        }
        return new 33L(context, i2, i);
    }

    public static 3wX A01(int i, int i2, int i3, int i4) {
        if (i == -1) {
            return new JiI(i3, i4);
        }
        if (i == ((-1) >>> 1)) {
            return new JiG();
        }
        switch (i) {
            case 2147483645:
                return new C3054Jhn(i2);
            case 2147483646:
                return new JiH();
            default:
                return null;
        }
    }
}
