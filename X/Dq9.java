package X;

import java.util.Arrays;

/* loaded from: Dq9.class */
public final class Dq9 extends C04v {
    public final float A00;
    public final float A01;
    public final 1LI A02;
    public final Object A03;
    public final C00m A04;
    public final boolean A05;
    public final Object[] A06;

    public Dq9(1LI r302, Object obj, C00m c00m, Object[] objArr, float f, boolean z) {
        11T.A0F(obj, 1);
        this.A03 = obj;
        this.A02 = r302;
        this.A04 = c00m;
        this.A05 = z;
        this.A01 = -1.0f;
        this.A00 = f;
        this.A06 = objArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dq9)) {
                return false;
            }
            Dq9 dq9 = (Dq9) obj;
            if (!11T.A0O(this.A03, dq9.A03) || !11T.A0O(this.A02, dq9.A02) || !11T.A0O(this.A04, dq9.A04) || this.A05 != dq9.A05 || Float.compare(this.A01, dq9.A01) != 0 || Float.compare(this.A00, dq9.A00) != 0 || !11T.A0O(this.A06, dq9.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        int A03 = (((((1BL.A03(this.A03) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + 1237) * 31;
        if (this.A05) {
            i = 1231;
        }
        int A00 = 1BL.A00(1BL.A00((A03 + i) * 31 * 31, this.A01), this.A00);
        Object[] objArr = this.A06;
        return (A00 + (objArr == null ? 0 : Arrays.hashCode(objArr))) * 31 * 31;
    }
}
