package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: Hxq.class */
public final class Hxq {
    public static final ViewGroup.MarginLayoutParams A01;
    public LinearLayoutManager A00;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        A01 = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public static boolean A00(View view) {
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition == null || !layoutTransition.isChangingLayout()) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= childCount) {
                    return false;
                }
                if (A00(viewGroup.getChildAt(i2))) {
                    break;
                }
                i = i2 + 1;
            }
        }
        return true;
    }
}
