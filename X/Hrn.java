package X;

import android.net.Uri;

/* loaded from: Hrn.class */
public final class Hrn {
    public Uri A00;
    public float[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Hrn hrn = (Hrn) obj;
        this.A01.getClass();
        hrn.A01.getClass();
        float[] fArr = hrn.A01;
        int length = fArr.length;
        float[] fArr2 = this.A01;
        int length2 = fArr2.length;
        if (length != length2) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length2) {
                return 2Go.A00(this.A00, hrn.A00);
            }
            if (Float.compare(fArr[i2], fArr2[i2]) != 0) {
                return false;
            }
            i = i2 + 1;
        }
    }

    public int hashCode() {
        this.A01.getClass();
        int A04 = AnonymousClass002.A04(this.A00);
        int i = 0;
        while (true) {
            int i2 = i;
            float[] fArr = this.A01;
            if (i2 >= fArr.length) {
                return A04;
            }
            int i3 = A04 * 31;
            float f = fArr[i2];
            A04 = i3 + (f != 0.0f ? Float.floatToIntBits(f) : 0);
            i = i2 + 1;
        }
    }
}
