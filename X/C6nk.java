package X;

import android.graphics.PathEffect;
import java.util.Arrays;

/* renamed from: X.6nk, reason: invalid class name */
/* loaded from: 6nk.class */
public final class C6nk {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public PathEffect A08;
    public float[] A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type com.facebook.litho.drawable.BorderColorDrawable.State");
            C6nk c6nk = (C6nk) obj;
            if (this.A01 != c6nk.A01 || this.A03 != c6nk.A03 || this.A02 != c6nk.A02 || this.A00 != c6nk.A00 || this.A05 != c6nk.A05 || this.A07 != c6nk.A07 || this.A06 != c6nk.A06 || this.A04 != c6nk.A04 || !11T.A0O(this.A08, c6nk.A08) || Arrays.equals(this.A09, c6nk.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A04 = ((((((((((((((((((int) this.A01) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + ((int) this.A00)) * 31) + this.A05) * 31) + this.A07) * 31) + this.A06) * 31) + this.A04) * 31) + AnonymousClass002.A04(this.A08)) * 31;
        float[] fArr = this.A09;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        }
        return A04 + i;
    }
}
