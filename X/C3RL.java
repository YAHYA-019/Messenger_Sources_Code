package X;

import android.graphics.Rect;
import com.facebook.litho.BaseMountingView;
import java.util.List;

/* renamed from: X.3RL, reason: invalid class name */
/* loaded from: 3RL.class */
public final class C3RL {
    public static final 32I A08 = new Object();
    public static final java.util.Map A09 = AnonymousClass001.A0u();
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final 25R A06;
    public final C1sr A07;

    public C3RL(25R r302, C1sr c1sr, int i, int i2, int i3, int i4, int i5) {
        this.A06 = r302;
        this.A07 = c1sr;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A05 = i5;
    }

    public final Rect A00() {
        if (this.A01 == 0 && this.A00) {
            25R r0 = this.A06;
            return new Rect(0, 0, r0.getWidth(), r0.getHeight());
        }
        int i = this.A02 + this.A03;
        int i2 = this.A04 + this.A05;
        25R r02 = this.A06;
        return new Rect(i, i2, r02.getWidth() + i, r02.getHeight() + i2);
    }

    public final BaseMountingView A01() {
        C1qq c1qq = this.A06.A00.A04;
        return (BaseMountingView) (c1qq == null ? null : c1qq.A02.AyN());
    }

    public final 1LI A02() {
        C1sr c1sr = this.A07;
        return ((1tT) c1sr.A0s.get(this.A01)).A03;
    }

    public final List A03() {
        C3RL A02;
        25R r0 = this.A06;
        if (!(r0 instanceof 26Z)) {
            int i = this.A01;
            if (i != 0) {
                int i2 = i - 1;
                if (i2 >= 0) {
                    A02 = A08.A02(r0, i2, this.A02, this.A04, this.A03, this.A05);
                    return C0s8.A12(A02);
                }
            } else {
                if (!(r0 instanceof C26v)) {
                    return 32I.A01(r0, this.A02 + this.A03, this.A04 + this.A05);
                }
                25R r02 = r0.A02.A04;
                if (r02 != null) {
                    if (r02.A01().A0s.size() != 1) {
                        int size = r02.A01().A0s.size() - 2;
                        if (size < 0) {
                            size = 0;
                        }
                        A02 = A08.A02(r02, size, r0.BL7(0), r0.BLJ(0), this.A02 + this.A03, this.A04 + this.A05);
                        return C0s8.A12(A02);
                    }
                    if (r02.A03.size() != 0) {
                        return 32I.A01(r02, this.A02 + this.A03, this.A04 + this.A05);
                    }
                }
            }
        }
        return C0ty.A00;
    }
}
