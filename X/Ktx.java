package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* loaded from: Ktx.class */
public class Ktx {
    public final Rect A00 = DKC.A0C();

    public int A00(ReboundViewPager reboundViewPager, float f) {
        double d = f;
        return (int) (reboundViewPager.A0O() ? Math.ceil(d) : Math.floor(d));
    }

    public int A01(ReboundViewPager reboundViewPager, float f) {
        double d = f;
        return (int) (reboundViewPager.A0O() ? Math.floor(d) : Math.ceil(d));
    }

    public void A02(View view, ReboundViewPager reboundViewPager, float f, int i) {
        float A0G = (reboundViewPager.A0G() * f) + (f * reboundViewPager.A00);
        if (reboundViewPager.A0G == 0S2.A01) {
            view.setTranslationY(A0G);
        } else {
            view.setTranslationX(A0G);
        }
    }

    public boolean A03(ReboundViewPager reboundViewPager, float f, float f2) {
        int childCount = reboundViewPager.getChildCount();
        boolean z = false;
        if (childCount == 0) {
            return false;
        }
        int i = (-1) >>> 1;
        int i2 = -2147483647;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= childCount) {
                if (f >= i && f <= i2) {
                    z = true;
                }
                return z;
            }
            View childAt = reboundViewPager.getChildAt(i4);
            Rect rect = this.A00;
            childAt.getHitRect(rect);
            if (rect.contains(Math.round(f), Math.round(f2))) {
                return true;
            }
            i = Math.min(i, rect.left);
            i2 = Math.max(i2, rect.right);
            i3 = i4 + 1;
        }
    }
}
