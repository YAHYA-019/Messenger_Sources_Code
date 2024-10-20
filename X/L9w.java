package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: L9w.class */
public final class L9w {
    public static final int A00(Context context, int i) {
        return (int) JR1.A0Y(context, i).getDimension(7zO.A0I(context));
    }

    public static final void A01(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        view.setPadding(num != null ? num.intValue() : view.getPaddingLeft(), num3 != null ? num3.intValue() : view.getPaddingTop(), num2 != null ? num2.intValue() : view.getPaddingRight(), num4 != null ? num4.intValue() : view.getPaddingBottom());
    }

    public static final void A02(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        11T.A0F(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.setMargins(num != null ? num.intValue() : marginLayoutParams.leftMargin, num3 != null ? num3.intValue() : marginLayoutParams.topMargin, num2 != null ? num2.intValue() : marginLayoutParams.rightMargin, num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin);
        view.setLayoutParams(marginLayoutParams);
    }

    public final void A03(ViewGroup viewGroup) {
        11T.A0F(viewGroup, 0);
        viewGroup.setClipToPadding(false);
        A01(viewGroup, null, null, Integer.valueOf(A00(4YU.A08(viewGroup), 2130969632)), null);
    }
}
