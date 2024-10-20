package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wb.class */
public class C02833wb extends AbstractC02843wc {
    public float A00;
    public PointF A03;
    public final DisplayMetrics A05;
    public final LinearInterpolator A07 = new LinearInterpolator();
    public final DecelerateInterpolator A06 = new DecelerateInterpolator();
    public boolean A04 = false;
    public int A01 = 0;
    public int A02 = 0;

    public C02833wb(Context context) {
        this.A05 = context.getResources().getDisplayMetrics();
    }

    public static void A00(View view, C02833wb c02833wb, C02853wd c02853wd, RecyclerView recyclerView, 3wX r305) {
        int[] A09 = r305.A09(view, recyclerView.A0F);
        int i = A09[0];
        int i2 = A09[1];
        int ceil = (int) Math.ceil(c02833wb.A0A(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = c02833wb.A06;
            c02853wd.A02 = i;
            c02853wd.A03 = i2;
            c02853wd.A01 = ceil;
            c02853wd.A05 = decelerateInterpolator;
            c02853wd.A06 = true;
        }
    }

    @Override // X.AbstractC02843wc
    public void A05() {
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
    }

    @Override // X.AbstractC02843wc
    public void A06(View view, C02853wd c02853wd, 2NQ r304) {
        int A0C = A0C(view, A08());
        int A0D = A0D(view, A09());
        int ceil = (int) Math.ceil(A0A((int) Math.sqrt((A0C * A0C) + (A0D * A0D))) / 0.3356d);
        if (ceil > 0) {
            int i = -A0C;
            int i2 = -A0D;
            DecelerateInterpolator decelerateInterpolator = this.A06;
            c02853wd.A02 = i;
            c02853wd.A03 = i2;
            c02853wd.A01 = ceil;
            c02853wd.A05 = decelerateInterpolator;
            c02853wd.A06 = true;
        }
    }

    public float A07(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A08() {
        PointF pointF = this.A03;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        int i = -1;
        if (f > 0.0f) {
            i = 1;
        }
        return i;
    }

    public int A09() {
        PointF pointF = this.A03;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        int i = -1;
        if (f > 0.0f) {
            i = 1;
        }
        return i;
    }

    public int A0A(int i) {
        float abs = Math.abs(i);
        if (!this.A04) {
            this.A00 = A07(this.A05);
            this.A04 = true;
        }
        return (int) Math.ceil(abs * this.A00);
    }

    public int A0B(int i, int i2, int i3, int i4, int i5) {
        int i6;
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i7 = i3 - i;
            if (i7 <= 0) {
                i6 = i4 - i2;
                if (i6 >= 0) {
                    i7 = 0;
                }
            }
            return i7;
        }
        if (i5 != 1) {
            throw AnonymousClass001.A0L("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        i6 = i4 - i2;
        return i6;
    }

    public int A0C(View view, int i) {
        2XA r0 = super.A02;
        if (r0 == null || !r0.A1b()) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return A0B((view.getLeft() - ((C2lg) view.getLayoutParams()).A02.left) - marginLayoutParams.leftMargin, view.getRight() + ((C2lg) view.getLayoutParams()).A02.right + marginLayoutParams.rightMargin, r0.A0X(), r0.A03 - r0.A0Y(), i);
    }

    public int A0D(View view, int i) {
        2XA r0 = super.A02;
        if (r0 == null || !r0.A1e()) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return A0B((view.getTop() - ((C2lg) view.getLayoutParams()).A02.top) - marginLayoutParams.topMargin, view.getBottom() + ((C2lg) view.getLayoutParams()).A02.bottom + marginLayoutParams.bottomMargin, r0.A0Z(), r0.A00 - r0.A0W(), i);
    }
}
