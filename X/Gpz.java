package X;

import android.content.Context;
import android.graphics.Rect;

/* loaded from: Gpz.class */
public final class Gpz extends IYn {
    public final int A00;
    public final Context A01;
    public final Rect A02;
    public final 1Br A03;
    public final boolean A04;
    public final int A05;
    public final Rect A06;

    public Gpz(Context context, Rect rect, Rect rect2, int i, int i2, int i3, boolean z) {
        super(rect, rect2, i, i2, i3, z, true);
        this.A04 = z;
        this.A00 = i2;
        this.A05 = i3;
        this.A02 = rect;
        this.A06 = rect2;
        this.A01 = context;
        this.A03 = 1Bu.A01(context, 67677);
    }

    public static final boolean A00(Gpz gpz) {
        FFo fFo = (FFo) 1Br.A0B(gpz.A03);
        return fFo != null && fFo.A0U;
    }

    public static final boolean A01(Gpz gpz) {
        FFo fFo = (FFo) 1Br.A0B(gpz.A03);
        return fFo != null && fFo.A0V;
    }

    public static final boolean A02(Gpz gpz) {
        FFo fFo = (FFo) 1Br.A0B(gpz.A03);
        return fFo != null && fFo.A0G;
    }

    public int B1e() {
        int i;
        if (this.A04) {
            return super.B1e();
        }
        if (!A00(this)) {
            return 0;
        }
        if (A02(this)) {
            i = B3V() + (A02(this) ? GOo.A00(this.A01.getResources()) : 0);
        } else {
            i = this.A02.left;
        }
        return i + HOT.A04;
    }

    public int B1f() {
        return (this.A04 || !A00(this)) ? super.B1f() : A02(this) ? HOT.A04 : HOT.A09 / 6;
    }

    public int B3T() {
        if (this.A04 || !A00(this)) {
            return super.B3T();
        }
        return 8388629;
    }

    public int B3U() {
        boolean z = this.A04;
        int i = this.A05;
        if (z) {
            int B3X = (i - B3X()) - HOT.A0C;
            if (!A01(this)) {
                B3X -= super.B1d();
            }
            if (this.A06 == null) {
                B3X -= this.A02.bottom;
            }
            i = B3X - B3S();
        }
        return i;
    }
}
