package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2kx, reason: invalid class name */
/* loaded from: 2kx.class */
public class C2kx extends C2ky {
    public 2Xo A03;
    public int A02 = (-1) << (-1);
    public int A00 = 0;
    public int A01 = 0;

    public static int A00(C2kx c2kx, int i, boolean z) {
        int i2;
        RecyclerView A02;
        int i3 = c2kx.A02;
        float f = 0.0f / 0.0f;
        if (i3 == -1) {
            i2 = c2kx.A00;
        } else {
            if (i3 != 1) {
                float f2 = 0.0f / 0.0f;
                if ((i3 == ((-1) >>> 1) || 2147483646 == i3) && (A02 = c2kx.A02()) != null) {
                    View A0g = A02.A0g(A02.getWidth() / 2, A02.getHeight() / 2);
                    if (A0g != null) {
                        i2 = RecyclerView.A05(A0g);
                    }
                }
                return i;
            }
            i2 = c2kx.A01;
        }
        int i4 = i2 - 1;
        if (z) {
            i4 = i2 + 1;
        }
        return Math.max(0, i4);
    }

    public static void A01(AbstractC02843wc abstractC02843wc, C2kx c2kx, int i, int i2, boolean z) {
        2XA r0;
        RecyclerView A02 = c2kx.A02();
        if (A02 == null || (r0 = A02.A0F) == null || A02.A0X) {
            return;
        }
        if (!z) {
            if (c2kx.A02 == -1) {
                c2kx.A04(i2, 0);
                return;
            } else {
                c2kx.A05(i, false);
                return;
            }
        }
        if (abstractC02843wc == null) {
            int i3 = c2kx.A02;
            if (i3 == ((-1) << (-1))) {
                c2kx.A05(i, true);
                return;
            }
            abstractC02843wc = C2kc.A00(A02.getContext(), i3 != -1 ? i3 != 1 ? (i3 == ((-1) >>> 1) || 2147483646 == i3) ? 0S2.A0Y : 0S2.A00 : 0S2.A0N : 0S2.A0C, 0);
        }
        abstractC02843wc.A00 = i2;
        r0.A0x(abstractC02843wc);
    }

    public void A06() {
        RecyclerView A02 = A02();
        if (A02 != null) {
            A02.scrollBy(0, 18);
        }
    }

    public void A07(int i) {
        A01(null, this, i, i, true);
    }

    public void A08(C2X7 c2x7) {
        int ASi = c2x7.ASi();
        if (ASi != -1) {
            this.A00 = ASi;
        }
        int ASn = c2x7.ASn();
        if (ASn != -1) {
            this.A01 = ASn;
        }
        c2x7.getItemCount();
    }

    public void A09(boolean z) {
        2Z6 r0;
        if (this.A03 != null) {
            if (z && (r0 = super.A02) != null && !r0.A0E) {
                1sP.A00();
                r0.A08(true);
            }
            this.A03.A0M();
        }
    }
}
